/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ruffarc.kindling.map;

import ca.ruffarc.kindling.map.tile.*;
import ca.ruffarc.kindling.screen.Screen;
import com.flowpowered.nbt.*;
import com.flowpowered.nbt.stream.NBTInputStream;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.StringTokenizer;

/**
 *
 * @author daniel
 */
public class Map {
    // This is the entire map of tiles.
    public Tile[] tiles;
    public static final int HEIGHT = 4;
    public static final int WIDTH = 4;
    
    public int height;
    public int width;
    
    public void loadFromFile(URL path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path.getPath()));
        tiles = new Tile[HEIGHT * WIDTH];
        
        String line, item;
        StringTokenizer t;
        for (int i = 0; i < HEIGHT; ++i) {
            line = bufferedReader.readLine();
            t = new StringTokenizer(line);
            
            //System.out.println("Line:" + line);
            
            for (int a = 0; a < WIDTH; ++a) {
                item = t.nextToken();
                
                //System.out.println("i:" + i + "a:" + a + " Item: " + item + " Index: " + (i * WIDTH  + a));
                
                switch (item) {
                    case "0": tiles[i * WIDTH + a] = new Grass(i, a); break;
                    case "1": tiles[i * WIDTH + a] = new Stone(i, a); break;
                }
            }
        }
    }
    
    public static Map loadFromNBT(URL path) throws IOException {
        NBTInputStream i = new NBTInputStream(path.openStream());
        CompoundTag t = (CompoundTag) i.readTag();
        i.close();
        
        Map map = new Map();
        
        CompoundMap data = ((CompoundTag) t.getValue().get("Data")).getValue();
        
        CompoundMap size = ((CompoundTag) data.get("Size")).getValue();
        map.height = ((IntTag) size.get("Height")).getValue();
        map.width = ((IntTag) size.get("Width")).getValue();
        map.tiles = new Tile[map.height * map.width];
                
        byte[] bytes = ((ByteArrayTag) data.get("Map")).getValue();
        byte value;
        int index;
        
        for (int h = 0; h < map.height; ++h) {
            for (int w = 0; w < map.width; ++w) {
                index = h * map.width + w;
                value = bytes[index];
                
                switch(value) {
                    case 0: map.tiles[index] = new Grass(h, w); break;
                    case 1: map.tiles[index] = new Stone(h, w); break;
                    case 2: map.tiles[index] = new Gravel(h, w); break;
                }
            }
        }
        
        return map;
    }
    
    public void draw(Screen screen) {       
        screen.fill(0);
        for (int i = 0; i < tiles.length; ++i) {
            tiles[i].draw(screen);
        }
    }
}
