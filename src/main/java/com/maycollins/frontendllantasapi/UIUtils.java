/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maycollins.frontendllantasapi;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JComponent;

/**
 *
 * @author Yordan
 */
public class UIUtils {  
    
    // Método estático para poder llamarlo sin crear una instancia  
    public static void rendodearComponente(JComponent componente, int radio) {
        componente.setOpaque(false);
        componente.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        componente.setBackground(componente.getBackground());
        
        componente.setBorder(new javax.swing.border.Border(){
            @Override
            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                Graphics2D g2= (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
                                    RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(componente.getBackground());
                g2.draw(new RoundRectangle2D.Double(x,y, width-1,height-1,radio,radio));
                g2.dispose();
            }
            @Override
            public Insets getBorderInsets(Component c){
                return new Insets(1,1,1,1);
            }
            @Override
            public boolean isBorderOpaque(){
                return false;
            }
                    
        });
        
    }


}