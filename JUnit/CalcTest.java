
package test1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest {
	
	@Test
	//@Ignore
	public void addTest()
	{
		Calc c = new Calc();
		int actual =  c.add(10, 20);
		int expected = 40;
		
		assertEquals(expected, actual);
	}
}
