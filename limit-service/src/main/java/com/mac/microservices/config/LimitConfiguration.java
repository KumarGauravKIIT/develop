package com.mac.microservices.config;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Data
@Component
@ConfigurationProperties("limit-service")
public class LimitConfiguration {
    private int minimum;
    private int maximum;
}
