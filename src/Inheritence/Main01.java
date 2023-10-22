package Inheritence;

public class Main01 extends Employee {
	float salary = (float) 45000.00;

	public static void main(String[] args) {
		Main01 m = new Main01();
		System.out.println("Employee Salary " + m.salary);
		System.out.println("Employee Bonus " + m.bonus);
	}
}

class Employee {
	int bonus = 40000;

}
