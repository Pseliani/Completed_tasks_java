/*sort random values*/

package pro01;

public class Sort {
	public static void main(String[] args) {
		int list[] = new int[10];

		for (int i = 0; i < list.length; i++) {
			list[i] = (int) (Math.random() * 9);
		}
		
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		
		System.out.println();
		System.out.println("-------------------");

		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length - 1; j++) {
				if (list[j] > list[j + 1]) {
					int c;
					c = list[j];
					list[j] = list[j + 1];
					list[j + 1] = c;
				}
			}
		}

		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}

}
