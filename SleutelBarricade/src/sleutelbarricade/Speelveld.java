/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleutelbarricade;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Mike, Wouter en Raoul
 */
public class Speelveld extends JPanel{
    private SleutelBarricade spel;
    private Level level;
    private Startveld start;
    private Eindveld eind;
    private Player player;
    private ArrayList <Muur> muren;
    private ArrayList <Deur> deuren;
    private ArrayList <Key> keys;
    
    public static final int COLUMS=10;
    public static final int ROWS=10;
    public static final int TILESIZE=70;
    private int spellevel = 1;
    
    private Vakje[] vakjes;

    public Speelveld(SleutelBarricade spel){
        this.spel=spel;
        this.vakjes = new Vakje[ROWS * COLUMS];
        setPreferredSize(new Dimension(COLUMS * TILESIZE, ROWS * TILESIZE));
        setBackground(Color.WHITE);
        muren = new ArrayList<>();
        deuren = new ArrayList<>();
        keys = new ArrayList<>();
        level = new Level();
        setSpeelveld(); 
    }
    
    public void handleCommand(String action) {
        boolean botsing = false;
        switch (action){
            case "UP": 
                for(Muur muur : muren){
                    if (player.getPosX() == muur.getPosX() && player.getPosY()-1 == muur.getPosY()){
                        botsing = true;
                    }
                }
                for(Deur deur : deuren){
                    if (player.getPosX() == deur.getPosX() && player.getPosY()-1 == deur.getPosY() && player.getBroekzak().getPincode() != deur.getPincode()){
                        botsing = true;
                    }
                }
                if(!botsing){
                    player.move(Direction.up);
                }               
                break;
            case "LEFT": 
                for(Muur muur : muren){
                    if(player.getPosX()-1 == muur.getPosX() && player.getPosY() == muur.getPosY()){
                        botsing = true;
                    }
                }
                for(Deur deur : deuren){
                    if (player.getPosX()-1 == deur.getPosX() && player.getPosY() == deur.getPosY() && player.getBroekzak().getPincode() != deur.getPincode()){
                        botsing = true;
                    }
                }
                if(!botsing){
                    player.move(Direction.left);
                }
                break;
            case "RIGHT": 
                for(Muur muur : muren){
                    if(player.getPosX()+1 == muur.getPosX() && player.getPosY() == muur.getPosY()){
                        botsing = true;
                    }
                }
                for(Deur deur : deuren){
                    if (player.getPosX()+1 == deur.getPosX() && player.getPosY() == deur.getPosY() && player.getBroekzak().getPincode() != deur.getPincode()){
                        botsing = true;
                    }
                }
                if(!botsing){
                    player.move(Direction.right);
                }
                break;
            case "DOWN": 
                for(Muur muur : muren){
                    if(player.getPosX() == muur.getPosX() && player.getPosY()+1 == muur.getPosY()){
                        botsing = true;
                    }
                }
                for(Deur deur : deuren){
                    if (player.getPosX() == deur.getPosX() && player.getPosY()+1 == deur.getPosY() && player.getBroekzak().getPincode() != deur.getPincode()){
                        botsing = true;
                    }
                }
                if(!botsing){
                    player.move(Direction.down);
                }
                break;
            case "RESTART":
                if(spellevel == 1){
                    level.setLevel1();
                    setSpeelveld();
                }if(spellevel == 2){
                    level.setLevel2();
                    setSpeelveld();
                }if(spellevel==3){
                    level.setLevel3();
                    setSpeelveld();
                }
                break;
            case "NEW":
                level.setLevel1();
                setSpeelveld();
                break;
        }
        Key grappedKey = null;      
        for (Key key : keys){   
            if (player.getPosX() == key.getPosX() && player.getPosY() == key.getPosY()){
                grappedKey = key;
            }
        }
        if (grappedKey != null) { 
            player.raap_op(grappedKey);
            keys.remove(grappedKey);
        }
        Deur openDeur = null;   
        for (Deur deur : deuren){    
            if (player.getPosX() == deur.getPosX() && player.getPosY() == deur.getPosY()){
                openDeur = deur;
            }
        }
        if (openDeur != null) {
            player.use_key(openDeur);
        }       
        if(player.getPosX() == eind.getPosX() && player.getPosY() == eind.getPosY()){
            this.spellevel++;
            if(spellevel == 2){
                level.setLevel2();
                setSpeelveld();
            }if(spellevel==3){
                level.setLevel3();
                setSpeelveld();
            }
            if(spellevel==4){
                eind.gameOver();
            }         
        }
        if (eind.isGameOver()){
            JLabel message = new JLabel("== YOU WON ==");
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, message);
            System.exit(0);
        }
        repaint();
    }
    
    public void setSpeelveld(){
        this.start=level.getStart();
        this.eind=level.getEind();
        this.muren=level.getMuur();
        this.deuren=level.getDeur();
        this.keys=level.getKey();
        this.player=level.getPlayer();
    }
    
    @Override
    public void paint(Graphics graphics){
    super.paint(graphics);
        paintGrid(graphics);
        paintStart(start, graphics);
        paintEind(eind, graphics);
        for (Key key : keys){
            paintKey(key, graphics);
        }
        for (Deur deur : deuren){
            paintDeur(deur, graphics);
        }
        for (Muur muur : muren){
            paintMuur(muur, graphics);
        }
        paintPlayer(player, graphics);
    }
    
    public void paintGrid(Graphics graphics){
        graphics.setColor(Color.DARK_GRAY);
        graphics.drawRect(0 , 0 , getWidth() -1, getHeight() -1);
        for (int x = 0; x <COLUMS; x ++){
            for(int y = 0; y < ROWS; y++) {
                graphics.drawLine(x * TILESIZE , 0, x * TILESIZE , getHeight());
                graphics.drawLine(0 , y * TILESIZE , getWidth() , y * TILESIZE);
            }
        }
    }
    
    public void paintStart(Startveld s, Graphics g){
        int hor = s.getPosX();
        int vert = s.getPosY();
        g.setColor(Color.RED);
        g.fillRect(hor * TILESIZE, vert * TILESIZE, TILESIZE, TILESIZE);
        g.setColor(Color.BLACK);
        g.drawRect(hor * TILESIZE, vert * TILESIZE, TILESIZE, TILESIZE);
    }
    
    public void paintEind(Eindveld e, Graphics g){
        int hor = e.getPosX();
        int vert = e.getPosY();
        g.setColor(Color.GREEN);
        g.fillRect(hor * TILESIZE, vert * TILESIZE, TILESIZE, TILESIZE);
        g.setColor(Color.BLACK);
        g.drawRect(hor * TILESIZE, vert * TILESIZE, TILESIZE, TILESIZE);
    }
    
    public void paintMuur(Muur m, Graphics g){
        Color Muur = new Color(255,255,255);
        int hor = m.getPosX();
        int vert = m.getPosY();
        g.setColor(Color.BLACK);
        g.fillRect(hor * TILESIZE, vert * TILESIZE, TILESIZE, TILESIZE);
        g.setColor(Muur);
        g.drawRect(hor * TILESIZE, vert * TILESIZE, TILESIZE, TILESIZE);
    }
    
    public void paintDeur(Deur d, Graphics g){
        int hor = d.getPosX();
        int vert = d.getPosY();
        g.setColor(Color.ORANGE);
        g.fillRect(hor * TILESIZE, vert * TILESIZE, TILESIZE, TILESIZE);
        g.setColor(Color.BLACK);
        g.drawRect(hor * TILESIZE, vert * TILESIZE, TILESIZE, TILESIZE);
        g.drawString(d.getPincode()+"", hor * TILESIZE+25, vert * TILESIZE+40);
    }
    
    public void paintKey(Key k, Graphics g){
        int hor = k.getPosX();
        int vert = k.getPosY();
        g.setColor(Color.YELLOW);
        g.fillOval(hor * TILESIZE, vert * TILESIZE, TILESIZE, TILESIZE);
        g.setColor(Color.BLACK);
        g.drawOval(hor * TILESIZE, vert * TILESIZE, TILESIZE, TILESIZE);
        g.drawString(k.getPincode()+"", hor * TILESIZE+25, vert * TILESIZE+40);
    }
    
    public void paintPlayer(Player p, Graphics g){
        int hor = p.getPosX();
        int vert = p.getPosY();
        g.setColor(Color.BLUE);
        g.fillOval(hor * TILESIZE, vert * TILESIZE, TILESIZE, TILESIZE);
        g.setColor(Color.BLACK);
        g.drawOval(hor * TILESIZE, vert * TILESIZE, TILESIZE, TILESIZE);
    }

}
