package com.ensias.albc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {"com.ensias.albc.*"})
@EnableJpaRepositories(basePackages = {"com.ensias.albc.repository"})
public class AlbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlbcApplication.class, args);
	}

}
