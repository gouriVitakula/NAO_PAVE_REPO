package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PartyInfo {
	@Id
	long partyId;
	String firstName;
	String lastName;
	String DateOfBirth;
	long phoneNumber;
	String emailId;
	String partyType;
	long keyAccount;
	
	
	public long getPartyId() {
		return partyId;
	}
	public void setPartyId(long partyId) {
		this.partyId = partyId;
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
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPartyType() {
		return partyType;
	}
	public void setPartyType(String partyType) {
		this.partyType = partyType;
	}
	public long getKeyAccount() {
		return keyAccount;
	}
	public void setKeyAccount(long keyAccount) {
		this.keyAccount = keyAccount;
	}
	
	

}
