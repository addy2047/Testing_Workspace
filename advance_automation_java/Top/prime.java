package core_java;

import java.util.Scanner;

public class prime {

private static Scanner Sc;
	
	public static void main(String[] args) {
		
		int i,n,count=0;
		Sc =new Scanner(System.in);
		
		System.out.println("enter the number:");
		n = Sc.nextInt();
		
		for(i=2;i<=n/2;i++) {
	
			if(n%i==0) {
				
				count++;
				break;
				
			}
		}
if(count==0 && n!=1)
{ 
	System.out.println(n+" is a prime");
	
}
else {
	System.out.println(n+" is not a prime");
}	
}
}