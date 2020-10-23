package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PartyDetailsDAOSupport {
	
	@Autowired
	PartyDetailsRepo partyDetailsRepo;
	
	public PartyInfo getPartyDetails(long partyId)
	{
		return partyDetailsRepo.findByPartyId(partyId);
	}
	
	public List<PartyInfo> getPartyDetailsByKeyAccount(long keyAccount)
	{
		return partyDetailsRepo.findByKeyAccount(keyAccount);
	}

}
