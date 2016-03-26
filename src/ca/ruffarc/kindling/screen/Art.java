/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ruffarc.kindling.screen;

import ca.ruffarc.kindling.gui.MainComponent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author daniel
 */
public class Art {
    public static Bitmap Grass01 = load("/images/Grass.png");
    public static Bitmap Stone01 = load("/images/Stone.png");
    
    public static Bitmap[] Grass = cut("/images/Grass.png", 10);
    public static Bitmap[] Stone = cut("/images/Stone.png", 10);
    public static Bitmap[] Gravel = cut("/images/Gravel.png", 10);
    
    private static Bitmap load(String path) {
        try {
            BufferedImage bi = ImageIO.read(MainComponent.class.getResource(path));
            
            int h = bi.getHeight();
            int w = bi.getWidth();
            
            Bitmap result = new Bitmap(h, w);
            bi.getRGB(0, 0, w, h, result.pixels, 0, w);
            
            return result;
        } catch (IOException e) {
            
        }
        return null;
    }
    
    private static Bitmap[] cut(String path, int width) {
        try {
            BufferedImage bi = ImageIO.read(MainComponent.class.getResource(path));
            
            int imageW = bi.getWidth();
            int imageH = bi.getHeight();
            
            Bitmap[] result = new Bitmap[imageW / width];
            
            for (int x = 0; x < result.length; ++x) {
                result[x] = new Bitmap(width, imageH);
                bi.getRGB(x * width, 0, width, imageH, result[x].pixels, 0, width);
            }
            
            return result;
        } catch (IOException e) {
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
