package test1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Annotation {

	
	@BeforeClass
	public static void Beforeclass()
	{
		System.out.println("before class m");
	}
	@Before
	public void before()
	{
		System.out.println("before test m");
	}
	@Test
	public void Test()
	{
		System.out.println("Test class m");
	}
	@Test
	@Ignore
	public void TestI()
	{
		System.out.println("Test I m");
	}
	@After
	public void after()
	{
		System.out.println("after test m");
	}
	@AfterClass
	public static void Afterclass()
	{
		System.out.println("after class m");
	}
	
}
