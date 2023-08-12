package com.qtechlabs.employeemanagement.dto;

import java.io.Serializable;

import com.qtechlabs.employeemanagement.dto.enumeration.Gender;

public class EmployeeDTO implements Serializable {

	private static final long serialVersionUID = -7128742750468665212L;

	private Long id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String address;
	private Gender gender;

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

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
