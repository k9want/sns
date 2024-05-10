package com.example.sns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
public class SnsApplication {
	public static void main(String[] args) {
		SpringApplication.run(SnsApplication.class, args);
	}

}
