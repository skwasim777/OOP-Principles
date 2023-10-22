package Encapsulation;

public class Main {
	public static void main(String[] args) {
		Test t = new Test();
		t.setRollNo(101);
		t.setName("Wasim Shaikh");
		t.setEmailId("wasimsk6061@gmail.com");
		t.setMobileNo(93708239);
		t.setAddr("Hyderbad");
		System.out.println(t);
	}
}

class Test {
	@Override
	public String toString() {
		return "Test [rollNo=" + rollNo + ", name=" + name + ", emailId=" + emailId + ", mobileNo=" + mobileNo
				+ ", addr=" + addr + "]";
	}

	private int rollNo;
	private String name;
	private String emailId;
	private int mobileNo;
	private String addr;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int i) {
		this.mobileNo = i;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
