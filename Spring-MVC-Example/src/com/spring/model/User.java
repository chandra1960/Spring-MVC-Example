package com.spring.model;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class User {
	
	@NotEmpty(message = "Please enter your Username.")	
	private String username;
	
	@NotEmpty(message = "Please enter your password.")
	@Size(min = 3, max = 5, message = "Your password must between 3 and 5 characters")
	private String password;
	
	@NotEmpty(message = "Please enter your email.")
	@Email
	private String email;
	
	private Date birthDate;
	private String profession;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
}
