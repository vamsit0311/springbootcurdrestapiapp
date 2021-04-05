package com.accumed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@ComponentScan(basePackages = "com.accumed")
@EnableJpaAuditing
public class SpringbootRestApiCurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestApiCurdApplication.class, args);
	}

}
