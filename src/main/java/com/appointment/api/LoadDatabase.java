package com.appointment.api;

import com.appointment.models.Appointment;
import com.appointment.repositories.AppointmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class LoadDatabase {
    private static final Logger log= LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initialDatabase(AppointmentRepository appRepository){

        return args -> {
            log.info("preloading" + appRepository.save(new Appointment("jones", "jean", new Date(2022-01-13), new Date(2022-01-16))));
        };


    }


}
