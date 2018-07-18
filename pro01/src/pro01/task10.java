/*Write a program that uses an array to find the lowest/highest value among 20 
integer values. Use 20 random integers (0..100) to fill the array.*/

package pro01;

import java.io.IOException;
import java.util.ArrayList;

public class task10 {

	public static void main(String[] args) throws IOException{
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 19; i++) {
			list.add((int) (Math.random() * 10));
		}
		int m = max(list);
		int n = min(list);
		
		System.out.println("Содержание списка " + list);
		System.out.println("Максимальное значение: " + m);
		System.out.println("Минимальное занчение: " + n);
	}
	
	public static int max(ArrayList<Integer> list) {
		int a = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			int k = list.get(i);
			if (k > a) {
				a = k;
			}
		}
		return a;

	}

	public static int min(ArrayList<Integer> list) {
		int a = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			int k = list.get(i);
			if (k < list.get(0)) {
				a = k;
			}
		}
		return a;
	}
}
