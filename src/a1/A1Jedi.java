package a1;

import java.util.Scanner;

public class A1Jedi {
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int storeCount = scan.nextInt();
		
		String[] itemNames = new String[storeCount];
		
		double[] price = new double[storeCount];
		
		for (int i = 0; i < storeCount; i++) {
			
			itemNames[i] = scan.next();
			
			price[i] = scan.nextDouble();
			
		}
		
		int numCust = scan.nextInt();
		
		
		
		
	
		
		String[] fname = new String[numCust];
		
		String[] lname = new String[numCust];
		
		double[] totals = new double[numCust];
		
		int numBought = 0;
		
		int[] count = new int[storeCount];
		
		int[] itemCount = new int[numCust];
		
		String[] foodNames = new String[numCust];
		
		int[] quant = new int[storeCount];
			
			for (int j = 0; j < numCust; j++) {
				
				fname[j] = scan.next();
				
				lname[j] = scan.next();
				
				numBought = scan.nextInt();	
				
			
			
			
			
				for (int k = 0; k < numBought; k++) {
					
					itemCount[k] = scan.nextInt();
					
					foodNames[k] = scan.next();
					
					for (int p = 0; p < storeCount; p++) {
						
						count[p] += isBought(itemNames[p], foodNames[k]);
						
						quant[p] += howMany(itemNames[p], itemCount[k], foodNames[k]);
						
						
					}
					
			
					}
				
				
				
				
					
					
				}
			
		
			
			
			for (int i = 0; i < itemNames.length; i++) {
				
				if (count[i] == 0 ) {
				
				System.out.println("No customers bought " + itemNames[i]);
				
			} else {
				
				System.out.println(count[i] + " customers bought " + quant[i] + " " + itemNames[i] );
			} }
			
				
		}
			
		
			
			
			
	
		
	
	static int isBought (String itemNames, String foodNames) {
		
		
		//for (int i = 0; i < foodNames.length; i++) {
			
			if (itemNames.equals(foodNames)) {
				
				return 1;
			}
	//	}
		
		return 0;
	}
	
	
	
	static int howMany (String item, int itemCount, String foodNames) {
		
		int total = 0;
		
		//for (int i = 0; i < itemCount.length; i++) {
			
			if (item.contentEquals(foodNames)) {
				
				total = total + itemCount;
			}
		//}
			
		return total;
		
	}
	

	
}