package com.xsushirollx.sushibyte.gatewayservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@Configuration
public class RouteConfiguration {
	
	@Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/restaurant/**")
                        .uri("lb://RESTAURANT-SERVICE"))
                .route(r -> r.path("/restaurants/**")
                        .uri("lb://RESTAURANT-SERVICE"))
                .route(r -> r.path("/food/**")
                        .uri("lb://RESTAURANT-SERVICE"))
                .route(r -> r.path("/order/**")
                        .uri("lb://ORDER-SERVICE"))
                .route(r -> r.path("customer/**")
                        .uri("lb://ORDER-SERVICE"))
                .route(r -> r.path("/users/**")
                        .uri("lb://USER-SERVICE"))
                .route(r -> r.path("/admin/**")
                        .uri("lb://USER-SERVICE"))
                .route(r -> r.path("/admins/**")
                        .uri("lb://RESTAURANT-SERVICE"))
                .route(r -> r.path("/authentication/**")
                        .uri("lb://AUTHENTICATION-SERVICE"))
                .build();
    }
}
