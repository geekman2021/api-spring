package com.appointment.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Appointment {
    private String doctor;

    private String patient;
    @Column(name="date_start")
    private Date start;
    @Column(name="date_end")
    private Date end;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
