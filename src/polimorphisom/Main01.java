package polimorphisom;

public class Main01 {
	public static void main(String[] args) {
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		System.out.println("SBI Rate of interest " + s.getRateOfIntrest());
		System.out.println("SBI Rate of interest " + i.getRateOfIntrest());
		System.out.println("SBI Rate of interest " + a.getRateOfIntrest());
	}
}

class Bank02 {
	int getRateOfIntrest() {
		return 0;
	}
}

class SBI extends Bank02 {
	int getRateOfIntrest() {
		return 8;
	}
}

class ICICI extends Bank02 {
	int getRateOfIntrest() {
		return 7;
	}
}

class AXIS extends Bank02 {
	int getRateOfIntrest() {
		return 12;
	}
}