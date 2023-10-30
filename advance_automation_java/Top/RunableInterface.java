package TOP; 
public class RunableInterface implements Runnable {

	

	

	    public static void main(String args[]) 

	    { 

	        // create an object of Runnable target 
	    	RunableInterface AD = new RunableInterface(); 
	        // pass the runnable reference to Thread 
	        Thread t = new Thread(AD, "ADDY"); 
	        // start the thread 
	        t.start(); 
	        // get the name of the thread 

	        System.out.println(t.getName()); 

	    } 

	    @Override public void run() 

	    { 

	        System.out.println("Inside run method"); 

	    } 
	}

