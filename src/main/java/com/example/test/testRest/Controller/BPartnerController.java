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
import com.example.test.testRest.Service.IBPartnerService;

@RestController
@RequestMapping("/api")
public class BPartnerController {

	@Autowired
	IBPartnerService service;
	
	@GetMapping("/partners")
	public ResponseEntity<?> findAll()
	{
		List<BPartner> list = service.findAll();
		
		if(list.isEmpty())
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<List<BPartner>>(list,HttpStatus.OK);
		
	}
	
	@PostMapping("/formpartner")
	public ResponseEntity<?> save(@RequestBody BPartner partner)
	{
		service.save(partner);	
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	

}
