package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ACCOMODATION")
public class Accomodation {
	
	@Id
	@GeneratedValue
	private int accid;
	
	@Column(name = "BOYAGE")
	private int boyAge;
	
	@Column(name = "GIRLAGE")
	private int girlAge;
	
	//@Column(name = "ID")
	//private int id;
	
	@OneToOne
	@JoinColumn(name="ID")
	private Registration registration;

	

	public Registration getRegistration() {
		return registration;
	}

	public void setRegistration(Registration registration) {
		this.registration = registration;
	}

	public int getAccid() {
		return accid;
	}

	public void setAccid(int accid) {
		this.accid = accid;
	}

	public int getBoyAge() {
		return boyAge;
	}

	public void setBoyAge(int boyAge) {
		this.boyAge = boyAge;
	}

	public int getGirlAge() {
		return girlAge;
	}

	public void setGirlAge(int girlAge) {
		this.girlAge = girlAge;
	}
	
	
	

}
