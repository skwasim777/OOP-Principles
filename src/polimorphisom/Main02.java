package polimorphisom;

public class Main02 {
	public static void main(String[] args) {
		Bank04 b;
		b = new RDBI();
		System.out.println("RDBI Rate of interest " + b.getRateOfInterest());
		b = new HDFC();
		System.out.println("HDFC Rate of interest " + b.getRateOfInterest());
		b = new CITY();
		System.out.println("CITY Rate of interest " + b.getRateOfInterest());
	}
}

class Bank04 {
	float getRateOfInterest() {
		return 0;
	}
}

class RDBI extends Bank04 {
	float getRateOfInterest() {
		return 7;
	}
}

class HDFC extends Bank04 {
	float getRateOfInterest() {
		return 12;
	}
}

class CITY extends Bank04 {
	float getRateOfInterest() {
		return 10;
	}
}