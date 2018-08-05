/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleutelbarricade;

import java.util.ArrayList;

/**
 *
 * @author Mike, Wouter en Raoul
 */
public class Level {
    private Startveld start;
    private Eindveld eind;
    private Player player;
    private ArrayList <Muur> muren;
    private ArrayList <Deur> deuren;
    private ArrayList <Key> keys;
    
    public Level(){
        setLevel1();
    }
    
    public void setLevel1(){
        start = new Startveld(0,0);  
        eind = new Eindveld(9,9);
        muren = new ArrayList<>();
        deuren = new ArrayList<>();
        keys = new ArrayList<>();
        muren.add(new Muur(2, 0)); 
        muren.add(new Muur(2, 1)); 
        muren.add(new Muur(2, 2)); 
        muren.add(new Muur(7, 2));
        muren.add(new Muur(8, 2));
        muren.add(new Muur(9, 2));
        muren.add(new Muur(2, 7));
        muren.add(new Muur(1, 7));
        muren.add(new Muur(0, 7));
        muren.add(new Muur(7, 7));
        muren.add(new Muur(7, 6));
        muren.add(new Muur(7, 8));
        muren.add(new Muur(7, 9));
        deuren.add(new Deur(0, 5, 200)); 
        deuren.add(new Deur(1, 5, 200)); 
        deuren.add(new Deur(2, 5, 200)); 
        deuren.add(new Deur(3, 5, 200));
        deuren.add(new Deur(4, 5, 200)); 
        deuren.add(new Deur(5, 5, 200)); 
        deuren.add(new Deur(6, 5, 200)); 
        deuren.add(new Deur(7, 5, 200)); 
        deuren.add(new Deur(8, 5, 200)); 
        deuren.add(new Deur(9, 5, 200)); 
        deuren.add(new Deur(8, 8, 50)); 
        deuren.add(new Deur(9, 8, 50)); 
        deuren.add(new Deur(8, 9, 50)); 
        deuren.add(new Deur(2, 9, 100)); 
        deuren.add(new Deur(4, 9, 100)); 
        deuren.add(new Deur(2, 8, 100)); 
        deuren.add(new Deur(3, 8, 100)); 
        deuren.add(new Deur(4, 8, 100)); 
        keys.add(new Key(9, 0, 100)); 
        keys.add(new Key(4, 2, 200));
        keys.add(new Key(3, 9, 50));
        player = new Player(0,0);
    }
    
    public void setLevel2(){
        start = new Startveld(0,0);  
        eind = new Eindveld(9,9);
        muren = new ArrayList<>();
        deuren = new ArrayList<>();
        keys = new ArrayList<>();
        muren.add(new Muur(2, 0)); 
        muren.add(new Muur(2, 1)); 
        muren.add(new Muur(2, 2));
        muren.add(new Muur(2, 3));
        muren.add(new Muur(3, 2));
        muren.add(new Muur(6, 2)); 
        muren.add(new Muur(7, 1)); 
        muren.add(new Muur(7, 0));
        muren.add(new Muur(7, 2));
        muren.add(new Muur(6, 6));
        muren.add(new Muur(3, 6)); 
        muren.add(new Muur(0, 3)); 
        muren.add(new Muur(0, 6)); 
        muren.add(new Muur(1, 6)); 
        muren.add(new Muur(2, 6)); 
        muren.add(new Muur(9, 3)); 
        muren.add(new Muur(9, 6)); 
        muren.add(new Muur(7, 6)); 
        muren.add(new Muur(8, 6)); 
        muren.add(new Muur(7, 3)); 
        muren.add(new Muur(4, 4)); 
        muren.add(new Muur(5, 4)); 
        muren.add(new Muur(3, 2)); 
        muren.add(new Muur(3, 2)); 
        muren.add(new Muur(3, 2)); 
        muren.add(new Muur(3, 2)); 
        keys.add(new Key(0, 2, 50));       
        keys.add(new Key(9, 5, 50));
        keys.add(new Key(0, 5, 100));
        keys.add(new Key(9, 2, 150));
        keys.add(new Key(5, 0, 200));
        keys.add(new Key(0, 4, 150));
        keys.add(new Key(0, 8, 250));
        deuren.add(new Deur(1, 3, 50));
        deuren.add(new Deur(2, 4, 150));
        deuren.add(new Deur(2, 5, 150));
        deuren.add(new Deur(7, 4, 150));
        deuren.add(new Deur(7, 5, 150));
        deuren.add(new Deur(4, 6, 100));
        deuren.add(new Deur(5, 6, 100));
        deuren.add(new Deur(8, 3, 50));
        deuren.add(new Deur(4, 3, 100));
        deuren.add(new Deur(5, 3, 100));
        deuren.add(new Deur(4, 2, 150));
        deuren.add(new Deur(5, 2, 150));
        deuren.add(new Deur(3, 7, 150));
        deuren.add(new Deur(3, 8, 150));
        deuren.add(new Deur(3, 9, 150));
        deuren.add(new Deur(2, 7, 200));
        deuren.add(new Deur(2, 8, 200));
        deuren.add(new Deur(2, 9, 200));
        deuren.add(new Deur(6, 9, 250));
        deuren.add(new Deur(6, 8, 250));
        deuren.add(new Deur(6, 7, 250));
        deuren.add(new Deur(4, 7, 50));
        deuren.add(new Deur(5, 7, 50));
        player = new Player(0,0);
        player.setBroekzak(null);
    }
    
    public void setLevel3(){
        start = new Startveld(0,0);  
        eind = new Eindveld(9,9);
        muren = new ArrayList<>();
        deuren = new ArrayList<>();
        keys = new ArrayList<>();
        muren.add(new Muur(0, 2)); 
        muren.add(new Muur(0, 8)); 
        muren.add(new Muur(0, 9)); 
        muren.add(new Muur(1, 5));
        muren.add(new Muur(1, 9));
        muren.add(new Muur(2, 0));
        muren.add(new Muur(2, 1));
        muren.add(new Muur(2, 2));
        muren.add(new Muur(2, 4));
        muren.add(new Muur(2, 6));
        muren.add(new Muur(3, 7));
        muren.add(new Muur(4, 0));
        muren.add(new Muur(4, 1));
        muren.add(new Muur(4, 2));
        muren.add(new Muur(4, 4));
        muren.add(new Muur(4, 5));
        muren.add(new Muur(4, 8));
        muren.add(new Muur(5, 2));
        muren.add(new Muur(5, 7));
        muren.add(new Muur(6, 2));
        muren.add(new Muur(6, 4));
        muren.add(new Muur(6, 4));
        muren.add(new Muur(6, 5));
        muren.add(new Muur(6, 6));
        muren.add(new Muur(6, 8));
        muren.add(new Muur(6, 9));
        muren.add(new Muur(8, 2));
        muren.add(new Muur(8, 4));
        muren.add(new Muur(8, 5));
        muren.add(new Muur(8, 6));
        muren.add(new Muur(8, 7));
        muren.add(new Muur(8, 8));
        muren.add(new Muur(9, 0));
        muren.add(new Muur(9, 1));
        muren.add(new Muur(9, 2));
        muren.add(new Muur(9, 8));
        keys.add(new Key(0, 1, 50));
        keys.add(new Key(1, 4, 100));
        keys.add(new Key(3, 6, 200));
        keys.add(new Key(4, 7, 350));
        keys.add(new Key(5, 1, 50));
        keys.add(new Key(5, 6, 150));
        keys.add(new Key(5, 8, 100));
        keys.add(new Key(6, 7, 150));
        keys.add(new Key(8, 0, 300));
        keys.add(new Key(3, 0, 250));
        keys.add(new Key(9, 7, 400));
        deuren.add(new Deur(1, 2, 50));
        deuren.add(new Deur(0, 5, 150));
        deuren.add(new Deur(1, 8, 300));
        deuren.add(new Deur(1, 7, 300));
        deuren.add(new Deur(1, 6, 300));
        deuren.add(new Deur(3, 2, 150));
        deuren.add(new Deur(3, 4, 100));
        deuren.add(new Deur(3, 5, 150));
        deuren.add(new Deur(4, 6, 100));
        deuren.add(new Deur(4, 9, 150));
        deuren.add(new Deur(5, 4, 200));
        deuren.add(new Deur(6, 0, 200));
        deuren.add(new Deur(6, 1, 200));
        deuren.add(new Deur(7, 2, 250));
        deuren.add(new Deur(7, 6, 50));
        deuren.add(new Deur(7, 8, 350));
        deuren.add(new Deur(8, 3, 300));
        deuren.add(new Deur(8, 9, 400));
        deuren.add(new Deur(9, 4, 50));
        player = new Player(0,0);
        player.setBroekzak(null);
    }
    
    public Startveld getStart(){
        return this.start;
    }
    
    public Eindveld getEind(){
        return this.eind;
    }
    
    public Player getPlayer(){
        return this.player;
    }
    
    public ArrayList<Muur> getMuur(){
        return this.muren;
    }
    
    public ArrayList<Deur> getDeur(){
        return this.deuren;
    }
    
    public ArrayList<Key> getKey(){
        return this.keys;
    }
}
