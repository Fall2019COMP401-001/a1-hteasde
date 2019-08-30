package a1;

import java.util.Scanner;

public class A1Adept {
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int storeCount = scan.nextInt();
		
		double[] prices = new double[storeCount];
		
		String[] itemNames = new String[storeCount];
		
		String[] fnames = null;
	    
	    String[] lnames = null; 
	    
		double avg = 0;
		
		int smally = 0;
		
		int biggie = 0;
		
		double[] totals = null;
	
		
		
		for (int i = 0; i < storeCount; i++) {
			
			itemNames[i] = scan.next();
			
		    prices[i] = scan.nextDouble();
			
			int numCust = scan.nextInt();
			
		    
		    totals = new double[numCust];
		    
			
			for (int j = 0; j < numCust; j++) {
				
				fnames = new String[numCust];
			    
			    fnames[j] = scan.next();
			    
			    lnames[j] = scan.next();
			    
			    int[] numBought = new int[numCust];
				
				numBought[j] = scan.nextInt();
				
				String[] foodNames = new String[numBought.length];
				
				for (int k = 0 ; k < numBought.length; k++) {
					
					int quantity = scan.nextInt();
				
					foodNames[k] = scan.next();
					
					
				}
				
				totals[j] = calculateTotal(itemNames, prices, numBought, foodNames);
				
				
			}
			
			avg = calculateAverage(totals);
			
			smally = smallSpender(totals);
			
			biggie = bigSpender(totals);
			
		}
		
		
		
		System.out.println("Biggest: " + fnames[biggie] + lnames[biggie] + (totals[biggie]));
		
		System.out.println("Smallest: " + fnames[smally] + lnames[smally] + (totals[smally]));
		
		System.out.println("Average: " + avg);
		
		
			
			
		}
				


static double calculateTotal (String[] itemNames, double[] itemPrices, int[] itemCount, String[] foodName) {
	
	double total = 0;
	
	for (int i = 0; i < itemCount.length; i++) {
		
		for (int j = 0; j < itemNames.length; j++) {
			
			if (foodName[i].equals(itemNames[j])) {
				
				double num = itemPrices[j] * itemCount[i];
				
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
