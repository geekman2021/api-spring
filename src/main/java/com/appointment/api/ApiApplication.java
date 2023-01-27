package com.appointment.api;

import com.appointment.models.Appointment;
import com.appointment.repositories.AppointmentRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

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

	}
}
