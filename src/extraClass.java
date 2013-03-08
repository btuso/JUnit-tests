import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)//Will run parameter annotations
public class extraClass {

	 private int number;
	 
	 public extraClass(int number) {
	    this.number = number;
	 }

	 @Parameters //Sets parameters to be used in the tests, must return a list
	 public static Collection<Object[]> data() {
	   Object[][] data = new Object[][] { { 1 }, { 2 }, { 3 }, { 4 }, { 5 } , { 6 } , { (int)(Math.random()*100) } };
	   return Arrays.asList(data);
	 }

	 @Test
	 public void pushTest() {
	   System.out.println("Parameterized Number is : " + number);
	 }

	
	@Ignore("Not yet implemented")//This will be ignored
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
