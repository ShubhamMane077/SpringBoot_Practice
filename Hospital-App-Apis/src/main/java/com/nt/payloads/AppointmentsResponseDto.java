package com.nt.payloads;

import java.time.LocalDate;
import java.time.LocalTime;

import com.nt.entity.Doctor;
import com.nt.entity.Patient;

public class AppointmentsResponseDto {
	
	private int appointmentId;

 	private Patient patientId; 
    
 	private Doctor doctorId;
    
    private LocalDate appointmentDate; // TIMESTAMP NOT NULL,

    private LocalTime appointmentTime ; 

    private String status = "Scheduled"; 

    private String phoneNumber; 

    private String notes; 

    private int branch;
    
    public AppointmentsResponseDto() {}

	public AppointmentsResponseDto(int appointmentId, Patient patientId, Doctor doctorId, LocalDate appointmentDate,
			LocalTime appointmentTime, String status, String phoneNumber, String notes, int branch) {
		super();
		this.appointmentId = appointmentId;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.status = status;
		this.phoneNumber = phoneNumber;
		this.notes = notes;
		this.branch = branch;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Patient getPatientId() {
		return patientId;
	}

	public void setPatientId(Patient patient) {
		this.patientId = patient;
	}

	public Doctor getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Doctor doctorId) {
		this.doctorId = doctorId;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public LocalTime getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(LocalTime appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getBranch() {
		return branch;
	}

	public void setBranch(int branch) {
		this.branch = branch;
	}
    
    
}
