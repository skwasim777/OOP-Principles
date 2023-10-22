package Inheritence;

// when two or more class inhertes from one class it is know as hyrarchichal inheritence
public class HyrarchichalInheritence {
		public static void main(String[] args) {
			Doughter d = new Doughter();
			d.name();
			d.doughter();
			/* d.sun(); */
		}
}

class Father {
	void name() {
		System.out.println("My Hero is my father....");
	}
}

class Sun extends Father {
	void sun() {
		System.out.println("and i am his fan");
	}
}

class Doughter extends Father {
	void doughter() {
		System.out.println("and she is my sister");
	}
}
