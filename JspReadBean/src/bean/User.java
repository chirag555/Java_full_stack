package bean;

public class User {
	private String firstName;
	private String lastName;
	
	public User() {
		firstName="Chirag";
		lastName="Kaushik";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
