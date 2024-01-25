package com.nt.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.payloads.AppointmentsRequestDto;
import com.nt.payloads.AppointmentsResponseDto;
import com.nt.service.AppointmentsServise;

@RestController
@RequestMapping("/appointments")
public class AppointmentsController {

	@Autowired
	private AppointmentsServise appointmentsServise;

	@PostMapping
	public String addAppointment(@RequestBody AppointmentsRequestDto appointmentsDto) {
		appointmentsServise.addAppointment(appointmentsDto);
		return "Appointment Added Successfull.";
	}

	@PutMapping
	public String updateAppointment(@RequestBody AppointmentsRequestDto appointmentsRequestDto) {
		appointmentsServise.addAppointment(appointmentsRequestDto);
		return "Appointment Updated Successfull.";
	}

	@GetMapping("/all")
	public List<AppointmentsResponseDto> getAllAppointments() {
		return appointmentsServise.getAllAppointments();
	}

	@GetMapping("/id/{id}")
	public AppointmentsResponseDto getAppointmentById(@PathVariable int id) {
		return appointmentsServise.getAppointmentById(id);
	}
	
	@DeleteMapping("/id/{id}")
	public String deleteAppointmentById(@PathVariable int id) {
		appointmentsServise.deleteAppointmentById(id);
		return "Appointment Successfully Deleted.";
	}
}
