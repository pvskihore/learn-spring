package org.my.uiapp.model;

public class User {

	private String firstName;
	private String lastName;
	private String email;
	private Integer userId;

	public User() {
	}
	
	public User(String firstName, String lastName, String email, Integer userId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userId = userId;
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", userId=" + userId
				+ "]";
	}

	
}
