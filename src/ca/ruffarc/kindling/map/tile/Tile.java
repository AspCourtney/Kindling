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
public class Tile {
    // This is a specific tile in the map.

    // The tiles heght and width -> always the same for every tile.
    public static final int HEIGHT = 32;
    public static final int WIDTH = 32;

    // The position of the tile.
    protected int x;
    protected int y;
    
    public Tile(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void draw(Screen screen) {}
    public boolean collide() { return false; }
}
