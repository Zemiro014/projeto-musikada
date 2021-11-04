package com.musikada.user.dto.request;

public class UserRequest {
	
	private String firstName;
	private String secondName;
	private String nackName;
	private String email;
	private String phone;
	private String password;
	
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

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "UserRequest [firstName=" + firstName + ", secondName=" + secondName + ", nackName=" + nackName
				+ ", email=" + email + ", phone=" + phone + ", password=" + password + "]";
	}
	
}
