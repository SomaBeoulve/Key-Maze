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
public class Player{
    private Key broekzak;
    private int positieX;
    private int positieY;
    
    public Player(int posX, int posY){
        this.setPosX(posX);
        this.setPosY(posY);
    }
    public void setPosX(int posX){
        this.positieX = posX;
    }
    
    public int getPosX(){
        return this.positieX;
    }
    
    public void setPosY(int posY){
        this.positieY = posY;
    }
    
    public int getPosY(){
        return this.positieY;
    }
    
    public void setBroekzak(Key broekzak){
        this.broekzak = broekzak;
    }
    
    public Key getBroekzak(){
        return this.broekzak;
    }
    
    public void raap_op(Key sleutel){
        setBroekzak(sleutel);
    }
    
    public void use_key(Deur d){
        this.broekzak.open(d);
    }
    
    public void move(Direction dir){
        switch(dir){
            case up:
                if(this.getPosY() > 0){
                    this.setPosY(this.getPosY()-1);
                }
                break;
            case down:
                if(this.getPosY()< 9){ 
                    this.setPosY(this.getPosY()+1);   
                }
                break;
            case left:
                if(this.getPosX() > 0){
                    this.setPosX(this.getPosX()-1);
                }
                break;
            case right:
                if(this.getPosX()< 9){       
                    this.setPosX(this.getPosX()+1);   
                }
                break;
        }
    }
}
