package selenium_webdriver;

import java.util.Scanner;

public class Arr3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values");
		int value = sc.nextInt();
		
		int arr[] =new int[value];
		int num[] = new int[value];
		for(int i=1;i<value;i++)
		{
			System.out.println("enter the numbers");
			num[i] = sc.nextInt();
		}
		for(int i=0;i<value;i++)
		{
			System.out.println(num[i]);
		}
				
				
	}
}
