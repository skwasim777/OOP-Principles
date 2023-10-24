package Inheritence;

public class Aggregation {
	Operation op;
	double pi=3.14;
	
	double area(int radius) {
		
		op = new Operation();
		int rsquare = op.square(radius);
		return pi*rsquare;
	}
	public static void main(String[] args) {
		Aggregation g = new Aggregation();
		double d = g.area(5);
		
		System.out.println(d);
	}
}

class Operation {

	int square(int n) {
		return n*n;
	}
}
