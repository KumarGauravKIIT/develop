package com.mac.microservices.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("account-service")
public class AccountConfiguration {
	private String url;
	private String user;
	private String password;
	
	

}
