package com.example.test.testRest.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "M_Product")
public class MProduct implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long m_product_id;
	
	private String name;
	
	private float price;
	
	/*
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(columnDefinition = "m_product_id", referencedColumnName = "m_product_id")
	List<CInvoiceDetail> detail = new ArrayList<>();
	*/
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JsonBackReference
	@JoinTable(name = "C_Invoice_Detail", joinColumns = @JoinColumn( name ="m_product_id" , referencedColumnName = "m_product_id" ),
			inverseJoinColumns  = @JoinColumn(name = "c_invoice_id", referencedColumnName = "c_invoice_id" ))
	private List<CInvoiceDetail> detail ;

	public long getM_product_id() {
		return m_product_id;
	}

	public void setM_product_id(long m_product_id) {
		this.m_product_id = m_product_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public List<CInvoiceDetail> getDetail() {
		return detail;
	}

	public void setDetail(List<CInvoiceDetail> detail) {
		this.detail = detail;
	}
	
	
	
	
}
