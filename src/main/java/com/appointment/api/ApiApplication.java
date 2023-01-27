package com.appointment.api;

import com.appointment.models.Appointment;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Data
@SpringBootApplication(scanBasePackages = "com.appointment.models")
public class ApiApplication implements CommandLineRunner {

	@Autowired
	private Appointment appointment;



	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(appointment.getDoctor());
	}
}
