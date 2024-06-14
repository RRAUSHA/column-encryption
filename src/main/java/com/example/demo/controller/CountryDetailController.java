package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Country;
import com.example.demo.entity.IMSI;
import com.example.demo.serviceImpl.CountryService;

@RestController
@RequestMapping("country")
public class CountryDetailController {
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/getDetail")
	public List<Country> getCountryList(){
		return countryService.getDetail();
	}
	
	@PostMapping("/createCountry")
	public void createCountry(@RequestBody Country country) {
		countryService.createCountry(country);
	}
	
	@GetMapping("/getDetailByCountryName")
	public Country findCountryByCountryName(@RequestParam() String countryName ) {
		return countryService.findByCountryName(countryName);
		
	}
	
	@PostMapping("/createiMSI")
	public void createiMSI(@RequestBody IMSI imsi) {
		countryService.createImsi(imsi);
	}
	
	@GetMapping("/getImsiDetail")
	public List<Country> getImsiList(){
		return countryService.getDetail();
	}

}
