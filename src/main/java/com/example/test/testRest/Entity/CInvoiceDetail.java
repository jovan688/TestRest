package com.example.test.testRest.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "C_Invoice_Detail")
public class CInvoiceDetail implements Serializable  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long c_invoice_detail_id;
	
	@Column(name = "c_invoice_id")
	private long c_invoice_id;
	
	@Column(name = "m_product_id")
	private long m_product_id;

	private float qty;

	public long getC_invoice_detail_id() {
		return c_invoice_detail_id;
	}

	public void setC_invoice_detail_id(long c_invoice_detail_id) {
		this.c_invoice_detail_id = c_invoice_detail_id;
	}

	public long getC_invoice_id() {
		return c_invoice_id;
	}

	public void setC_invoice_id(long c_invoice_id) {
		this.c_invoice_id = c_invoice_id;
	}

	public long getM_product_id() {
		return m_product_id;
	}

	public void setM_product_id(long m_product_id) {
		this.m_product_id = m_product_id;
	}

	public float getQty() {
		return qty;
	}

	public void setQty(float qty) {
		this.qty = qty;
	}
	
	
	
}
