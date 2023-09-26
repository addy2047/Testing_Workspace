package core_java;

public class param {

	int id;
	String name;
	
	public param(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	void display()
	{
		System.out.println(id+" "+name);
		
	}
	public static void main(String[] args) {
		
		param p1 = new param(10,"AD");
		param p2 = new param(06,"sD");
			p1.display();
			p2.display();
			
			
	}
}
