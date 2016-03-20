/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ruffarc.kindling.screen;

import ca.ruffarc.kindling.gui.MainComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author daniel
 */
public class Screen {
    public BufferedImage image;
    
    public Screen() {
        image = new BufferedImage(MainComponent.GAME_WIDTH, MainComponent.GAME_HEIGHT, BufferedImage.TYPE_INT_ARGB);
    }
    
    public void text(String s, int x, int y) { 
        Graphics g = image.getGraphics();
        g.setColor(Color.BLACK);
        g.drawString(s, x, y);
        //g.fillRect(15, 15, 30, 30);
        g.dispose();
    }
    
    public void line() {
        System.out.println();
    }
}
