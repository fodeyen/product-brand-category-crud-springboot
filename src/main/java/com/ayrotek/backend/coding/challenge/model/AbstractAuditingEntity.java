package com.ayrotek.backend.coding.challenge.model;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractAuditingEntity implements Serializable{
	

	private static final long serialVersionUID = 1L;

	@CreatedBy
	@Column(nullable=false,length=50,updatable=false)
	@JsonIgnore
	private String createdBy;
	
	@CreatedDate
	@Column(updatable=false)
	@JsonIgnore
	private Instant createdDate;
	
	@LastModifiedBy
	@Column(length=50)
	@JsonIgnore
	private String lastModifiedBy;

	
	@LastModifiedDate
	@Column(length=50)
	@JsonIgnore
	private Instant lastModifiedDate=Instant.now();	
	
	
}
