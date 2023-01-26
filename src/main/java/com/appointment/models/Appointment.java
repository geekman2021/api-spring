package com.appointment.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
@Configuration
@ConfigurationProperties(prefix = "com.appointment")
@Data

@Entity
@Table(name="appointments")
public class Appointment {
    private String doctor="jones";

    private String patient;
    @Column(name="date_start")
    private Date start;
    @Column(name="date_end")
    private Date end;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
