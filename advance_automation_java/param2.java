package core_java;

public class param2 {
	
	int id;
	String name;
	
	public param2(int i,String n)
	{
		id=i;
		name=n;
		
	}
	void display()
	{
		System.out.println(id+" "+name);
		
	}
	public static void main(String[] args) {
		
		param2 p1 = new param2(10,"AD");
		param2 p2 = new param2(06,"sD");
			p1.display();
			p2.display();
			
			
	}
}


