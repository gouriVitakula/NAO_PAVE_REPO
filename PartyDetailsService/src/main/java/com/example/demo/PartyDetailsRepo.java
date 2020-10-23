package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyDetailsRepo extends JpaRepository<PartyInfo, Long>{
	
	PartyInfo findByPartyId(long partyId);
	List<PartyInfo> findByKeyAccount(long keyAccount);

}
