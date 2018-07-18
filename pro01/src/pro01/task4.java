/*Write a program that finds all of the prime numbers between 2 and 100.*/

package pro01;
import java.util.ArrayList;

public class task4 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean add;

		for (int i = 1; i < 100; i++) {
			add = true;
			for (int j = 2; j <= (i / 2); j++) {
				if (i % j == 0) {
					add = false;
					break;
				}
			}
			if (add) {
				list.add(i);
			}
		}
		for (int i : list) {
			System.out.print(i + " ");
		}
	}
}
