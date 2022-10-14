package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@ComponentScan(basePackages= {"com.example.demo"})
@EntityScan({"com.example.demo.entity"})
public class DemoProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoProject1Application.class, args);
	}

}
