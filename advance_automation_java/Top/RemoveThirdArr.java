package TOP;
import java.util.ArrayList; 

import java.util.List; 

public class RemoveThirdArr {


	    public static void main(String[] args) 

	    { 

	        // Creating an object of List interface with 
	        // reference to ArrayList class 

	        List<Integer> al = new ArrayList<>(); 

	  

	        // Adding elements to our ArrayList 
	        // using add() method 

	        al.add(10); 

	        al.add(20); 

	        al.add(30); 

	        al.add(1); 

	        al.add(2); 

	        System.out.println(al); 
	        al.remove(2); 

	        // Now element 30 is moved one position back 
	        // So element 30 is removed this time 

	        //al.remove(1); 

	        System.out.println(al); 

	    } 
	}

