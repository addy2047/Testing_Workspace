package selenium_webdriver;

import java.util.Scanner;
public class greedymeth {

	
		public static void main(String[] args) {
			
			
			int math,Sci,Eng,hindi,guj,total;
			
			Scanner sc =new Scanner(System.in);
			
			System.out.println("Enter Marks for Math");
			math = sc.nextInt();
			
			System.out.println("Enter Marks for Sci");
			Sci = sc.nextInt();
			
			System.out.println("Enter Marks for Eng");
			Eng = sc.nextInt();
			
			System.out.println("Enter Marks for Hindi");
			hindi = sc.nextInt();
			
			System.out.println("Enter Marks for Gujarati");
			guj = sc.nextInt();
			
			total = math+Sci+Eng+hindi+guj;
			
			System.out.println(total);
			
			float per = total/5;
			
			System.out.println(per);
			
		}
	}

