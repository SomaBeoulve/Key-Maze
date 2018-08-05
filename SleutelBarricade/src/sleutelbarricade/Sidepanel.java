/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleutelbarricade;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Mike, Wouter en Raoul
 */
public class Sidepanel extends JPanel {
    private static final int PANEL_WIDTH = 300;
    private SleutelBarricade sleutelbarricade;
    
        // offset variables for placement of the text and numbers in the score panel
    private static final int OFFSET_LEVEL = 200;
    private static final int OFFSET_SMALL = 20;

    //variablies for the different fonts/fontsizes we are using
    public static final Font FONT_TITLE = new Font("Steamer", Font.BOLD, 32);
    private static final Font FONT_SMALL = new Font("Steamer", Font.BOLD, 14);
    private static final Font FONT_CREDITS = new Font("Steamer", Font.BOLD, 10);
    
    public Sidepanel(SleutelBarricade sleutelbarricade) {
        this.sleutelbarricade = sleutelbarricade;
        setPreferredSize(new Dimension(PANEL_WIDTH, Speelveld.ROWS * Speelveld.TILESIZE));
        setBackground(Color.BLACK);
    }
    
    @Override
    public void paint(Graphics graphics){
    super.paint(graphics);
    
    graphics.setColor(Color.GREEN);
    graphics.setFont(FONT_TITLE);
    graphics.drawString("Sleutel Barricade", getWidth() /2 - graphics.getFontMetrics().stringWidth("Sleutel Barricade") / 2, 50);
    
    int y = OFFSET_LEVEL;    
     
    graphics.drawString("Instructions", OFFSET_SMALL, OFFSET_LEVEL);
    graphics.setFont(FONT_SMALL);
    graphics.drawString("Use WASD/Arrow keys to move player", OFFSET_SMALL, y += OFFSET_SMALL);
    graphics.drawString("Grab keys to open the doors", OFFSET_SMALL, y += OFFSET_SMALL);
    graphics.drawString("Press N to start a New game", OFFSET_SMALL, y += OFFSET_SMALL);
    graphics.drawString("Press R to Restart the level", OFFSET_SMALL, y += OFFSET_SMALL);
    graphics.drawString("Press Q to Quit the game", OFFSET_SMALL, y += OFFSET_SMALL);

    graphics.setFont(FONT_CREDITS);
    graphics.drawString("Made by: Mike, Wouter & Raoul", 10, 690);
   
    }
    
}
