package com.nt.payloads;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.nt.entity.Doctor;

public class PatientRequestDto {

	private int patientId;
	private String firstName;
	private String lastName;
	private String gender;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfBirth;
	
	private String address;
	private String phoneNumber;
	private String email;
	private String emergencyContactName;
	private String emergencyContactNumber;
	private String bloodType;
	private String allergies;
	private String medicalHistory;
	private String occupation;
	private String maritalStatus;
	private String nationality;
	private String languageSpoken;
	private String religion;
	
	private Doctor doctorId;

	// Constructors

	public PatientRequestDto() {
	}

	public PatientRequestDto(int patientId, String firstName, String lastName, String gender,
			LocalDate dateOfBirth, String address, String phoneNumber, String email, String emergencyContactName,
			String emergencyContactNumber, String bloodType, String allergies, String medicalHistory, String occupation,
			String maritalStatus, String nationality, String languageSpoken, String religion, Doctor doctorId) {
		this.patientId = patientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.emergencyContactName = emergencyContactName;
		this.emergencyContactNumber = emergencyContactNumber;
		this.bloodType = bloodType;
		this.allergies = allergies;
		this.medicalHistory = medicalHistory;
		this.occupation = occupation;
		this.maritalStatus = maritalStatus;
		this.nationality = nationality;
		this.languageSpoken = languageSpoken;
		this.religion = religion;
		this.doctorId = doctorId;
	}

	// Getters and Setters

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	public String getEmergencyContactNumber() {
		return emergencyContactNumber;
	}

	public void setEmergencyContactNumber(String emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public String getMedicalHistory() {
		return medicalHistory;
	}

	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getLanguageSpoken() {
		return languageSpoken;
	}

	public void setLanguageSpoken(String languageSpoken) {
		this.languageSpoken = languageSpoken;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public Doctor getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Doctor doctorId) {
		this.doctorId = doctorId;
	}
}
