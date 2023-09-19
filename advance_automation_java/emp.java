package oop;

public class emp {

		int id;
		String name,gmail,mobile,city;
		
			 
			void display()
			{
				System.out.println(id+" "+name+" "+gmail+" "+mobile+" "+city);
				
			}
			public static void main(String[] args) {
			
				emp e1 = new emp();
				
				e1.id=486;
				e1.name="dfhbf";
				e1.gmail="sdbgyf@gmail.com";
				e1.mobile="6865744786";
				e1.city="baroda";
				
				
emp e2 = new emp();
				
				e2.id=574;
				e2.name="tina";
				e2.gmail="tina@gmail.com";
				e2.mobile="6545744786";
				e2.city="Rajkot6";
emp e3 = new emp();
				
				e3.id=547;
				e3.name="taapsee";
				e3.gmail="taapsee@gmail.com";
				e3.mobile="6454864786";
				e3.city="Ahamedabad";
				
				e1.display();
				e2.display();
				e3.display();
			
			
		}
}
