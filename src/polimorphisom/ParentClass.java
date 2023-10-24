package polimorphisom;

public class ParentClass {
	public static void main(String[] args) {
		Dog02 d = new Dog02();

	}
}

class Animal02 {
	public Animal02() {
		System.out.println("animal is created");
	}
}

class Dog02 extends Animal02 {
	public Dog02() {
		super();
		System.out.println("dog is created ");
	}

}