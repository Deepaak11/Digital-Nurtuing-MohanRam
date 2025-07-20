package com.cognizant.apigateway.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GlobalFilterConfig {

    private static final Logger logger = LoggerFactory.getLogger(GlobalFilterConfig.class);

    @Bean
    public GlobalFilter logRequests() {
        return (exchange, chain) -> {
            logger.info("Request URI: {}", exchange.getRequest().getURI());
            return chain.filter(exchange);
        };
    }
}
