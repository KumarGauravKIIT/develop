package com.gurman.microservice.currencyexchangeservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gurman.microservice.currencyexchangeservice.bean.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long>{
	
	CurrencyExchange findByFromAndTo(String from, String to);

}
