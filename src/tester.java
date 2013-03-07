import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Bernardo Tuso
 *
 */
public class tester{

	private int a=1,b=1,c=20;
	private main myMain = new main();
	
	@Before
    public void setUp() {
        c = a + b;
        System.out.println("@Before - setUp"+a);
    }
 
    @After
    public void tearDown() {
        System.out.println("@After - tearDown"+a);
    }
 
    @Ignore
    @Test(timeout=500)
    public void testLoop(){
    	while(true);
    }
    
    @Test
    public void testPrueba() {    	
    	assertEquals("Result", c, myMain.add(a,b));
        System.out.println("@Test - testEmptyCollection"+a);
    }
    
    @Test (expected = ArithmeticException.class)  
	public void testdivisionWithException() {  
	  int i = 1/0;
	}  
 
}
