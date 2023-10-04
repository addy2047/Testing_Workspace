package core_java;
import java.util.Scanner;

public class greaterval {
private static Scanner Sc;
public static void main(String[] args) {
	
	int x,y,z;
	Sc = new Scanner(System.in);
	System.out.println("\nenter three different values:");
	
	x=Sc.nextInt();
	y=Sc.nextInt();
	z=Sc.nextInt();
	if(x > y && x > z)
	{ 
		System.out.format("%dis greater than both values %d and %d",x,y,z);
	}
	else if(y>x && y>z)
	{ 
		System.out.format("%d is greater than both values %d and %d",y,x,z);
	}
	else if(z>x && z>y)
	{ 
		System.out.format("%d is greater than both values %d and %d",z,x,y);
	}
	else
	{
		System.out.println("either any two values or all three values are equal");
	}
	}
}
