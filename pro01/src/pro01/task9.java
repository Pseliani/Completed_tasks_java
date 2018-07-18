/*Write a program that uses an array to find the average of 10 double values.
Use any 10 values you like.*/

package pro01;

public class task9 {

	public static void main(String[] args) {
		int count[] = {1, 1, 3, 3, 5, 6, 88, 5, 9, 10};
		int sum = 0;
		for (int i = 0; i < count.length; i++) {
			sum += count[i];
		}
		double sr = sum / count.length;
		System.out.println("Summa elementov massiva: " + sum);
		System.out.println("Srednee znachenie massiva: " + (int) sr);

	}

}
