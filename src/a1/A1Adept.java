package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Your code goes here.
		int numItems = scan.nextInt();
		String[] itemsArray = new String[numItems];
		double[] pricesArray = new double[numItems];

		// Places store items and their prices into two separate arrays
		for (int i = 0; i < numItems; i++) {
			itemsArray[i] = scan.next();
			pricesArray[i] = scan.nextDouble();
		}

		int numCust = scan.nextInt();
		String[] custNamesArray = new String[numCust];
		double[] personalSumArray = new double[numCust];
		int custNameArrayCount = 0;

		// Cycles through all customers in list
		while (numCust > 0) {
			String first = scan.next();
			String last = scan.next();
			int items = scan.nextInt();
			double personalSum = 0.0;

			// Cycles through all items bought by each customer
			while (items > 0) {
				int count = scan.nextInt();
				String itemName = scan.next();

				for (int i = 0; i < numItems; i++) {
					if (itemsArray[i].equals(itemName)) {
						personalSum += count * pricesArray[i];
					}
				}
				items--;
			}
			personalSumArray[custNameArrayCount] = personalSum;
			custNamesArray[custNameArrayCount] = first + " " + last;
			custNameArrayCount++;
			numCust--;
		}

		// Prints biggest spender
		double biggest = 0.0;
		String biggestName = custNamesArray[0];
		int i = 0;
		while (i < personalSumArray.length) {
			if (personalSumArray[i] > biggest) {
				biggest = personalSumArray[i];
				biggestName = custNamesArray[i];
			}
			i++;
		}
		System.out.println("Biggest: " + biggestName + " (" + biggest + ")");
		
		// Prints smallest spender
		double smallest = 100000.0;
		String smallestName = custNamesArray[0];
		int g = 0;
		while (g < personalSumArray.length) {
			if (personalSumArray[g] < smallest) {
				smallest = personalSumArray[g];
				smallestName = custNamesArray[g];
			}
			g++;
		}
		System.out.println("Smallest: " + smallestName + " (" + smallest + ")");

		// Prints average of all spenders
		double average = 0.0;
		int j = 0;
		while (j < personalSumArray.length) {
			average += personalSumArray[j];
			j++;
		}
		average = average / personalSumArray.length;
		System.out.println("Average: " + average);
	}	
}
