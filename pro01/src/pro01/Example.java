package pro01;

class Data {
	public int age;
	public String name;
	Data (int age, String name) { this.age = age; this.name = name; }
}

class Dog {
	private int age = 4;
	private String name = "Borka";
	
	Dog () {
	}
	
	Dog (Data data) {
		age = data.age;
		name = data.name;
	}
	
	public void print() {
		System.out.println("Age " + this.age + " name " + this.name);
	}
	
	public void print(String s) {
		System.out.println(s + " Age " + age + " name " + name);
	}
	
	public void print(int i) {
		System.out.println(i + " Age " + age + " name " + name);
	}
	
	public void print(Data data) {
		System.out.println(data.age + " " + data.name);
	}
}

public class Example {

	public static void main(String[] args) {
		Data data = new Data(10, "bobik");
		Dog d = new Dog(data);
		d.print();
		d.print(data);
	}

}
