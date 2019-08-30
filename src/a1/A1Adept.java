package a1;

import java.util.Scanner;

public class A1Adept {
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int storeCount = scan.nextInt();
		
		String[] itemNames = new String[storeCount];
		
		double[] prices = new double[storeCount];
		
		String[] fnames = null;
	    
	    String[] lnames = null; 
		
		double[] totals = null;
	
		
		
		for (int i = 0; i < storeCount; i++) {
			
			itemNames[i] = scan.next();
			
		    prices[i] = scan.nextDouble();
			
			int numCust = scan.nextInt();
			
		    
		    totals = new double[numCust];
		    
			
			for (int j = 0; j < numCust; j++) {
				
				fnames = new String[numCust];
				
				lnames = new String[numCust];
			    
			    fnames[j] = scan.next();
			    
			    lnames[j] = scan.next();
			    
			    int numBought = scan.nextInt();
			    
			    int[] itemCount = new int[numBought];
				
				String[] foodNames = new String[numBought];
				
				for (int k = 0 ; k < numBought; k++) {
					
					itemCount[k] = scan.nextInt();
				
					foodNames[k] = scan.next();
					
					
				}
				
				totals[j] = calculateTotal(itemNames, prices, itemCount, foodNames);
				
				
			}
			
			int smallest = smallSpender(totals);
			
			int biggest = bigSpender(totals);
			
			double average = calculateAverage(totals);
			
			
			System.out.println("Biggest: " + fnames[biggest] + lnames[biggest] + (totals[biggest]));
			
			System.out.println("Smallest: " + fnames[smallest] + lnames[smallest] + (totals[smallest]));
			
			System.out.println("Average: " + average);
			
		}
		
		
			
			
		}
				


static double calculateTotal (String[] itemNames, double[] itemPrices, int[] itemCount, String[] foodName) {
	
	double total = 0;
	
	for (int i = 0; i < itemCount.length; i++) {
		
		for (int j = 0; j < itemNames.length; j++) {
			
			if (foodName[i].equals(itemNames[j])) {
				
				double num = itemPrices[j] * itemCount.length;
				
				total += num;
			}
		}
	}
	
	return total;
	
} 

static double calculateAverage (double[] totals) {
	
	double average = 0;
	
	double sum = 0;
	
	for (int i = 0; i < totals.length; i++) {
		
		double num = totals[i];
		
		sum += num;
		
		if (i == totals.length - 1) {
			
			average = sum / (totals.length);
		}
	}
	return average;
} 

static int smallSpender (double[] totals) {
	
	double low = totals[0];
	
	int num = 0;
	
	for (int i = 0; i < totals.length; i++) {
		
		if (totals[i] < low) {
			
			num = i;
			
			low = totals[i];
		}
	}
	

	return num;
}

static int bigSpender (double[] totals) {
	
	double hi = totals[0];
	
	int num = 0;
	
	for (int i = 0; i < totals.length; i++) {
		
		if (totals[i] > hi) {
			
			num = i;
			
			hi = totals[i];
			
		}
	}
	
	return num;
}}
