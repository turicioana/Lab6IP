package lab6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Turic Ioana
 */
public class CatalogTest {
    
    public CatalogTest() {
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
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Catalog.
     */
    @Test
    public void given_new_item_when_add_a_new_item_then_item_should_be_add() {
        System.out.println("add");
        Item maxIndex ;
        maxIndex = new Item("test",2018);
        //Arrange
        Catalog test = new Catalog(maxIndex);
        Catalog instance = new Catalog();
        //Act
        instance.add(maxIndex);
        //Assert
        assertEquals(test,instance);
        // TODO review the generated test code and remove the default call to fail.
        //fail("ADD FAILED");
    }

    /**
     * Test of list method, of class Catalog.
     */
    @Test
    public void testList() {//e ok asta
        System.out.println("list");
        Catalog instance = new Catalog();
        instance.list();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
