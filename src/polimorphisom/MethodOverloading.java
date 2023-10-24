package polimorphisom;

public class MethodOverloading {
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.println(MethodOverloading.add(10,10));
		System.out.println(MethodOverloading.add(10,10,10));
	}
}
