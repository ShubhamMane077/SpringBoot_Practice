package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Dao.PatientDao;
import com.nt.entity.Patient;
import com.nt.payloads.PatientRequestDto;
import com.nt.payloads.PatientResponseDto;


@Service
public class PatientService {

	@Autowired
	private PatientDao patientDao;

//	@Autowired
//	private DoctorDao doctorDao;


	public void addPatient(PatientRequestDto patientRequestDto) {
		Patient patient = new Patient();

		patient.setPatientId(patientRequestDto.getPatientId());
		patient.setFirstName(patientRequestDto.getFirstName());
		patient.setLastName(patientRequestDto.getLastName());
		patient.setGender(patientRequestDto.getGender());
		patient.setDateOfBirth(patientRequestDto.getDateOfBirth());
		patient.setPhoneNumber(patientRequestDto.getPhoneNumber());
		patient.setAddress(patientRequestDto.getAddress());
		patient.setEmail(patientRequestDto.getEmail());
		patient.setEmergencyContactName(patientRequestDto.getEmergencyContactName());
		patient.setEmergencyContactNumber(patientRequestDto.getEmergencyContactNumber());
		patient.setBloodType(patientRequestDto.getBloodType());
		patient.setAllergies(patientRequestDto.getAllergies());
		patient.setMedicalHistory(patientRequestDto.getMedicalHistory());
		patient.setOccupation(patientRequestDto.getOccupation());
		patient.setMaritalStatus(patientRequestDto.getMaritalStatus());
		patient.setNationality(patientRequestDto.getNationality());
		patient.setLanguageSpoken(patientRequestDto.getLanguageSpoken());
		patient.setReligion(patientRequestDto.getReligion());

//		int doctorId = patientRequestDto.getDoctorId();
//		Optional<Doctor> doctorOpt = doctorDao.findById(doctorId);
//
//		if (doctorOpt.isPresent()) {
//			patient.setDoctor(doctorOpt.get());
//		} 
			
		patient.setDoctor(patientRequestDto.getDoctorId());
		patientDao.save(patient);
	}

	public void updatePatient(PatientRequestDto patientRequestDto) {
		Patient patient = new Patient();

		patient.setPatientId(patientRequestDto.getPatientId());
		patient.setFirstName(patientRequestDto.getFirstName());
		patient.setLastName(patientRequestDto.getLastName());
		patient.setGender(patientRequestDto.getGender());
		patient.setDateOfBirth(patientRequestDto.getDateOfBirth());
		patient.setPhoneNumber(patientRequestDto.getPhoneNumber());
		patient.setAddress(patientRequestDto.getAddress());
		patient.setEmail(patientRequestDto.getEmail());
		patient.setEmergencyContactName(patientRequestDto.getEmergencyContactName());
		patient.setEmergencyContactNumber(patientRequestDto.getEmergencyContactNumber());
		patient.setBloodType(patientRequestDto.getBloodType());
		patient.setAllergies(patientRequestDto.getAllergies());
		patient.setMedicalHistory(patientRequestDto.getMedicalHistory());
		patient.setOccupation(patientRequestDto.getOccupation());
		patient.setMaritalStatus(patientRequestDto.getMaritalStatus());
		patient.setNationality(patientRequestDto.getNationality());
		patient.setLanguageSpoken(patientRequestDto.getLanguageSpoken());
		patient.setReligion(patientRequestDto.getReligion());

//		int doctorId = patientRequestDto.getDoctorId();
//		Optional<Doctor> doctorOpt = doctorDao.findById(doctorId);
//
//		if (doctorOpt.isPresent()) {
//			patient.setDoctor(doctorOpt.get());
//		} 
//			

		patientDao.save(patient);
	}

	public List<PatientResponseDto> getAllPatients() {
		List<Patient> patientList = patientDao.findAll();
		List<PatientResponseDto> patientListDto = new ArrayList<>();
		
		for(Patient patient : patientList) {
			PatientResponseDto patientResponseDto = new PatientResponseDto();
			patientResponseDto.setPatientId(patient.getPatientId());
			patientResponseDto.setFirstName(patient.getFirstName());
			patientResponseDto.setLastName(patient.getLastName());
			patientResponseDto.setGender(patient.getGender());
			patientResponseDto.setDateOfBirth(patient.getDateOfBirth());
			patientResponseDto.setAddress(patient.getAddress());
			patientResponseDto.setPhoneNumber(patient.getPhoneNumber());
			patientResponseDto.setEmail(patient.getEmail());
			patientResponseDto.setEmergencyContactName(patient.getEmergencyContactName());
			patientResponseDto.setEmergencyContactNumber(patient.getEmergencyContactNumber());
			patientResponseDto.setBloodType(patient.getBloodType());
			patientResponseDto.setAllergies(patient.getAllergies());
			patientResponseDto.setMedicalHistory(patient.getMedicalHistory());
			patientResponseDto.setOccupation(patient.getOccupation());
			patientResponseDto.setMaritalStatus(patient.getMaritalStatus());
			patientResponseDto.setNationality(patient.getNationality());
			patientResponseDto.setLanguage_spoken(patient.getLanguageSpoken());
			patientResponseDto.setReligion(patient.getReligion());
			patientResponseDto.setDoctors(patient.getDoctor());
			
			patientListDto.add(patientResponseDto);
		}
		return patientListDto;
	}

	public PatientResponseDto getPatientById(int id) {
		Optional<Patient> patientOpt = patientDao.findById(id);
		if(patientOpt.isPresent()) {
			Patient patient = patientOpt.get();
			PatientResponseDto patientResponseDto = new PatientResponseDto();
			patientResponseDto.setPatientId(patient.getPatientId());
			patientResponseDto.setFirstName(patient.getFirstName());
			patientResponseDto.setLastName(patient.getLastName());
			patientResponseDto.setGender(patient.getGender());
			patientResponseDto.setDateOfBirth(patient.getDateOfBirth());
			patientResponseDto.setAddress(patient.getAddress());
			patientResponseDto.setPhoneNumber(patient.getPhoneNumber());
			patientResponseDto.setEmail(patient.getEmail());
			patientResponseDto.setEmergencyContactName(patient.getEmergencyContactName());
			patientResponseDto.setEmergencyContactNumber(patient.getEmergencyContactNumber());
			patientResponseDto.setBloodType(patient.getBloodType());
			patientResponseDto.setAllergies(patient.getAllergies());
			patientResponseDto.setMedicalHistory(patient.getMedicalHistory());
			patientResponseDto.setOccupation(patient.getOccupation());
			patientResponseDto.setMaritalStatus(patient.getMaritalStatus());
			patientResponseDto.setNationality(patient.getNationality());
			patientResponseDto.setLanguage_spoken(patient.getLanguageSpoken());
			patientResponseDto.setReligion(patient.getReligion());
			patientResponseDto.setDoctors(patient.getDoctor());
			return patientResponseDto;
		}
		return null;
	}

	public void deletePatientById(int id) {
		patientDao.deleteById(id);
	}

}
