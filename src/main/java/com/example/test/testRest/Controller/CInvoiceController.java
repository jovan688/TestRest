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
import com.example.test.testRest.Entity.CInvoice;
import com.example.test.testRest.Service.ICInvoiceService;


@RestController
@RequestMapping("/api")
public class CInvoiceController {

	@Autowired
	ICInvoiceService service;
	
	@GetMapping("/invoices")
	public ResponseEntity<?> findAll()
	{
		List<CInvoice> list = service.findAll();
		
		if(list.isEmpty())
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<List<CInvoice>>(list,HttpStatus.OK);
		
	}
	
	@PostMapping("/invoice")
	public ResponseEntity<?> save(@RequestBody CInvoice invoice)
	{
		service.save(invoice);	
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
}
