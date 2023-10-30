package TOP;


class MyTread extends Thread {
	
	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Thread: " + i);
	            try {
	                Thread.sleep(1000); // Sleep for 1 second
	            } catch (InterruptedException e) {
	                System.out.println(e);
	            }
	        }
	    }
	}

	public class ExtendsThreadClass extends Thread 
	{
	    public static void main(String[] args) {
	    	ExtendsThreadClass myThread = new ExtendsThreadClass();
	        myThread.start(); // Start the thread

	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Main: " + i);
	            try {
	                Thread.sleep(1000); // Sleep for 1 second
	            } catch (InterruptedException e) {
	                System.out.println(e);
	            }
	        }
	    
	    }
}