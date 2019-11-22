package com.example.test.testRest.Service;

import java.util.List;
import com.example.test.testRest.Entity.CInvoice;

public interface ICInvoiceService {

	public List<CInvoice> findAll();
	
	public void save(CInvoice invoice);
}
