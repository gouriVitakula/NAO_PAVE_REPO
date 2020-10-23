package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountDetailsServiceImpl implements AccountDetailsService{

	@Autowired
	AccountDetailsDAO acctDetailsDao;
	
	public AccountDetails getAccountWithParty(long branchNumber, int accountNumber) {
		return acctDetailsDao.getAccountDetails(branchNumber, accountNumber);
		
	}

	public List<AccountDetails> getAllAccountsByBranchNumber(long branchNumber) {
		return acctDetailsDao.getAllAccountsByBranchNumber(branchNumber);
	}

	public void addNewAccount(AccountDetails acctDetails) {
		// TODO Auto-generated method stub
		acctDetailsDao.addNewAccount(acctDetails);
	}

	
	
//	public List<PartyDetails> getPartyDetails(int partyId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public void convertToBSAAccount(int branchNumber, int accountNumber) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void convertToAAAAccount(int branchNumber, int accountNumber) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void reinstateAAA(int branchNumber, int accountNumber) {
//		
//	}
//
//	public void maskPIIData(int branchNumber, int accountNumber) {
//		
//	}
//
//	public boolean validateREGBIContext(int branchNumber, int accountNumber) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	public boolean isUnifyAccount(int branchNumber, int accountNumber) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	public boolean isFAorCSA(int msId, int racfId) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	public boolean isATCValid(String acctType, int branchNumber) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	public String getECRRRiskRank(int acctNumber, int PartyId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public boolean isFAStateRegistered(int faNumber) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	public void reinstateAAAAccount(int branchNumber, int accountNumber) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public boolean validatePhoneandEmailDetails(int acctNumber) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	public boolean getEntitlementsDetails(int msid, int racfid) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	public boolean validateCIPData(PartyDetails partyInfo) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	public void manageLendingDetails(int acctNumber, int novusCode, int subNovusCode) {
//		// TODO Auto-generated method stub
//		
//	}

}
