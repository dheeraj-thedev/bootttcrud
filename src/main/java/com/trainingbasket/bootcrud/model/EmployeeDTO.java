package com.trainingbasket.bootcrud.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class EmployeeDTO {

	private Long id;
	private String firstName;
	private String lastName;
	private String userName;
	private String emailID;
	private String bloodGroup;
	private int age;
	private String personalEmail;
	private String mobileNumber;

	public EmployeeDTO() {

	}

	public EmployeeDTO(Long id, String firstName, String lastName, String userName, String emailID, String bloodGroup,
			int age, String personalEmail, String mobileNumber) {
		super();
		this.id = id; 
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.emailID = emailID;
		this.bloodGroup = bloodGroup;
		this.age = age;
		this.personalEmail = personalEmail;
		this.mobileNumber = mobileNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPersonalEmail() {
		return personalEmail;
	}

	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", emailID=" + emailID + ", bloodGroup=" + bloodGroup + ", age=" + age + ", personalEmail="
				+ personalEmail + ", mobileNumber=" + mobileNumber + "]";
	}

}
