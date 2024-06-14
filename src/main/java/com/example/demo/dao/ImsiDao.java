package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.IMSI;

public interface ImsiDao extends JpaRepository<IMSI, Long>{

}
