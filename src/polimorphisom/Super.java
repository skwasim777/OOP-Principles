package polimorphisom;

public class Super {
	public static void main(String[] args) {
		Dog01 d = new Dog01();
		d.work();
	}
}

class Animal01 {
	void eat() {
		System.out.println("eating.....");
	}
}

class Dog01 extends Animal01 {
	void eat() {
		System.out.println("eating bread.....");
	}

	void bark() {
		System.out.println("Barking.....");
	}

	void work() {
		super.eat();
		bark();
	}
}