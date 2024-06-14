package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CountryRepository;
import com.example.demo.dao.ImsiDao;
import com.example.demo.entity.Country;
import com.example.demo.entity.IMSI;

@Service
public class CountryServiceImpl implements CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	@Autowired
	private ImsiDao imsiDao;

	@Override
	public List<Country> getDetail() {
		// TODO Auto-generated method stub
		List<Country> countryList = new ArrayList<>();
		countryList = countryRepository.findAll();
		return countryList;
	}

	@Override
	public void createCountry(Country country) {
		// TODO Auto-generated method stub
		
		countryRepository.save(country);
	}

	@Override
	public Country findByCountryName(String countryName) {
		// TODO Auto-generated method stub
		//String encryptedData = StringCryptoConverter.encrypt(countryName);
		Country country = countryRepository.findByCountryName(countryName);
		return country;
	}

	@Override
	public void createImsi(IMSI imsi) {
		// TODO Auto-generated method stub
		imsiDao.save(imsi);
		
	}

	@Override
	public List<IMSI> getimsiList() {
		// TODO Auto-generated method stub
		List<IMSI> list = imsiDao.findAll();
		return list;
	}

}
