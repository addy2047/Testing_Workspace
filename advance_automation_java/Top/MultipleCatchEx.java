package TOP;

class ArithmaticTest{

	int array[]={10,20,30,40};
	
	int num1 = 50;
	int num2 = 10;
	 
		
		public void multipleCatchTest(){
	
			try{
		   
		   System.out.println(num1/num2);
		   System.out.println("4th element of given array = " + array[3]);
	 
		   
		   System.out.println("5th element of given array = " + array[4]);
	      }
		  catch(ArrayIndexOutOfBoundsException e)
		  {
		     System.out.println(e);
		  }
		  catch(ArithmeticException e)
		  {
		       System.out.println(e);
		  }
		  catch(Exception e)
		  {
		     System.out.println(e);
		  }
	 
	           System.out.println("Remaining code after exception handling:");
		}
	}
	 
	public class MultipleCatchEx {
		public static void main(String args[])
		{
			ArithmaticTest obj =  new ArithmaticTest();
			obj.multipleCatchTest();
		}
	}

