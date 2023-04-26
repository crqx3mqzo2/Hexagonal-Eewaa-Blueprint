package com.saajf.manager.eewaapro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.saajf.manager.eewaapro.domain.interfaces.repositories")
@EntityScan("com.saajf.manager.eewaapro.domain.entities")
@ComponentScan("com.saajf.manager.eewaapro")
public class EewaaproApplication {

	public static void main(String[] args) {
		SpringApplication.run(EewaaproApplication.class, args);
	}

}
