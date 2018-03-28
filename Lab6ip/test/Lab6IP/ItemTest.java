
package lab6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 */
class Test_Item {

	 @BeforeClass
	    public static void setUpClass() throws Exception {
	    }

	    @Before
	    public void setUp() throws Exception {
	    }
	 
	    
	    @Test
		public void Test_GetName() {
			System.out.println("Get Name");
			Item instance = new Item ("Doc",2009);
			String expRes = "Doc";
			String result = instance.getName();
			assertEquals(expRes,result);
			
		}

		
		@Test
		public void Test_SetName() {
			System.out.println("Set Name");
			String name = "Doc";
			Item instance = new Item ("Doc",2009);
			instance.setName(name);
		}
		
		@Test
		public void Test_GetYear() {
			System.out.println("Get Year");
			Item instance = new Item ("Doc",2009);
			Integer expRes = 2009;
			Integer result = instance.getYear();
			assertEquals(expRes,result);
			
			
		}
		
		
		@Test
		public void Test_SetYear() {
			System.out.println("Set Year");
			Integer expRes = 2009;
			Item instance = new Item ("Doc",2009);
			instance.setYear(expRes);
		}
		
		
		@Test
		public void Test_toString() {
			System.out.println("Set Year");
			Item instance = new Item("Doc",2009);
			String expRes = "Item name = Doc, year = 2009";
			String result = instance.toString();
			assertEquals(expRes,result);
	    

	    @After
	    public void tearDown() throws Exception {
	    }
	 
	    @AfterClass
	    public static void tearDownClass() throws Exception {
	    }
	
	
		
	}
	
}
