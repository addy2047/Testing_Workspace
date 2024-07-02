package test1;

import static org.junit.Assert.fail;

import org.junit.Test;

public class FirstT 
{
	
	@Test
	public void passTest()
	{
		System.out.println("This Testcase is passed");
	}
	
	@Test
	public void failTest()
	{
		System.out.println("This Testcase is Fail");
		fail();
	}
	
}
