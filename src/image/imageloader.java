/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package image;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author nikma
 */
public class imageloader extends javax.swing.JPanel {

    /**
     * Creates new form imageloader
     */
    BufferedImage img = null;
    double rotateangle;
    public imageloader() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
public void LoadImage(String path){
        try {
            img = ImageIO.read(new File(path));
            repaint();
        } catch (IOException ex) {
            Logger.getLogger(imageloader.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}


    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
  if(img!=null){
      Graphics2D e =  (Graphics2D)g;
      e.translate(this.getSize().width/2, this.getSize().height);
      e.rotate(Math.toRadians(rotateangle));
      e.drawImage(img, -img.getWidth()/2, -img.getHeight()/2, null);
  }
    
    
    
    }

  public void rotateangle(int angle) {
           rotateangle = angle*3.6;
           repaint();
    }

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
