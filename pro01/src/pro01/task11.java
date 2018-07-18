/*Create a class Censor that will take a String as an argument during creation 
and will automatically remove all “bad” words from given string and duplicated 
spaces (replace 2+ spaces in a row with a single space). Also, it should have 
a method censor one version of which will replace all occurrences of given 
substring with another one and the other version of which will just remove 
given word from the string.*/

package pro01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class task11 {

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			list.add(reader.readLine());
		}
		System.out.printf("\nRecieved list: \n");
		
		for (String s : list)
			System.out.println(s);

		list = Scanner(list);
		
		System.out.printf("\nAfter corrections: \n");
		
		for (String s : list)
			System.out.println(s);

	}
	
	public static ArrayList<String> Scanner(ArrayList<String> list)
    {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains("Bad")) {
				list.remove(list.get(i));
				list.add("__");
			}
			if (list.get(i).contains("Fuu")) {
				list.remove(list.get(i));
				list.add("__");
			}
			if (list.get(i).contains("imbiculu")) {
				list.remove(list.get(i));
				list.add("__");
			}
			else
				list.get(i);
		}
		return list;
	}
}
