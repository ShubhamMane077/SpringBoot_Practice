package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctors")
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "specialization")
	private String specialization;

	@Column(name = "email")
	private String email;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "address")
	private String address;

	@Column(name = "experience")
	private String experience;

	@Column(name = "status")
	private String status;

	@Column(name = "branch")
	private String branch;

	@Column(name = "consultation_fee")
	private Integer consultationFee;

	@Column(name = "available_days")
	private String availableDays;

	@Column(name = "available_time_slots")
	private String availableTimeSlots;

	@Column(name = "joining_date")
	private String joiningDate;

	@Column(name = "qualifications")
	private String qualifications;

	public Doctor() {
	}

	public Doctor(int doctorId, String firstName, String lastName, String specialization, String email,
			String phoneNumber, String address, String experience, String status, String branch,
			Integer consultationFee, String availableDays, String availableTimeSlots, String joiningDate,
			String qualifications) {
		super();
		this.id = doctorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.specialization = specialization;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.experience = experience;
		this.status = status;
		this.branch = branch;
		this.consultationFee = consultationFee;
		this.availableDays = availableDays;
		this.availableTimeSlots = availableTimeSlots;
		this.joiningDate = joiningDate;
		this.qualifications = qualifications;
//		this.patients = patients;
	}

	public String getAvailableTimeSlots() {
		return availableTimeSlots;
	}

	public void setAvailableTimeSlots(String availableTimeSlots) {
		this.availableTimeSlots = availableTimeSlots;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int doctorId) {
		this.id = doctorId;
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

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Integer getConsultationFee() {
		return consultationFee;
	}

	public void setConsultationFee(Integer consultationFee) {
		this.consultationFee = consultationFee;
	}

	public String getAvailableDays() {
		return availableDays;
	}

	public void setAvailableDays(String availableDays) {
		this.availableDays = availableDays;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getQualifications() {
		return qualifications;
	}

	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}

}
