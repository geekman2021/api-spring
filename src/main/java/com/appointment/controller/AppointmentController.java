package com.appointment.controller;

import com.appointment.models.Appointment;
import com.appointment.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class AppointmentController {
    @Autowired
    AppointmentService apps;

    @GetMapping("/api/appointments")
    public List<Appointment> getAllAppointments() {
        return apps.getAppointments();
    }
    @GetMapping("/api/appointments/{id}")
    public Appointment getAppointment(@PathVariable int id) {
        return apps.getAppointmentById(id);
    }

    @PostMapping("/api/appointment")
    public void createAppointment(@RequestBody Appointment appointment) {
        apps.createAppointment(appointment);
    }

    @PostMapping("/api/appointments")
    public void createAppointments(@RequestBody List<Appointment> appointments) {
        apps.createAppointments(appointments);
    }

    @PutMapping("/api/appointments")
    public void updateAppointment(Appointment appointment) {
        apps.updateAppointment(appointment);
    }

    @DeleteMapping("/api/appointments/{id}")
    public void deleteAppointment(@PathVariable int id) {
        apps.deleteAppointment(id);
    }
}
