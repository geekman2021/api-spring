package com.appointment.controller;

import com.appointment.models.Appointment;
import com.appointment.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppointmentController {
    @Autowired
    AppointmentService apps;

    @GetMapping("/appointment")
    public Iterable<Appointment> getAppointments() {
        return apps.getAllAppointment();
    }

    @PostMapping("/appointment")
    public Appointment postAppointment(Appointment app) {
        return apps.saveAppointment(app);
    }

    @DeleteMapping("/deleteAppointment")
    public void deleteAppointment(Long id) {
        apps.deleteAppointment(id);
    }

}
