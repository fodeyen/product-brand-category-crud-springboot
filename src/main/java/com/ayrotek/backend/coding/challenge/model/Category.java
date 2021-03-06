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
@Table(name="category")
public class Category extends AbstractAuditingEntity {

	
	@Column(name="category_id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int categoryId;
	
	@Column(name="category_name")
	private String categoryName;
	
	@OneToMany(mappedBy = "categoryId",cascade = CascadeType.ALL)
    private Set<Product> products ;
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
	
}
