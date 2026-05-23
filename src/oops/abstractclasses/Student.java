package oops.abstractclasses;

public class Student extends User{

	@Override
	public String getRole() {
		
		return "STUDENT";
	}

	@Override
	public void performDailyTask() {
		
		System.out.println("Attending Lectures completed");
		System.out.println("Assignments Completed");
		System.out.println("Mock Test Cleared");
		
	}

}
