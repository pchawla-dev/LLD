package oops.abstractclasses;

public class Mentor extends User{

	@Override
	public String getRole() {
		
		return "MENTOR";
	}

	@Override
	public void performDailyTask() {
		
		System.out.println("Conduct mentoring session with mentees");
		
	}

}
