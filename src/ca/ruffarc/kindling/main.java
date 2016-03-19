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
            map.loadFromFile(main.class.getResource("/maps/map.txt"));
            
            for (int i = 0; i < Map.HEIGHT; ++i) {
                for (int a = 0; a < Map.WIDTH; ++a) {
                    map.tiles[i * Map.HEIGHT + a].draw(screen);
                }
                screen.line();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
