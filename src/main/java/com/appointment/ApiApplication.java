package com.appointment;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Data
@SpringBootApplication()
public class ApiApplication  {
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
}
