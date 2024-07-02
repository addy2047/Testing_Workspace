package test1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstTest 
{
	
	@Test
	//@Ignore
	public void t1()
	{
		assertEquals(10,20);
		assertEquals(20, 40);
	}
	
	@Test
	public void t2()
	{
		assertEquals(10,10);
	}

}