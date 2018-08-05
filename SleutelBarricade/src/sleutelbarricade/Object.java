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
public class Object {
    private int positieX;
    private int positieY;
    
    public void setPosX(int posX){
        this.positieX=posX;
    }
    
    public int getPosX(){
        return this.positieX;
    }
    
    public void setPosY(int posY){
        this.positieY=posY;
    }
    
    public int getPosY(){
        return this.positieY;
    }
}
