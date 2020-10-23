package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountDetailsDAO {

	@Autowired
	AccountDetailsRepo acctDetailsRepo;
	
	public AccountDetails getAccountDetails(long branchNumber, int acctNumber) {
		
//		return acctDetailsRepo.findById(branchNumber).orElseThrow(() -> new RuntimeException("Account not found"));
		
//		return acctDetailsRepo.findByBranchNumber(branchNumber);
		
		return acctDetailsRepo.findByBranchNumberAndAcctNumber(branchNumber, acctNumber);
	      
			      
	}
	
	public List<AccountDetails> getAllAccountsByBranchNumber(long branchNumber) {
		
		
		return acctDetailsRepo.findAllAccountsByBranchNumber(branchNumber);
	      
			      
	}
	
	public void addNewAccount(AccountDetails acctDetails) {
		
		acctDetailsRepo.save(acctDetails);
		
	}
	

}
