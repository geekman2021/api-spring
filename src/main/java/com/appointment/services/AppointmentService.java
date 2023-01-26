package com.appointment.services;

import com.appointment.models.Appointment;
import com.appointment.repositories.AppointmentRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepo;

    public Optional<Appointment> getAppointment(final Long id) {
        return appointmentRepo.findById(id);
    }

    public Iterable<Appointment> getAllAppointment() {
        return  appointmentRepo.findAll();
    }

    public void deleteAppointment(final Long id) {
        appointmentRepo.deleteById(id);
    }

    public Appointment saveAppointment(Appointment appointment) {
        Appointment app= appointmentRepo.save(appointment);
        return app;
    }
}
