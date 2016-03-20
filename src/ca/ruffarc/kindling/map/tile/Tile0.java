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
public class Tile0 extends Tile {
    
    public Tile0(int x, int y) {
        super(x, y);
        //System.out.println("Tile1 init x:" + x + " y:" + y);
    }

    @Override
    public void draw(Screen screen) {
        screen.text("0", x * HEIGHT + X_OFFSET, y * WIDTH + Y_OFFSET);
    }

    @Override
    public boolean collide() {
        return false;
    }
    
}
