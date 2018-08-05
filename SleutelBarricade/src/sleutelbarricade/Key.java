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
public class Key extends Object{
    private int pincode;
    
    public Key(int posX, int posY, int pincode){
        this.setPosX(posX);
        this.setPosY(posY);
        this.setPincode(pincode);
    }
    
    public void open(Deur d){
        d.open();
    }
    
    public void setPincode(int pincode){
        this.pincode=pincode;
    }
    
    public int getPincode(){
        return this.pincode;
    }
}
