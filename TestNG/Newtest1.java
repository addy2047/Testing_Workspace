package com.tng1;

import org.testng.annotations.Test;

public class Newtest1 {

@Test(priority = 3)
	
	public void abcd()
	{
		System.out.println("Abcd");
	}
	
	@Test(priority = 1,expectedExceptions = ArithmeticException.class)
	public void pqrs()
	{
		System.out.println("Pqrs");
		
		int data = 10/0;
		System.out.println(data);
	}
	
	@Test(priority = 2,enabled = false)
	public void defg()
	{
		System.out.println("Defg");
	}
}
