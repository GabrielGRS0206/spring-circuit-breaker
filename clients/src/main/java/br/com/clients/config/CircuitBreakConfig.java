package br.com.clients.config;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;

@Configuration
@Component
public class CircuitBreakConfig {

	@Bean
	public CircuitBreaker defaultCircuitBreaker() {
		CircuitBreakerConfig circuitBreakerConfig = CircuitBreakerConfig.custom()
				.failureRateThreshold(50)
				.slidingWindowSize(8)
				.minimumNumberOfCalls(4)
				.waitDurationInOpenState(Duration.ofMillis(6000))
				.recordExceptions(IOException.class, TimeoutException.class,DataIntegrityViolationException.class)
				.build();
		// Create a CircuitBreakerRegistry with a custom global configuration
		CircuitBreakerRegistry circuitBreakerRegistry = 
				CircuitBreakerRegistry.of(circuitBreakerConfig);

		// Get or create a CircuitBreaker from the CircuitBreakerRegistry 
		// with the global default configuration
		return circuitBreakerRegistry.circuitBreaker("notificationsApi"); 
	}

}
