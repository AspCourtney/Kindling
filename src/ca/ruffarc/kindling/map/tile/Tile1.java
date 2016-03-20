/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ruffarc.kindling.map.tile;

import ca.ruffarc.kindling.screen.Screen;

/**
 *
 * @author daniel
 */
public class Tile1 extends Tile {
    
    public Tile1(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Screen screen) {
        screen.text("1", x * HEIGHT, y * WIDTH);
    }

    @Override
    public boolean collide() {
        return false;
    }
}
