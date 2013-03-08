import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author Bernardo Tuso
 *
 * Useful links: www.vogella.com/articles/JUnit/article.htmlivan
 * 				 http://javarevisited.blogspot.com.ar/2012/06/junit4-annotations-test-examples-and.html
 *
 */
@RunWith(Suite.class)//Runs a bunch of test classes together
@Suite.SuiteClasses({
        extraClass.class//Runs extraClass
})
public class tester{

	private int a=1,b=1,c=20;
	private main myMain = new main(); //Class init'd to test
	
	@Before//Happens before tests - Must be called setUp
    public void setUp() {
        c = a + b;
        System.out.println("@Before - setUp");
    }
 
    @After//Happens after tests - Must be called tearDown
    public void tearDown() {
        System.out.println("@After - tearDown");
    }
 
    @Ignore//Ignore test
    @Test(timeout=500)//Timeout test
    public void testLoop(){
    	while(true);
    }
    
    @Test//Assertion test (test precedes method name by convetion)
    public void testAssertion() {    	
    	assertEquals("Result", c, myMain.add(a,b));
        System.out.println("@Test - Assertion");
    }
    
    //Expected test
    @Test (expected = ArithmeticException.class)//IllegalArgumentException.class  
	public void testDivisionWithException() {  
	  int i = 1/0;
	}  
 
    @Test
    public void testFail(){
		fail("This will fail");
    }
    
}
