package com.example.test.testRest.Dao;

import org.springframework.data.repository.CrudRepository;

import com.example.test.testRest.Entity.CInvoice;

public interface CInvoiceDetailDao extends CrudRepository<CInvoice,Long> {

}
