package com.saponko.web;

import com.fasterxml.classmate.AnnotationConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.saponko.persistance.users", "com.saponko.web"})
@ComponentScan(basePackages = {"com.saponko"})
@EnableJpaRepositories(basePackages = "com.saponko.persistance.repositories")
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
}
