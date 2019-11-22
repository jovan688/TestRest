package com.example.test.testRest.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "C_Invoice")
public class CInvoice implements Serializable  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long c_invoice_id;
	
	
	private String description;
	
	private Date dateinvoiced;
	
	@Column(name = "b_partner_id")
	private long bparter_id;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "C_Invoice_Detail", 
	joinColumns = @JoinColumn( name ="c_invoice_id" , referencedColumnName = "c_invoice_id" ),
	inverseJoinColumns  = @JoinColumn(name = "m_product_id", referencedColumnName = "m_product_id" ))
	private List<CInvoiceDetail> detail ;


	public long getC_invoice_id() {
		return c_invoice_id;
	}


	public void setC_invoice_id(long c_invoice_id) {
		this.c_invoice_id = c_invoice_id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getDateinvoiced() {
		return dateinvoiced;
	}


	public void setDateinvoiced(Date dateinvoiced) {
		this.dateinvoiced = dateinvoiced;
	}


	public long getBparter_id() {
		return bparter_id;
	}


	public void setBparter_id(long bparter_id) {
		this.bparter_id = bparter_id;
	}
}
