/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ruffarc.kindling.map;

import ca.ruffarc.kindling.map.tile.*;
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
                    case "0": tiles[i * WIDTH + a] = new Tile0(i, a); break;
                    case "1": tiles[i * WIDTH + a] = new Tile1(i, a); break;
                }
            }
        }
    }
}
