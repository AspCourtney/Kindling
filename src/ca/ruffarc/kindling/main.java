/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ruffarc.kindling;

import ca.ruffarc.kindling.map.Map;
import ca.ruffarc.kindling.screen.Screen;
import java.io.IOException;

/**
 *
 * @author daniel
 */
public class main {
    public static void main(String[] args) {
        Map map = new Map();
        Screen screen = new Screen();
        
        try {
            map.loadFromNBT(main.class.getResource("/maps/map.dat"));
            
            for (int i = 0; i < map.height; ++i) {
                for (int a = 0; a < map.width; ++a) {
                    map.tiles[i * map.height + a].draw(screen);
                }
                screen.line();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
