package com.example.demo.model;

public class Employee {
	
	private int Id;

	private String firstName;

	private String lastName;

	private String mail;

	private String phone;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Employee(int id, String firstName, String lastName, String mail, String phone) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
		this.phone = phone;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", mail=" + mail
				+ ", phone=" + phone + "]";
	}
	
	
	

}
