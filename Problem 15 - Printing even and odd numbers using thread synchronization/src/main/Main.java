package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter start number: ");
		Integer start = scan.nextInt();
		
		System.out.println("Enter end number");
		Integer end = scan.nextInt();
		
		Numbers num = new Numbers();
		ThreadClass obj = new ThreadClass(num, start, end);
		obj.start();
		
		scan.close();
	}
}
