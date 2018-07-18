/*Create a 2 dimensional array filled with random numbers. Swap rows with columns.*/

package pro01;
public class task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(
				"Создаём двумерный массив случайных чисел до 8 и выводим");
		int[][] k = new int[5][5];
		for (int i = 0; i < k.length; i++) {
			for (int j = 0; j < k.length; j++) {
				k[i][j] = (int) (Math.random() * 9);
				System.out.print(k[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("==============");
		System.out.println("Выводим массив");
		System.out.println("==============");
		for (int i = 0; i < k.length; i++) {
			for (int j = 0; j < k.length; j++) {
				System.out.print(k[j][i] + " ");
			}
			System.out.println();
		}
	}

}
