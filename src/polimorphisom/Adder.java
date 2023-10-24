package polimorphisom;

public class Adder {
		static int add(int a,int b) {
			return a+b;
		}
		static double add(double d,double c) {
			return d+c;
		}
		public static void main(String[] args) {
			System.out.println(add(10,20));
			System.out.println(add(2.3,2.3));
		}
}
