package com.tng1;

import static org.testng.Assert.fail;

import org.testng.SkipException;

public class Category {

	 public void passTest()
	 {
		 System.out.println("passed");
	 }
	 public void failTest()
	 {
		 System.out.println("Failed");
		 fail();
	 }
	 public void skippedTest()
	 {
		 System.out.println("Skipped");
		 throw new SkipException("skipp");
	 }
	
	
}
