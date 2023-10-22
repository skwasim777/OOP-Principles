package Inheritence;

// when there is chain of inheritence, it is known as multilevel inheritence
public class MultilevelInheritence {
			public static void main(String[] args) {
				Goat g = new Goat();
				g.eat();
				g.color();
				g.run();
			}
}
class Cow{
	void eat() {
		System.out.println("Cow is eating..");
	}
}
class Buffello extends Cow{
	void color() {
		System.out.println("Buffello color is black....");
	}
}
class Goat extends Buffello{
	void run() {
		System.out.println("goat is running");
	}
}