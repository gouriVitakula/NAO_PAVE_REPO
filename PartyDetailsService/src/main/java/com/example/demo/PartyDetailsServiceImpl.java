package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PartyDetailsServiceImpl implements PartyDetailsService{
	
	@Autowired
	PartyDetailsDAOSupport partyDetailsDao;

	public PartyInfo getPartyDetails(int partyId) {
		
		PartyInfo partyInfo = partyDetailsDao.getPartyDetails(partyId);
		return partyInfo;
	}

	public List<PartyInfo> getPartyDetailsByKeyAccount(long keyAccount) {
		
		List<PartyInfo> partyInfoList = partyDetailsDao.getPartyDetailsByKeyAccount(keyAccount);
		return partyInfoList;
	}
}
