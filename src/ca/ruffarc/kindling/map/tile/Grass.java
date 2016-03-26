/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ruffarc.kindling.map.tile;

import ca.ruffarc.kindling.screen.Art;
import ca.ruffarc.kindling.screen.Screen;

/**
 *
 * @author daniel
 */
public class Grass extends Tile {
    private int rand;
    
    public Grass(int x, int y) {
        super(x, y);
        rand = (int)(Math.random() * 12);
    }

    @Override
    public void draw(Screen screen) {
        //screen.text("0", x * HEIGHT + X_OFFSET, y * WIDTH + Y_OFFSET);
        //screen.colourFill(Color.BLACK.getRGB(), x * WIDTH + X_OFFSET, y * HEIGHT + Y_OFFSET, WIDTH, HEIGHT);
        screen.blit(Art.Grass[rand], x * WIDTH + X_OFFSET, y * HEIGHT + Y_OFFSET);
    }

    @Override
    public boolean collide() {
        return false;
    }
    
}
