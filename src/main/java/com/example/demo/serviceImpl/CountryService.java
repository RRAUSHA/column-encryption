package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Country;
import com.example.demo.entity.IMSI;

@Service
public interface CountryService {

	public List<Country> getDetail();
	public void createCountry(Country country);
	public Country findByCountryName(String countryName);
	public void createImsi(IMSI imsi);
	public List<IMSI> getimsiList();
}
