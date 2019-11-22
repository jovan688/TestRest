package com.example.test.testRest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.testRest.Entity.BPartner;
import com.example.test.testRest.Entity.MProduct;
import com.example.test.testRest.Service.IBPartnerService;
import com.example.test.testRest.Service.IMProductService;

@RestController
@RequestMapping("/api")
public class MProductController {
	
	@Autowired
	IMProductService service;
	
	@GetMapping("/products")
	public ResponseEntity<?> findAll()
	{
		List<MProduct> list = service.findAll();
		
		if(list.isEmpty())
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<List<MProduct>>(list,HttpStatus.OK);
		
	}
	
	@PostMapping("/formproduct")
	public ResponseEntity<?> save(@RequestBody MProduct producto)
	{
		service.save(producto);	
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	

}
