package core_java;

public class copycon {

	int id;
	String name;
	
	copycon(int i, String n)
	{
		id=i;
		name=n;
		
	}
	copycon(copycon c)
	{
		System.out.println("c2 val: "+c.id+" "+c.name);
	}
	public static void main(String[] args) {
		
		copycon c1 =new copycon(10,"a");
		copycon c2 =new copycon(c1);
		
	}
}
