package io.github.bibekshakya35.jpahibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "io.github.bibekshakya35")
@EnableAutoConfiguration
@EntityScan(basePackages = "io.github.bibekshakya35")
@ComponentScan(basePackages = "io.github.bibekshakya35")
public class JpahibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpahibernateApplication.class, args);
	}
}
