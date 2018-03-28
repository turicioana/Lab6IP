/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6IP;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dan
 */
public class ArticolTest {
    

    public ArticolTest() {
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

    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        Articol instance = new Articol ("Vulcanul","Barbu",1989);
        String expResult = "Barbu";
        String result = instance.getAuthor();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetAuthor() {
        System.out.println("setAuthor");
        String author = "Barbu";
        Articol instance = new Articol ("Vulcanul","Barbu",1989);
        instance.setAuthor(author);
    }


    @Test
    public void testToString() {
        System.out.println("toString");
        Articol instance = new Articol ("Vulcanul","Barbu",1989);;
        String expResult = "Articol name Vulcanul,author Barbu,year 1989";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
