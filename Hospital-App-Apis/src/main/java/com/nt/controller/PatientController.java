package com.nt.controller;

import com.nt.payloads.PatientRequestDto;
import com.nt.payloads.PatientResponseDto;
import com.nt.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

	@Autowired
	private PatientService patientService;

	@PostMapping("/add")
	public String addPatient(@RequestBody PatientRequestDto patientRequestDto) {
		patientService.addPatient(patientRequestDto);
		return"Patient Added Successfully.";
	}

	@PutMapping("/update")
	public String updatePatient(@RequestBody PatientRequestDto patientRequestDto) {
		patientService.updatePatient(patientRequestDto);
		return"Patient Updated Successfully.";
	}

	@GetMapping("/all")
	public List<PatientResponseDto> getAllPatients() {
		return patientService.getAllPatients();
	}

	@GetMapping("/{id}")
	public PatientResponseDto getPatientById(@PathVariable int id) {
		return patientService.getPatientById(id);
	}
	
	@DeleteMapping("/{id}")
	public String deletePatientById(@PathVariable int id) {
		patientService.deletePatientById(id);
		return"Patient Deleted Successfully.";
	}
}
