package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long>{
 // public Country findByCountryName(String countryName);
  
  @Query("SELECT e FROM Country e WHERE e.countryName = :countryName")
  Country findByCountryName(@Param("countryName") String encryptedSensitiveData);
}
