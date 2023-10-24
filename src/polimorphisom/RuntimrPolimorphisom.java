package polimorphisom;

public class RuntimrPolimorphisom extends Bike03 {
	void run() {
		System.out.println("Running is safely");
	}
	public static void main(String[] args) {
		RuntimrPolimorphisom r = (RuntimrPolimorphisom) new Bike03();
		r.run();
	}
}

class Bike03  {
	void run() {
		System.out.println("Running");
	}
}
