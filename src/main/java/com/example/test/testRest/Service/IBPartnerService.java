package com.example.test.testRest.Service;

import java.util.List;

import com.example.test.testRest.Entity.BPartner;

public interface IBPartnerService {

	public List<BPartner> findAll();
	
	public void save(BPartner partner);
	
}
