package com.gurman.microservice.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gurman.microservice.currencyexchangeservice.bean.CurrencyExchange;
import com.gurman.microservice.currencyexchangeservice.dao.CurrencyExchangeRepository;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	CurrencyExchangeRepository repository;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retriveCurrencyExchange(@PathVariable String from, @PathVariable String to) {
//		return new CurrencyExchange(1000L, from, to, BigDecimal.valueOf(50), "");
		
		return repository.findByFromAndTo(from, to);
		
	}
	
	

}
