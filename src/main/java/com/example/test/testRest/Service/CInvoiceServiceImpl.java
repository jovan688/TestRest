package com.example.test.testRest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.testRest.Dao.CInvoiceDao;
import com.example.test.testRest.Entity.CInvoice;

@Service
public class CInvoiceServiceImpl implements ICInvoiceService{
	
	@Autowired
	CInvoiceDao invoicedao;

	@Override
	public List<CInvoice> findAll() {
		return (List<CInvoice>) invoicedao.findAll();
	}

	@Override
	public void save(CInvoice invoice) {
		invoicedao.save(invoice);
	}

}
