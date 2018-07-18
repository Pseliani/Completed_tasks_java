/*Create a program that converts meters to inches to calculate your height in inches
(one meter equals approximately 39.37 inches).*/
package pro01;

import java.util.Scanner;

public class task2 {
	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		int index = scanner.nextInt();
		double result = index * 39.27;

		System.out.printf("Height in duim: " + "%.2f", result);
	}
}
