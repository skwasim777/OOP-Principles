package Inheritence;

public class Main {
		public static void main(String[] args) {
			Address addr = new Address("Hyderbad","Telangna","India");
			Emp emp = new Emp(101,"Wasim Shaikh",addr);
			emp.show();
		}
}
class Emp{
	int id;
	String name;
	Address addr;
	public Emp(int id, String name, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}
	public void show() {
		System.out.println(id+" "+name);
		System.out.println(addr.city+" "+addr.state+" "+addr.country);
	}
	
}
class Address {
	String city, state, country;

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

}
