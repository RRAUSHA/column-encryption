package com.example.demo.entity;

import com.example.demo.serviceImpl.LongEncryptorConverter;
import com.example.demo.serviceImpl.StringCryptoConverter;

import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Country {


private int id;

@Id
@Convert(converter = LongEncryptorConverter.class)
private Long imsi;

@Convert(converter = StringCryptoConverter.class)
private String countryName;
private String countryCode;
private String continentName;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Long getImsi() {
	return imsi;
}
public void setImsi(Long imsi) {
	this.imsi = imsi;
}
public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}
public String getCountryCode() {
	return countryCode;
}
public void setCountryCode(String countryCode) {
	this.countryCode = countryCode;
}
public String getContinentName() {
	return continentName;
}
public void setContinentName(String continentName) {
	this.continentName = continentName;
}
public Country(int id, Long imsi, String countryName, String countryCode, String continentName) {
	super();
	this.id = id;
	this.imsi = imsi;
	this.countryName = countryName;
	this.countryCode = countryCode;
	this.continentName = continentName;
}
public Country() {
	super();
}





}
