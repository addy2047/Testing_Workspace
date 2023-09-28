package oop;



	class M1
	{
		String account="Saving";
	}
	class M2 extends M1
	{
		String account="Current";
	
	void display()
	{
		System.out.println(account);
		System.out.println(super.account);
	}
}
	public class Super11 {
		public static void main(String[] args) {
			M2 e =new M2();
			e.display();		}
		
	}

