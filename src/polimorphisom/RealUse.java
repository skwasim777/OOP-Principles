package polimorphisom;

public class RealUse {
	public static void main(String[] args) {
			Emp e = new Emp(101,"Wasim Shaikh",20000F);
			e.desplay();
	}
}

class Person {
	int id;
	String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Emp extends Person {
	float salary;

	Emp(int id, String name, float salary) {
		super(id, name);
		this.salary = salary;
	}

	void desplay() {
		System.out.println(id + " " + name + " " + salary);
	}
}
