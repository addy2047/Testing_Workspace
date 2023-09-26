package oop;

class A1
{
	void a1()
	{
		System.out.println("1st");
	}
}

class B1 extends A1
{
	void b1()
	{
		System.out.println("2nd");
	}
}
class C extends B1
{
	void c()
	{
		System.out.println("3rd");
		
	}
}
class D extends C
{
	void d()
	{
		System.out.println("4th");
	}
}
public class MultilevelIN {
	public static void main(String[] args)
	{
		D d2 = new D();
				d2.a1();
				d2.b1();
				d2.c();
				d2.d();
	}
}