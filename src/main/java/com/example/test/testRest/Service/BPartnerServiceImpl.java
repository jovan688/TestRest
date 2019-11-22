package com.example.test.testRest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.testRest.Dao.BPartnerDao;
import com.example.test.testRest.Entity.BPartner;

@Service
public class BPartnerServiceImpl implements IBPartnerService {

	@Autowired
	BPartnerDao partnerDao;
	
	
	@Override
	public List<BPartner> findAll() {
		return (List<BPartner>) partnerDao.findAll();
	}

	@Override
	public void save(BPartner partner) {
		partnerDao.save(partner);
	}

}
