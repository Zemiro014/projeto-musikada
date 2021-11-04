package com.musikada.user.dto.response;

public class UserResponse {
	private String firstName;
	private String secondName;
	private String nackName;
	private String email;
	private String phone;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getNackName() {
		return nackName;
	}
	public void setNackName(String nackName) {
		this.nackName = nackName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
