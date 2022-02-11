package com.example.cloud.gateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController

public class GatewayController {
	@RequestMapping("/jobDetailsServiceFallBack")
		public String jobDetailsServiceFallBackMethod() {
		return "Service is taking moretime than expected";
	}
}
