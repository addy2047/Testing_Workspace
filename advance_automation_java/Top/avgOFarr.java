package TOP;

import java.util.Scanner;

public class avgOFarr {

	private static Scanner sc;
	public static void main(String[] args) {
		int Size, i;
		double arrSum = 0, arrAvg = 0;
		
		sc = new Scanner(System.in);		
		System.out.print("Enter the Array size = ");
		Size = sc.nextInt();
		
		double[] arr = new double[Size];
		
		System.out.format("Enter Array %d elements  = ", Size);
		for(i = 0; i < Size; i++) 
		{
			arr[i] = sc.nextDouble();
		}
		
		for(i = 0; i < Size; i++) 
		{
			arrSum = arrSum + arr[i];
		}
		arrAvg = arrSum / arr.length;
		
		System.out.format("\nThe Sum of Array Items  = %.2f", arrSum);
		System.out.format("\nThe Average of Array Items = %.2f", arrAvg);
	}
}

