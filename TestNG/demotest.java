package com.tng1;

import org.testng.annotations.Test;

public class demotest {

	@Test
	public void test1() {
		System.out.println("Running test 2");
	}
	@Test(dependsOnMethods = "test1")
	public void test2() {
	System.out.println("Running test 2");
	}
	@Test(dependsOnMethods = "test2")
	public void test3() {
		
	System.out.println("Running test 3");
}
}
