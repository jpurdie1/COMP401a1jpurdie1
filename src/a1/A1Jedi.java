package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Your code goes here.
		int numItems = scan.nextInt();
		String[] itemsArray = new String[numItems];
		int[] itemTotalArray = new int[numItems];
		int[] custDidBuyArray = new int[numItems];

		// Places store item names into an array
		for (int i = 0; i < numItems; i++) {
			itemsArray[i] = scan.next();
			scan.nextDouble();
		}
		
		int numCust = scan.nextInt();
		
		// Cycles through all customers in list
		while (numCust > 0) {
			boolean[] didBuyItemArray = new boolean[numItems];
			scan.next();
			scan.next();
			int items = scan.nextInt();
			
			// Cycles through all items bought by each customer
			while (items > 0) {
				int count = scan.nextInt();
				String itemName = scan.next();
				
				// Adds total count bought by customer to overall total count for each item
				// Verifies that item has not already been bought by customer
				for (int i = 0; i < numItems; i++) {
					if (itemsArray[i].equals(itemName)) {
						itemTotalArray[i] += count;
					}
					if (itemsArray[i].equals(itemName) && didBuyItemArray[i] == false) {
						custDidBuyArray[i] += 1;
						didBuyItemArray[i] = true;
					}
				}
				items--;
			}
			numCust--;
		}
		
		// Prints final output by cycling through every item in itemsArray
		for (int i = 0; i < numItems; i++) {
			if (custDidBuyArray[i] == 0) {
				System.out.println("No customers bought " + itemsArray[i]);
			} else {
				System.out.println(custDidBuyArray[i] + " customers bought " + itemTotalArray[i] + " " + itemsArray[i]);
			}
	
		}
		
	
	}
	
	// You can define / use static helper methods here.
}
