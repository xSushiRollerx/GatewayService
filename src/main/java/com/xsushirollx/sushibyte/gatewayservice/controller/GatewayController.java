package com.xsushirollx.sushibyte.gatewayservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GatewayController {
	private final String RESTAURANT_SERVICE_URL = "http://localhost:8040/";
	//<--------------------------------------------------------Restaurant Service---------------------------------------------->
	@GetMapping(path = "/restaurants/all/{page}")
	public void getAllRestaurants() {
		RestTemplate template = new RestTemplate();
	}
	
}
