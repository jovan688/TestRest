package com.example.test.testRest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.testRest.Dao.MProductDao;
import com.example.test.testRest.Entity.MProduct;

@Service
public class MProductServiceImp implements IMProductService{

	
	@Autowired
	MProductDao productdao;
	
	@Override
	public List<MProduct> findAll() {
		return (List<MProduct>) productdao.findAll();
	}

	@Override
	public void save(MProduct product) {
		productdao.save(product);
		
	}
	
	
	
	

}
