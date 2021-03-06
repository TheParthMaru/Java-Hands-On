package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("BILLING SOFTWARE\n");

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of items purchased: ");
		int totalItems = scan.nextInt();

		int prices[] = new int[totalItems];
		System.out.println("Enter the prices: ");
		for (int i = 0; i < prices.length; i++) {
			System.out.println("Item " + (i + 1) + " price: ");
			prices[i] = scan.nextInt();
		}

		System.out.println("Find the price of index between 0 to " + (totalItems-1));
		int index = scan.nextInt();

		if (index > prices.length - 1) {
			System.out.println("Sorry your index is wrong");
		} else {
			System.out.println((double) prices[index]);
		}

		int totalBill = 0;
		for (int i = 0; i < prices.length; i++) {
			totalBill += prices[i];
		}

		System.out.println("Total Bill: " + (double) totalBill);

		if (totalBill > 1000) {
			System.out.println("You got 15% discount from total bill");
		} else {
			System.out.println("You got 5% discount from total bill");
		}
		scan.close();

		/*
		 * Test cases: 5, [78,345,678,56,34], 2 5, [78,345,678,56,34], 5 3,
		 * [56,290,120], 1
		 * 
		 */
	}
}
