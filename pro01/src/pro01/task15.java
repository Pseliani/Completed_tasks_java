/*Create a class that stores any number and can print it in following format (8):
 ***
*   *
*   *
 ***
*   *
*   *
 ***
*/
package pro01;

import java.util.Scanner;


public class task15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		switch (number) {
			case 1 :
				for (int i = 0; i < 4; i++) {
					System.out.println("*");
				}
				break;
			case 2 :
				for (int i = 0; i < 4; i++) {
					System.out.println("*  *");
				}
				break;
			case 3 :
				for (int i = 0; i < 4; i++) {
					System.out.println("*  *  *");
				}
				break;
			case 4 :
				for (int i = 0; i < 3; i++) {
					System.out.println("*     *");
				}
				for (int i = 0; i < 6; i++) {
					System.out.print("*");
				}
				System.out.println("*");
				for (int i = 0; i < 3; i++) {
					System.out.println("      *");
				}
				break;
			case 5 :
				for (int i = 0; i < 6; i++) {
					System.out.print("*");
				}
				System.out.println("*");
				for (int i = 0; i < 1; i++) {
					System.out.println("*");
				}
				for (int i = 0; i < 6; i++) {
					System.out.print("*");
				}
				System.out.println("*");
				for (int i = 0; i < 1; i++) {
					System.out.println("      *");
				}
				for (int i = 0; i < 6; i++) {
					System.out.print("*");
				}
				System.out.println("*");
				break;
			case 6 :
				for (int i = 0; i < 6; i++) {
					System.out.print("*");
				}
				System.out.println("*");
				for (int i = 0; i < 1; i++) {
					System.out.println("*");
				}
				for (int i = 0; i < 6; i++) {
					System.out.print("*");
				}
				System.out.println("*");
				for (int i = 0; i < 1; i++) {
					System.out.println("*     *");
				}
				for (int i = 0; i < 6; i++) {
					System.out.print("*");
				}
				System.out.println("*");
				break;
			case 7 :
				for (int i = 0; i < 6; i++) {
					System.out.print("*");
				}
				System.out.println("*");
				for (int i = 0; i < 5; i++) {
					System.out.println("      *");
				}
				break;
			case 8 :
				for (int i = 0; i < 6; i++) {
					System.out.print("*");
				}
				System.out.println("*");
				for (int i = 0; i < 1; i++) {
					System.out.println("*     *");
				}
				for (int i = 0; i < 6; i++) {
					System.out.print("*");
				}
				System.out.println("*");
				for (int i = 0; i < 1; i++) {
					System.out.println("*     *");
				}
				for (int i = 0; i < 6; i++) {
					System.out.print("*");
				}
				System.out.println("*");
				break;
			case 9 :
				for (int i = 0; i < 6; i++) {
					System.out.print("*");
				}
				System.out.println("*");
				for (int i = 0; i < 1; i++) {
					System.out.println("*     *");
				}
				for (int i = 0; i < 6; i++) {
					System.out.print("*");
				}
				System.out.println("*");
				for (int i = 0; i < 1; i++) {
					System.out.println("      *");
				}
				for (int i = 0; i < 6; i++) {
					System.out.print("*");
				}
				System.out.println("*");
				break;
		}
		System.out.println("Your number is " + number);
	}

}
