/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleutelbarricade;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Mike, Wouter en Raoul
 * @version 2.3 5 april 2018
 */
public class SleutelBarricade extends JFrame{
    private Speelveld speelveld;
    private Sidepanel sidepanel;
    
    /**
     * constructor voor de SleutelBarricade game
     */
    public SleutelBarricade(){
        super("Sleutel Barricade!");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        //Maakt het speelveld aan
        this.speelveld = new Speelveld(this);
        add(speelveld, BorderLayout.CENTER);
        
        //Maakt de Sidepanel aan
        this.sidepanel = new Sidepanel(this);
        add(sidepanel, BorderLayout.EAST);
        
        //Hier wordt gekeken welke toets er in word geklikt
        addKeyListener(new KeyAdapter() {   
			
            @Override
            public void keyPressed(KeyEvent e) {
                String action;
                switch(e.getKeyCode()) {
                    case KeyEvent.VK_W:
                    case KeyEvent.VK_UP:
                        action = "UP";
                        speelveld.handleCommand(action);
                        break;

                    case KeyEvent.VK_S:
                    case KeyEvent.VK_DOWN:
                        action = "DOWN";
                        speelveld.handleCommand(action);
                        break;

                    case KeyEvent.VK_A:
                    case KeyEvent.VK_LEFT:
                        action = "LEFT";
                        speelveld.handleCommand(action);
                        break;

                    case KeyEvent.VK_D:
                    case KeyEvent.VK_RIGHT:
                        action = "RIGHT";
                        speelveld.handleCommand(action);
                        break;
                        
                    case KeyEvent.VK_Q:
                        System.exit(0);
                        break;
                        
                    case KeyEvent.VK_R:
                        action = "RESTART";
                        speelveld.handleCommand(action);
                        break;
                        
                    case KeyEvent.VK_N:
                        action = "NEW";
                        speelveld.handleCommand(action);
                        break;
                }  
            }
        });
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void Start(){
        speelveld.repaint();//Tekent speelveld
        sidepanel.repaint();//Tekent Sidepanel
    }
    
    public static void main(String[] args) {
        SleutelBarricade spel = new SleutelBarricade();
        spel.Start(); 
    }
    
}
