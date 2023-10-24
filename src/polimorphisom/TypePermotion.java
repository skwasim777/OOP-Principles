package polimorphisom;

public class TypePermotion {
		void sum(int a,int b) {
				System.out.println(a+b);
		}
		void sum(int a,double b) {
			System.out.println(a+b);
		}
		public static void main(String[] args) {
			TypePermotion t = new TypePermotion();
			t.sum(10,10);
			t.sum(10, 10);
		}
}
