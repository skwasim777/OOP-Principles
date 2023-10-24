package polimorphisom;

public class Main extends Bike01{
		void run() {
			System.out.println("Car is runing safely");
		}
		public static void main(String[] args) {
			Main m = new Main();
			m.run();
		}
}
class Bike01{
	void run() {
		System.out.println("Bike is running");
	}
}