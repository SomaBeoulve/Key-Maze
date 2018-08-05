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
public class Deur extends Object{
    private int pincode;
    
    public Deur(int posX, int posY, int pincode){
        this.setPosX(posX);
        this.setPosY(posY);
        this.setPincode(pincode);
    }
    
    public  void open(){
        this.setPosX(-1);
        this.setPosY(-1);
    }
    
    public void setPincode(int pincode){
        this.pincode=pincode;
    }
    
    public int getPincode(){
        return this.pincode;
    }
}
