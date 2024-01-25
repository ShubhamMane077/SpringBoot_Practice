package com.nt.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "appointments")
public class Appointments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "appointment_id")
    private int appointmentId;

    @ManyToOne
    @JoinColumn(name = "patient_id" ,nullable = false)
    private Patient patientId; 
    
    @ManyToOne
    @JoinColumn(name = "doctor_id",nullable = false)
    private Doctor doctorId;

    @Column(name = "appointment_date",nullable = false)
    private LocalDate appointmentDate; // TIMESTAMP NOT NULL,

    @Column(name = "appointment_time",nullable = false)
    private LocalTime appointmentTime; // TIME NOT NULL,

    @Column(name = "status",nullable = false)
    private String status = "Scheduled"; 

    @Column(name = "phone_number")
    private String phoneNumber; 

    @Column(name = "notes")
    private String notes; 

    @Column(name = "branch",nullable = false)
    private int branch;
    
    public Appointments() {}

    public Appointments(int appointmentId, Patient patient, Doctor doctor, LocalDate appointmentDate,
			LocalTime appointmentTime, String status, String phoneNumber, String notes, int branch) {
		super();
		this.appointmentId = appointmentId;
		this.patientId = patient;
		this.doctorId = doctor;
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

	public void setDoctorId(Doctor doctor) {
		this.doctorId = doctor;
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
