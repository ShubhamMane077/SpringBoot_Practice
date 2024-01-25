package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.payloads.DoctorRequestDto;
import com.nt.payloads.DoctorResponseDto;
import com.nt.service.DoctorService;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;

	@PostMapping
	public String addDoctor(@RequestBody DoctorRequestDto doctorDto) {
		doctorService.addDoctor(doctorDto);
		return "Doctor Added Successful.";
	}

	@PutMapping
	public String updateDoctor(@RequestBody DoctorRequestDto doctorRequestDto) {
		doctorService.updateDoctor(doctorRequestDto);
		return "Doctor Updation Successful.";
	}
	
	@GetMapping(value = "/all")
	public List<DoctorResponseDto> getAllDoctors(){
		return doctorService.getAllDoctors();
	}
	@GetMapping(value = "/id/{id}")
	public DoctorResponseDto getDoctorById(@PathVariable int id) {
		return doctorService.getDoctorById(id);
	}
	
	@DeleteMapping(value = "/id/{id}")
	public String deleteDoctorById (@PathVariable int id) {
		doctorService.deleteDoctorById(id);
		return "Doctor deleted successfull.";
	}
	
}

