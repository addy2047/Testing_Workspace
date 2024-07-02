package test1;

import org.junit.Before;
import org.junit.Test;

public class Junit_Exception 
{
	Exception1 a1=null;
	
	@Before
	public void before()
	{
		a1=new Exception1();
	}

	@Test
	(expected = ArithmeticException.class)
	public void test()
	{
		a1.divide(10,0);
	}
}