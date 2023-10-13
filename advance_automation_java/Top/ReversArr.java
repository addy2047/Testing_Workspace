package TOP;


import java.util.Scanner;

	public class ReversArr 
	{

		private static Scanner sc;
		public static void main(String[] args) {
	
			int Size, i, j;
			
			sc = new Scanner(System.in);		
			System.out.print("Enter the size = ");
			Size = sc.nextInt();
			
			double[] a = new double[Size];
			double[] b = new double[Size];
			
			System.out.format("Enter %d elements  = ", Size);
			for(i = 0; i < Size; i++) 
			{
				a[i] = sc.nextDouble();
			}
			
			for(i = Size - 1, j = 0; i >= 0; i--, j++) 
			{
				b[j] = a[i];
			}
			
			System.out.println("\nThe Result");
			for(i = 0; i < Size; i++) 
			{
				System.out.print(b[i] + "  ");
			}
		}
	}

