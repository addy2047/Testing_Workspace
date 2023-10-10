package selenium_webdriver;

public class ExceptionEx2 {

	static void validate(int age)
	{
		if(age>18)
		{
			System.out.println("eligible for vote:");
		}
		else
		{
			throw new ArithmeticException();
		}
	}
	
	public static void main(String[] args) 
	{
		
		validate(20);
		
	}
}

