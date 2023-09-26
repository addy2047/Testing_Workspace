package core_java;

public class Static {

	static int count=0;
	
	public Static()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		Static s1 =new Static();
		Static s2 =new Static();
		Static s3 =new Static();
		Static s4 =new Static();
		
	}
}
