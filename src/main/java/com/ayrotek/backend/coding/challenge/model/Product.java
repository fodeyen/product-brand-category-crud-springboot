package com.ayrotek.backend.coding.challenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="product")
@EntityListeners(AuditingEntityListener.class)
public class Product {

	@Column(name="product_id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	@CreatedBy
	private  String createBy;
	
	@Column(name="product_code")
	private String productCode;
	
	@Column(name="product_name")
	private String productName;
	
	

	@Column(name="stock_quantity")
	private int stockQuantity;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@ManyToOne
	@JoinColumn(name="brand_id", nullable=false)
	@JsonIgnoreProperties(value = {"brandName"})
	private Brand brandId;
	
	@ManyToOne
	@JoinColumn(name="category_id", nullable=false)
	@JsonIgnoreProperties(value = {"categoryName"})
	private Category categoryId;
	
	@ManyToOne
	@JoinColumn(name="id", nullable=false)
	@JsonIgnoreProperties(value= {"password","userName","product"})
	private User id;
	
	@ManyToOne
	@JoinColumn(name="role_id", nullable=false)
	@JsonIgnoreProperties(value= {"roleName"})
	private UserRole roleId;
	
	


	public Product(int productId, String productCode, String productName, int stockQuantity, double unitPrice,
			Brand brandId, Category categoryId,User id,String createdBy,UserRole roleId) {
		this.productId = productId;
		this.productCode = productCode;
		this.productName = productName;
		this.stockQuantity = stockQuantity;
		this.unitPrice = unitPrice;
		this.brandId = brandId;
		this.categoryId = categoryId;
		this.id=id;
		this.createBy=createdBy;
		this.roleId=roleId;
	}
	
	public Product() {
		
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Brand getBrandId() {
		return brandId;
	}
	public void setBrandId(Brand brandId) {
		this.brandId = brandId;
	}
	public Category getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}
	public User getId() {
		return id;
	}

	public void setId(User id) {
		this.id = id;
	}
	
	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public UserRole getRoleId() {
		return roleId;
	}

	public void setRoleId(UserRole roleId) {
		this.roleId = roleId;
	}
	

	
	
	
	
	
}
