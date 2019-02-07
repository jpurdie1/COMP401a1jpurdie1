package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Your code goes here.
		int numCust = scan.nextInt();

		// Cycles through all customers in list
		while (numCust > 0) {

			char first = scan.next().charAt(0);
			String last = scan.next();
			int items = scan.nextInt();
			double sum = 0.0;

			// Cycles through all items bought by each customer
			while (items > 0) {

				int count = scan.nextInt();
				scan.next();
				double price = scan.nextDouble();
				sum += count * price;
				items--;
			}

			System.out.println(first + ". " + last + ": " + sum);
			numCust--;
		}

	}
}

