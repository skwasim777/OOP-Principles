package Inheritence;

// when a class inherits another class is called single level ingeritence
public class SingleLevelInheritence {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
	}
		
		
}

class Animal {
	public void eat() {
		System.out.println("dog is eating....");
	}
}

class Dog extends Animal {
	 public void bark() {
		 System.out.println("dog is barking...");
	 }
}