package com.example.test.testRest.Dao;

import org.springframework.data.repository.CrudRepository;

import com.example.test.testRest.Entity.CInvoice;

public interface CInvoiceDao extends CrudRepository<CInvoice, Long> {

}
