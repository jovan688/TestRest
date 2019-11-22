
package com.example.test.testRest.Service;

import java.util.List;

import com.example.test.testRest.Entity.MProduct;

public interface IMProductService {

	public List<MProduct> findAll();
	
	public void save(MProduct product);
}
