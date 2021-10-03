package com.gurman.microservice.currencyconversionservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.gurman.microservice.currencyconversionservice.model.CurrencyConversion;

@Component
//@FeignClient(name="currency-exchange", url="http://localhost:8000/")
@FeignClient(name="currency-exchange")
public interface CurrencyExchangeProxy {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retriveCurrencyExchange(@PathVariable String from, @PathVariable String to);

}
