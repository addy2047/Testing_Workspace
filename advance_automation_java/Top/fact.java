package core_java;

import java.util.Scanner;

public class fact {

	private static Scanner Sc;
	
	public static void main(String[] args) {
		
		int i,n;
		long fact=1;
		Sc =new Scanner(System.in);
		
		System.out.println("enter the number:");
		n = Sc.nextInt();
		
		for(i=1;i<=n;i++) {
			
			fact =fact*i;
			
		}
		System.out.format("\nfactorial of %d = %d\n",n,fact);
	}
}
