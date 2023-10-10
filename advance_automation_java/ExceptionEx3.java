package selenium_webdriver;

import java.io.IOException;

class M 
{
	void m() throws IOException
	{
	
		System.out.println("M Execurted");
	}
}
class N extends M
{
	void n() throws IOException
	{
		System.out.println("N Execurted");
	}
}
class P extends N
{
	void p() throws IOException
	{
		System.out.println("P Execurted");
	}
}

public class ExceptionEx3
{
	
	public static void main(String[] args) throws IOException 
	{
		
		P p1 =new P();
		
		p1.m();
		p1.n();
		p1.p();
		
	
		
	}
}
