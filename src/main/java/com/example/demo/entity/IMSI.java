package com.example.demo.entity;

import com.example.demo.serviceImpl.LongEncryptorConverter;

import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class IMSI {
	
	@Id
	@Convert(converter = LongEncryptorConverter.class)
	private Long imsi;
	
	
	private Long dummyImsi;
	
	private String name;

	public Long getImsi() {
		return imsi;
	}

	public void setImsi(Long imsi) {
		this.imsi = imsi;
	}

	public Long getDummyImsi() {
		return dummyImsi;
	}

	public void setDummyImsi(Long dummyImsi) {
		this.dummyImsi = dummyImsi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IMSI(Long imsi, Long dummyImsi, String name) {
		super();
		this.imsi = imsi;
		this.dummyImsi = dummyImsi;
		this.name = name;
	}

	public IMSI() {
		super();
	}

	
	
	

}
