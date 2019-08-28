package a1;

import java.util.Scanner;

public class A1Novice {
	

	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int total = scan.nextInt();
		
		double tPrice = 0.0;
		
		for (int i = total; i > 0; i--) {
			
			String fname = scan.next();
			
			String lname = scan.next();
			
			int amnt = scan.nextInt();
			
			tPrice = 0.0;
			
			for (int j = amnt; j > 0; j--) {
				
				int num = scan.nextInt();
				
				String itemName = scan.next();
				
				double itemPrice = scan.nextDouble();
				
				
				tPrice = tPrice + (num * itemPrice);	
				
		}
			
			
			System.out.println(fname.charAt(0) + ". " + lname + ": " + String.format("%.2f", tPrice));
		
	}
	}
	}
