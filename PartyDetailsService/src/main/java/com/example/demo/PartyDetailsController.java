package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PartyDetailsController {
	
	@Autowired
	PartyDetailsServiceImpl partyDetailsServiceImpl;
	
	@GetMapping("/getPartyDetails/{partyId}")
	public PartyInfo getPartyDetails(@PathVariable int partyId) {
		
		return partyDetailsServiceImpl.getPartyDetails(partyId);
		
	}
	
	@GetMapping("/getPartyDetailsByKeyAccount/{keyAccount}")
	public List<PartyInfo> getPartyDetailsByKeyAccount(@PathVariable long keyAccount) {
		
		return partyDetailsServiceImpl.getPartyDetailsByKeyAccount(keyAccount);
		
	}

}
