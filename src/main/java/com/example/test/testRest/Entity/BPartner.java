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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "B_Partner")
public class BPartner implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long b_partner_id;
	
	private String name;
	
	private boolean iscustomer;
	
	private boolean isvendor;
	
	private float amt;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name ="b_partner_id" ,referencedColumnName = "b_partner_id")
	List<CInvoice> invoices = new ArrayList<>();

	public long getBpartner_id() {
		return b_partner_id;
	}

	public void setBpartner_id(long bpartner_id) {
		this.b_partner_id = bpartner_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isIscustomer() {
		return iscustomer;
	}

	public void setIscustomer(boolean iscustomer) {
		this.iscustomer = iscustomer;
	}

	public boolean isIsvendor() {
		return isvendor;
	}

	public void setIsvendor(boolean isvendor) {
		this.isvendor = isvendor;
	}

	public float getAmt() {
		return amt;
	}

	public void setAmt(float amt) {
		this.amt = amt;
	}
	
}
