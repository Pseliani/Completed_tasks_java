/*Write a program that reads characters from the keyboard until a period is received.
Have the program count the number of spaces. Report the total at the end of the program.*/

package pro01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task5 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a character:");
		
		/*char ch = 0;*/
		int count = 0;
		try {
			char ch = (char) br.read();
			while (ch == ' ') {
				count++;
			if (ch == '.') break;
			}	
			System.out.println("Count: " + count);
			
		} catch (IOException e) {
			System.out.println("Error reading from Input device");
		}
	}
}
