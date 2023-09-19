package oop;

public class Student {
	
		
		int id;
		String fname,lname;
		public static void main(String[] args) {
			Student s1 = new Student();
			
			s1.id=07;
			s1.fname="ADDY";
			s1.lname="PATEL";
			
			Student s2 = new Student();
			
			s2.id=10;
			s2.fname="TARA";
			s2.lname="anyone";
			
			System.out.println(s1.id+"\n"+s1.fname+" "+s1.lname);
			System.out.println(s2.id+" "+s2.fname+" "+s2.lname);
			
	} 

}
