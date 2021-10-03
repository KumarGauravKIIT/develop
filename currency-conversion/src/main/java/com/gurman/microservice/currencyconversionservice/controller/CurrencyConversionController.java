package com.gurman.microservice.currencyconversionservice.controller;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.gurman.microservice.currencyconversionservice.model.CurrencyConversion;
import com.gurman.microservice.currencyconversionservice.proxy.CurrencyExchangeProxy;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExchangeProxy proxy;
	
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateCurrencyConversion(
			@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity) {
		
		HashMap<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		
		
		
		ResponseEntity<CurrencyConversion> responseEntity	=  new RestTemplate()
				.getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversion.class, uriVariables);
		
		CurrencyConversion cc = responseEntity.getBody();
		System.out.println(toString());
		
		return new CurrencyConversion(cc.getId(), from, to, quantity, cc.getConversionMultiple(), 
				quantity.multiply(cc.getConversionMultiple()), cc.getEnvironment()+"from RestTemplate");
		
		
	}
	
	
	@GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateCurrencyConversionfeign(
			@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity) {
	
	
		CurrencyConversion cc = proxy.retriveCurrencyExchange(from, to);
		
		return new CurrencyConversion(cc.getId(), from, to, quantity, cc.getConversionMultiple(), 
				quantity.multiply(cc.getConversionMultiple()), cc.getEnvironment()+"from feign");
		
		
	}

}
