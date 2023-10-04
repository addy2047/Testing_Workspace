package core_java;

class RBI
{
	int rate()
	{
		return 0;
	}
}
class SBI extends RBI
{
	int rate()
	{
		return 7;
	}
}
class ICICI extends RBI
{
	int rate()
	{
		return 8;
	}
}
class HDFC extends RBI
{
	int rate()
	{
		return 9;
	}
}


public class POverriding {

	public static void main(String[] args) {
		
		RBI r;
		
		r=new SBI();
		System.out.println(r.rate());
		
		r=new ICICI();
		System.out.println(r.rate());
	
		r=new HDFC();
		System.out.println(r.rate());
	
	}
}
