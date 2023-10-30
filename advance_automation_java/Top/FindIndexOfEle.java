package TOP;
import java.util.Scanner;

public class FindIndexOfEle {

	
	 
	
	 
	
	    public static void main(String args[]) {
	        int count, num, i;
	        int[] inputArray = new int[500];
	   
	        Scanner in = new Scanner(System.in);
	   
	        System.out.println("Enter number of elements");
	        count = in.nextInt();
	        System.out.println("Enter " + 
	            count + " elements");
	        for(i = 0; i < count; i++) {
	            inputArray[i] = in.nextInt();
	        }
	 
	        System.out.println("Enter element to search");
	        num = in.nextInt();
	        
	        // Compare each element of array with numbers
	        for (i = 0; i < count ; i++) {
	            if(num == inputArray[i]){
	               System.out.println(num+" is present at index "+i);
	               break;
	            }
	        }
	   
	        if(i == count)
	           System.out.println(num + " not present in input array");
	    }
	}
	
	