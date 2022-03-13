package com.ayrotek.backend.coding.challenge.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="brand")
public class Brand extends AbstractAuditingEntity{

	
	@Column(name="brand_id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int brandId;
	
	@Column(name="brand_name")
	private String brandName;
	
	 @OneToMany(mappedBy = "brandId",cascade = CascadeType.ALL)
	    private Set<Product> products ;
	
	
	
	public Brand(int brandId, String brandName) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
	}
	
	public Brand() {
		
	}
	
	
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
}
