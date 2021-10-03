package com.mac.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mac.microservices.model.Account;
import com.mac.microservices.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;

	@GetMapping("/accounts")
	public Account retriveAccount() {
		return accountService.retriveAccount();
	}
}
