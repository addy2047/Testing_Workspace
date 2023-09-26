package oop;


	class A {

		void a()
		{
			System.out.println("First class");
			
		}
	}
		class B extends A 
		{
			void b()
			{
			
				System.out.println("Second class");
				
			}
			
		}
		public class singleInheritance {

		public static void main(String[] args)
		{	B c1 =new B();
		
			c1.a();
			c1.b();
			
	}
}
