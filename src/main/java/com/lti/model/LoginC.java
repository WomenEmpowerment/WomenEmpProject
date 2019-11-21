package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_LoginWe")

public class LoginC {
	@Id
	@GeneratedValue
	private int id;

	@Column(name = "NAMEL")
	private String nameL;

	@Column(name = "PASSL")
	private String passL;

	public int getId() {
		return id;
	}

	public String getNameL() {
		return nameL;
	}

	public void setNameL(String nameL) {
		this.nameL = nameL;
	}

	public String getPassL() {
		return passL;
	}

	public void setPassL(String passL) {
		this.passL = passL;
	}

}
