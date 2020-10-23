package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

interface AccountDetailsRepo extends JpaRepository<AccountDetails, AccountId>{
	
	AccountDetails findByBranchNumber(long branchNumber);
	
	AccountDetails findByBranchNumberAndAcctNumber(long branchNumber, int acctNumber);
	
	List<AccountDetails> findAllAccountsByBranchNumber(long branchNumber);

}
