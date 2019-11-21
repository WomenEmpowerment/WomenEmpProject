package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_RegistrationWe")
public class Registration {

	@Id
	@GeneratedValue
	private int id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "AGE")
	private int age;

	@Column(name = "CITY")
	private String city;

	@Column(name = "PHONENO")
	private int Phoneno;

	@Column(name = "USERNAME")
	private String username;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "DOCUMENTS")
	private String docfilename;
	/*
	@OneToOne
	@JoinColumn(name = "id")
	private Accomodation accomodation;
*/
	public String getDocfilename() {
		return docfilename;
	}
	public void setDocfilename(String docfilename) {
		this.docfilename = docfilename;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPhoneno() {
		return Phoneno;
	}

	public void setPhoneno(int phno) {
		Phoneno = phno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Registration [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", city=" + city
				+ ", Phoneno=" + Phoneno + ", username=" + username + ", password=" + password + ", docfilename="
				+ docfilename + "]";
	}
	
	

}
