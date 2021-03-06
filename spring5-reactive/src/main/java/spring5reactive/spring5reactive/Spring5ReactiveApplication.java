package spring5reactive.spring5reactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@ComponentScan(basePackages = {"spring5reactive"})
@EntityScan(basePackages = "spring5reactive")
@EnableJpaRepositories(basePackages = "spring5reactive")
@EnableAutoConfiguration
public class Spring5ReactiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring5ReactiveApplication.class, args);
    }
}
