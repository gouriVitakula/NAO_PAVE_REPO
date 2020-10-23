package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface PartyDetailsService {
	
	PartyInfo getPartyDetails(int partyId);
	List<PartyInfo> getPartyDetailsByKeyAccount(long keyAccount);
}
