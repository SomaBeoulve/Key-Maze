/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleutelbarricade;

/**
 *
 * @author Mike, Wouter en Raoul
 */
public class Eindveld extends Object{
    private boolean gameover;
    
    public Eindveld(int posX, int posY){
        this.setPosX(posX);
        this.setPosY(posY);
        this.gameover=false;
    }
    
    public void gameOver(){
        this.gameover = true;
    }
    
    public boolean isGameOver(){
        return gameover;
    }
}
