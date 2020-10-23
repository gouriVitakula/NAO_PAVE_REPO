package com.example.demo;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@IdClass(AccountId.class)
public class AccountDetails implements Serializable{
	
	
    public AccountDetails() {
		super();
	}
	public AccountDetails(@JsonProperty("branchNumber") long branchNumber, @JsonProperty("acctNumber") int acctNumber, @JsonProperty("acctType") String acctType, 
    		@JsonProperty("acctSubClassType") String acctSubClassType, @JsonProperty("divPay") int divPay,
    		@JsonProperty("clientType") String clientType, @JsonProperty("businessType") String businessType, @JsonProperty("keyAccount") long keyAccount) {
		super();
		this.branchNumber = branchNumber;
		this.acctNumber = acctNumber;
		this.acctType = acctType;
		this.acctSubClassType = acctSubClassType;
		this.divPay = divPay;
		this.clientType = clientType;
		this.businessType = businessType;
		this.keyAccount = keyAccount;
	}

	@Id 
	long branchNumber;
    @Id
	int acctNumber;
	String acctType;
	String acctSubClassType;
	int divPay;
	String clientType;
	String businessType; 
	long keyAccount;
	
	public long getBranchNumber() {
		return branchNumber;
	}
	public void setBranchNumber(long branchNumber) {
		this.branchNumber = branchNumber;
	}
	public int getAcctNumber() {
		return acctNumber;
	}
	public void setAcctNumber(int acctNumber) {
		this.acctNumber = acctNumber;
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	public String getAcctSubClassType() {
		return acctSubClassType;
	}
	public void setAcctSubClassType(String acctSubClassType) {
		this.acctSubClassType = acctSubClassType;
	}
	public int getDivPay() {
		return divPay;
	}
	public void setDivPay(int divPay) {
		this.divPay = divPay;
	}
	public String getClientType() {
		return clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public long getKeyAccount() {
		return keyAccount;
	}
	public void setKeyAccount(long keyAccount) {
		this.keyAccount = keyAccount;
	}
	
	 public String toString() {
	        return "AccountDetails{" +
	                "branchNumber='" + branchNumber +
	                ", acctNumber=" + acctNumber +
	                ", acctType=" + acctType +
	                ", acctSubClassType="+ acctSubClassType +
	                ", divPay="+divPay+
	                ", clientType="+clientType+
	                ", businessType="+ businessType+
	                ", keyAccount="+ keyAccount+
	                "}";
	    }
	
}
