package oops.abstractclasses;

public abstract class User {
	
	//Common attributes for all Users
	private String id;
	private String userName;
	private String email;
	private String password;
	
	//Abstract Methods
	//Child class must implement this method
	public abstract String getRole();
	
	
	//Another Abstract Method
	public abstract void performDailyTask();
	
	public User() {
		
	}
	
	public User(String id, String userName, String email) {
		this.id = id;
		this.userName = userName;
		this.email = email;
	}
	
	public User(String userName, String email) {
		this.userName = userName;
		this.email = email;
	}
	
	public void signUp() {
		
	}
	
	public boolean login(String enteredPassword) {
		return this.password.equals(enteredPassword);
	}
	
	public void logout() {
		System.out.println(userName + "logged out successfully");
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public String getEmail() {
		return this.email;
	}

}
