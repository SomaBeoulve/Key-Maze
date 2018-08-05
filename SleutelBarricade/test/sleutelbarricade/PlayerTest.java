/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleutelbarricade;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author M.J.Melein
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setPosX method, of class Player.
     */
    @Test
    public void testSetPosX() {
        System.out.println("setPosX");
        int posX = 3;
        Player instance = new Player(0,0);
        instance.setPosX(posX);
        int expResult = 3;
        int result = instance.getPosX();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPosX method, of class Player.
     */
    @Test
    public void testGetPosX() {
        System.out.println("getPosX");
        Player instance = new Player(3,0);
        int expResult = 3;
        int result = instance.getPosX();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPosY method, of class Player.
     */
    @Test
    public void testSetPosY() {
        System.out.println("setPosY");
        int posY = 3;
        Player instance = new Player(0,0);
        instance.setPosY(posY);
        int expResult = 3;
        int result = instance.getPosY();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPosY method, of class Player.
     */
    @Test
    public void testGetPosY() {
        System.out.println("getPosY");
        Player instance = new Player(0,3);
        int expResult = 3;
        int result = instance.getPosY();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBroekzak method, of class Player.
     */
    @Test
    public void testSetBroekzak() {
        System.out.println("setBroekzak");
        Key broekzak = new Key(1,1,50);
        Player instance = new Player(0,0);
        instance.setBroekzak(broekzak);
        Key expResult = broekzak;
        Key result = instance.getBroekzak();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBroekzak method, of class Player.
     */
    @Test
    public void testGetBroekzak() {
        System.out.println("getBroekzak");
        Player instance = new Player(0,0);
        Key broekzak = new Key(1,1,50);
        instance.setBroekzak(broekzak);
        Key expResult = broekzak;
        Key result = instance.getBroekzak();
        assertEquals(expResult, result);
    }

    /**
     * Test of raap_op method, of class Player.
     */
    @Test
    public void testRaap_op() {
        System.out.println("raap_op");
        Key sleutel = new Key(1,1,50);
        Player instance = new Player(0,0);
        instance.raap_op(sleutel);
        Key expResult = sleutel;
        Key result = instance.getBroekzak();
        assertEquals(expResult, result);
    }

    /**
     * Test of use_key method, of class Player.
     */
    @Test
    public void testUse_key() {
        System.out.println("use_key");
        Deur d = new Deur(0,0,50);
        Player instance = new Player(0,0);
        Key k = new Key(0,0,50);
        instance.raap_op(k);
        instance.use_key(d);
    }

    /**
     * Test of move method, of class Player.
     */
    @Test
    public void testMoveDown() {
        System.out.println("moveDown");
        Player instance = new Player(0,0);
        Direction dir = Direction.down;
        instance.move(dir);
        int expResult = 1;
        int result = instance.getPosY();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of move method, of class Player.
     */
    @Test
    public void testMoveUp() {
        System.out.println("moveUp");
        Player instance = new Player(0,3);
        Direction dir = Direction.up;
        instance.move(dir);
        int expResult = 2;
        int result = instance.getPosY();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of move method, of class Player.
     */
    @Test
    public void testMoveLeft() {
        System.out.println("moveLeft");
        Player instance = new Player(2,3);
        Direction dir = Direction.left;
        instance.move(dir);
        int expResult = 1;
        int result = instance.getPosX();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of move method, of class Player.
     */
    @Test
    public void testMoveRight() {
        System.out.println("moveUp");
        Player instance = new Player(3,3);
        Direction dir = Direction.right;
        instance.move(dir);
        int expResult = 4;
        int result = instance.getPosX();
        assertEquals(expResult, result);
    }
}
