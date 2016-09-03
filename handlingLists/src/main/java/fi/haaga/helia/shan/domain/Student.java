package fi.haaga.helia.shan.domain;

public class Student {
	
	private String firstName;
	private String lastName;
	private String email;
	
	
	
	public Student() {
		super();
	}
	public Student(String firstName, String lastName) {
		// TODO Auto-generated constructor stub
		this.firstName=firstName;
		this.lastName=lastName;		
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return firstName + lastName;
	}
	

}