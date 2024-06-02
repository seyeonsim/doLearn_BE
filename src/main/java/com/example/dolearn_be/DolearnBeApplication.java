package com.example.dolearn_be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.config.EnableReactiveMongoAuditing;

@EnableMongoAuditing
@EnableReactiveMongoAuditing
@SpringBootApplication
public class DolearnBeApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(DolearnBeApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}