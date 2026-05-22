package oops.copyconstructor;

public class Student {
	
	private String name;
	
	private int age;
	
	private double psp;
	
	private Address address;
	
	public Student(String name, int age, double psp, Address address) {
		this.name = name;
		this.age = age;
		this.psp = psp;
		this.setAddress(address);
	}
	
	
	//Copy Constructor
	public Student(Student other) {
		this.name = other.name;
		this.age = other.age;
		this.psp = other.psp;
		this.address = new Address(other.getAddress());
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getPsp() {
		return psp;
	}


	public void setPsp(double psp) {
		this.psp = psp;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
