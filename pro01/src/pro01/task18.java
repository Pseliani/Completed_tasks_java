/*Write a class Tree and 2 child classes OrangeTree and AppleTree. 
Add functionality ‘grow’, ‘waterTree’, ‘collectFruits’, ‘passYear’ and ‘die’. 
When the tree dies, print all fruits that it has had, all collected fruits, 
its height and age. Use random numbers for all mentioned functionality. 
Feel free to add any other functionality.*/

package pro01;
class Tree {
	public int age;
	public int height;
	
	Tree(int age, int height){
		this.age = age;
		this.height = height;
	};
	
	public static void grow() {
	};
	public static void waterTree() {
	};
	public static void collectFruits() {
	};
	public static void passYear() {
	};
	public static void cdie() {
	};

}

class OrangeTree extends Tree{

	OrangeTree(int age, int height) {
		super(age, height);
	}
}

class AppleTree extends Tree{

	AppleTree(int age, int height) {
		super(age, height);
	}
	
}

public class task18 {

	public static void main(String[] args) {
		Tree tree = new Tree(4, 5);

	}

}
