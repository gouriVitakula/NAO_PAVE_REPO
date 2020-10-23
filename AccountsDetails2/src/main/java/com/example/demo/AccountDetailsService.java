package com.example.demo;


import java.util.List;

import org.springframework.stereotype.Service;


@Service
interface AccountDetailsService {
	
	AccountDetails getAccountWithParty(long branchNumber, int accountNumber);
	
	List<AccountDetails> getAllAccountsByBranchNumber(long branchNumber);
	
	void addNewAccount(AccountDetails acctDetails);
	
//	List<PartyDetails> getPartyDetails(int partyId);
//	
//	void convertToBSAAccount(int branchNumber, int accountNumber);
//	
//	void convertToAAAAccount(int branchNumber, int accountNumber);
//	
//	void reinstateAAAAccount(int branchNumber, int accountNumber);
//	
//	void maskPIIData(int branchNumber, int accountNumber);
//	
//	boolean validateREGBIContext(int branchNumber, int accountNumber);
//	
//	boolean isUnifyAccount(int branchNumber, int accountNumber);
//	
//	boolean isFAorCSA(int msId, int racfId);
//	
//	boolean isATCValid(String acctType, int branchNumber);
//	
//	String getECRRRiskRank(int acctNumber, int PartyId);
//	
//	boolean isFAStateRegistered(int faNumber);
//	
//	boolean validatePhoneandEmailDetails(int acctNumber);
//	
//	boolean getEntitlementsDetails(int msid, int racfid);
//	
//	boolean validateCIPData(PartyDetails partyInfo);
//	
//	void manageLendingDetails(int acctNumber, int novusCode, int subNovusCode);
	

}
