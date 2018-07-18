/*finding the factorial of a number*/

package pro01;

class Calc{
	int factorial(int i){
		if (i==1) return 1; 
		return factorial(i-1)*i;
	}
	
}
class Fact {
	public static void main(String[] args) {
		Calc m = new Calc();

		System.out.println("Factorial chisla 3: " + m.factorial(3));
		System.out.println("Factorial chisla 4: " + m.factorial(4));
		System.out.println("Factorial chisla 5: " + m.factorial(5));
		
	}
}
