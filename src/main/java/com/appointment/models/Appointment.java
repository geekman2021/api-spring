package com.appointment.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;


import java.util.Date;
@Configuration
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String doctor;
    private String patient;
    @Column(name = "date_starte")
    private Date start;
    @Column(name = "date_endy")
    private Date end;


}
