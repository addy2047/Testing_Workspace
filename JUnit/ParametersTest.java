package test1;

import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class ParametersTest 
	{
	
	int a;
	int b;
	int result;
	
	public ParametersTest(int a, int b, int result) {
		super();
	
		this.a=a;
		this.b=b;
		this.result=result;	
	}
	
	@Test
	public void addTest() 
	{
	Calc c = new Calc();
	int actual = c.add(a,b);
	int expected = result ;
	
	assertEquals(expected, actual);
	}	
	
	@Parameters
	public static List<Object[]> getData()
	{
		Object obj[][] = new Object[4][3];
		
		obj[0][0] = 10;
		obj[0][1] = 20;
		obj[0][2] = 30;
		
		obj[1][0] = 100;
		obj[1][1] = 200;
		obj[1][2] = 300;
		
		obj[2][0] = 110;
		obj[2][1] = 20;
		obj[2][2] = 130;
		
		obj[3][0] = 100;
		obj[3][1] = 120;
		obj[3][2] = 220;
	
		return Arrays.asList(obj);
	}
	
}