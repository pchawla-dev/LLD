package oops.copyconstructor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Address s1Address = new Address("Greater Noida", "India");
		
		
		Student s1 = new Student("Poonam", 24, 99.5, s1Address);
		Student s2 = new Student(s1);
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		

		System.out.println(s1.getAddress().getCity());
		System.out.println(s2.getAddress().getCity());
		
		s2.getAddress().setCity("Hyderabad");
		
		System.out.println(s1.getAddress().getCity());
		System.out.println(s2.getAddress().getCity());

	}

}
