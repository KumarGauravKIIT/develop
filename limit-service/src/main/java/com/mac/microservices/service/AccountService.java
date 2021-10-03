package com.mac.microservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mac.microservices.config.AccountConfiguration;
import com.mac.microservices.model.Account;

@Service
public class AccountService {

	@Autowired
	AccountConfiguration accountConfiguration;
	
	public Account retriveAccount() {
		if(accountConfiguration.getUrl().equals("www.oracle.com/account/test")) {
			return new Account(123);
		}
		return null;
	}
}
