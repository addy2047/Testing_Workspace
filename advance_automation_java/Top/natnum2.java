package core_java;

import java.util.Scanner;

public class natnum2 {
private static Scanner Sc;
public static void main(String[] args) {
		int i,n;
		Sc = new Scanner(System.in);
		System.out.println("first 10 natural num:");
		n = Sc.nextInt();
		
		for(i=1;i<=n;i++) 
		{
			System.out.println(i+"\n");
		}
	}
}
