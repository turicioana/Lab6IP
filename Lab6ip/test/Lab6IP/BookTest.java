package Lab6IP;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author plsad
 */
public class BookTest {
    
    public BookTest() {
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
     * Test of getAuthor method, of class Book.
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        Book instance = new Book("The Secret","Rhonda Byrne","Adevar Divin", 2006);
        String expResult = "Rhonda Byrne";
        String result = instance.getAuthor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAuthor method, of class Book.
     */
    @Test
    public void testSetAuthor() {
        System.out.println("setAuthor");
        String author = "Rhonda Byrne";
        Book instance = new Book("The Secret","Rhonda Byrne","Adevar Divin", 2006);
        instance.setAuthor(author);
    }

    /**
     * Test of getEditura method, of class Book.
     */
    @Test
    public void testGetEditura() {
        System.out.println("getEditura");
        Book instance = new Book("The Secret","Rhonda Byrne","Adevar Divin", 2006);
        String expResult = "Adevar Divin";
        String result = instance.getEditura();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEditura method, of class Book.
     */
    @Test
    public void testSetEditura() {
        System.out.println("setEditura");
        String editura = "Adevar Divin";
        Book instance = new Book("The Secret","Rhonda Byrne","Adevar Divin", 2006);
        instance.setEditura(editura);
    }

    /**
     * Test of toString method, of class Book.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Book instance = new Book("The Secret","Rhonda Byrne","Adevar Divin", 2006);
        String expResult = "Book The Secret author Rhonda Byrne, editura Adevar Divin,year 2006";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}



