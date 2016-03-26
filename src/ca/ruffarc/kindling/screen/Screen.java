/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ruffarc.kindling.screen;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

/**
 *
 * @author daniel
 */
public class Screen extends Bitmap {
    public BufferedImage image;
    private int x_offset, y_offset;
        
    public Screen(int w, int h) {
        super(w, h);
        image = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();
    }
    
    public void setOffset(int x, int y) {        
        if (x < 0 && x > -((100 * 10) - 521))
            this.x_offset = x;
        if (y < 0 && y > -((100 * 10) - 393))
            this.y_offset = y;
    }
    
    public int getX() {
        return x_offset;
    }
    
    public int getY() {
        return y_offset;
    }
    
    @Override
    public void blit(Bitmap bitmap, int x, int y) {
        super.blit(bitmap, x + x_offset, y + y_offset);
    }
}
