package com.example.demo;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.apache.log4j.Logger;


//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AccountDetailsController {
	
	@Autowired
	AccountDetailsServiceImpl accountDetailsService;
	
	@Autowired
	AccountDetailsPublisher publisher;
	
	static Logger log = Logger.getLogger(AccountDetailsController.class.getName());
	
	@GetMapping("/accountWidgetData/branchNumber/{branchNumber}/acctNumber/{acctNumber}/keyAccount/{keyAccount}")
	public AccountWidgetData getAccountWidgetData(@PathVariable int branchNumber, @PathVariable int acctNumber, @PathVariable int keyAccount) {
		log.info("Inside AccountDetailsController::getAccountWidgetData method");
		AccountWidgetData accountWidgetData = new AccountWidgetData();
		Map<String, Integer> uriVariables = new HashMap();
		
		AccountDetails acctDetails = accountDetailsService.getAccountWithParty(branchNumber, acctNumber);
		accountWidgetData.setAcctDetails(acctDetails);
		
		uriVariables.put("keyAccount", keyAccount);
//     	ResponseEntity<PartyInfo[]> response = new RestTemplate().getForEntity("http://localhost:8181/getPartyDetailsByKeyAccount/{keyAccount}", PartyInfo[].class ,uriVariables);
     	ResponseEntity<PartyInfo[]> response = new RestTemplate().getForEntity("http://partydetails:8181/getPartyDetailsByKeyAccount/{keyAccount}", PartyInfo[].class ,uriVariables);
     	accountWidgetData.setPartyInfoList(Arrays.asList(response.getBody()));
		
		return accountWidgetData;		
		
	}
	
	@GetMapping("/accountDetails/branchNumber/{branchNumber}/acctNumber/{acctNumber}")
	public AccountDetails getAccountWithParty(@PathVariable int branchNumber, @PathVariable int acctNumber) {
		log.info("Inside AccountDetailsController::getAccountWithParty method");
		AccountDetails acctDetails = accountDetailsService.getAccountWithParty(branchNumber, acctNumber);
		return acctDetails;		
		
	}
	
	@GetMapping("/allAccountsByBranch/branchNumber/{branchNumber}")
	public List<AccountDetails> getAllAccountsWithBranch(@PathVariable int branchNumber) {
		log.info("Inside AccountDetailsController::getAllAccountsWithBranch method");
		List<AccountDetails> acctDetailsList = accountDetailsService.getAllAccountsByBranchNumber(branchNumber);
		return acctDetailsList;		
		
	}
	
	@PostMapping("/newAccount")
	@CircuitBreaker(name = "accountDetailsBreak" ,fallbackMethod = "accountDetailsFallback")
	public void addNewAccount(@RequestBody AccountDetails acctDetails) {
//		System.out.println("Inside addNewAccount Method");
//        throw new RuntimeException("Sample Exception");
		log.info("Inside AccountDetailsController::addNewAccount method");
		accountDetailsService.addNewAccount(acctDetails);
		
	}
	
	
	public void accountDetailsFallback(@RequestBody AccountDetails acctDetails, Throwable t) {

		System.out.println("Entererd fall back method");
		publisher.publishMsg("Input Request: " + acctDetails);
	}

}
