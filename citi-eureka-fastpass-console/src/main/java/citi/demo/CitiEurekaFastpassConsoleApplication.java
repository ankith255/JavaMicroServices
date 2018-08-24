package citi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class CitiEurekaFastpassConsoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitiEurekaFastpassConsoleApplication.class, args);
	}
}
