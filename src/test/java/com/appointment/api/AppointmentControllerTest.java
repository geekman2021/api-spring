package com.appointment.api;

import com.appointment.controller.AppointmentController;
import com.appointment.services.AppointmentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = AppointmentController.class)
public class AppointmentControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AppointmentService appservice;

    @Test
    public void testGetAppointments() {
            try {
                mockMvc.perform(get("/appointment"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
    }
}
