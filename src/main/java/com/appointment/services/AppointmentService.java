package com.appointment.services;

import com.appointment.models.Appointment;
import com.appointment.repositories.AppointmentRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepo;

    /*public Optional<Appointment> getAppointment(final Long id) {
        return appointmentRepo.findById(id);
    }*/

    public List<Appointment> getAppointments() {
        return  appointmentRepo.findAll();
    }

    public Appointment getAppointmentById(Long id) {
        return appointmentRepo.findById(id).orElse(null);
    }

    public void createAppointment(Appointment appointment) {
        appointmentRepo.save(appointment);
    }

    public void createAppointments(List<Appointment> appointment) {
        appointmentRepo.saveAll(appointment);
    }

    public Appointment updateAppointment(Appointment appointment) {
        Optional<Appointment> optionalAppointment= appointmentRepo.findById(appointment.getId());
        if (optionalAppointment.isPresent()) {
            Appointment oldAppointment= optionalAppointment.get();
            oldAppointment.setDoctor(appointment.getDoctor());
            oldAppointment.setPatient(appointment.getPatient());
            oldAppointment.setEnd(appointment.getEnd());
            oldAppointment.setStart(appointment.getStart());
            appointmentRepo.save(oldAppointment);
            return oldAppointment;
        } else {
           return appointmentRepo.save(appointment);
        }
    }

    public String deleteAppointment(Long id) {
        appointmentRepo.deleteById(id);
        return "appointment deleted";
    }



}
