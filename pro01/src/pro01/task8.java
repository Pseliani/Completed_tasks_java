/*The ASCII lowercase letters are separated from the uppercase letters by 32.
Thus, to convert a lowercase letter to uppercase, subtract 32 from it.
Use this information to write a program that reads characters from the keyboard.
Have it convert all lowercase letters to uppercase, and all uppercase letters to
lowercase, displaying the result. Make no changes to any other character. 
Have the program stop when the user enters a period. At the end, have the program 
display the number of case changes that have taken place.*/

package pro01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task8 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Enter a character:");
		char ch = ' ';
		try {
			ch = (char) br.read();

		} catch (IOException e) {
			System.out.println("Error reading from Input device");
		} ;
		System.out.println("You entered " + (ch -= 32));

	}

}
