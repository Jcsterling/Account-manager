package com.qa.AccountManager.Entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	
	private Long id;
	private String firstName;
	private String surName;
	private String accountNumber;
	private java.util.Date dateCreated;
	
	public Account() {
	}
	
		
	

	public Long getId() {
		return id;
	}




	public void setId(Long key) {
		this.id = key;
	}




	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(java.util.Date date) {
		this.dateCreated = date;
	}


	
	
	
	
}
