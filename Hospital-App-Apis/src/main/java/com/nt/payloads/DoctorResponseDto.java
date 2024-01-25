package com.nt.payloads;

import java.util.List;


public class DoctorResponseDto {

    private int id;
    private String firstName;
    private String lastName;
    private String specialization;
    private String email;
    private String phoneNumber;
    private String experience;
    private String status;
    private String branch;
    private Integer consultationFee;
    private String availableDays;
    private String availableTimeSlots;
    private String qualifications;

    private List<PatientResponseDto> patients; // Add this field for the list of patients

    public DoctorResponseDto() {
    }

    public DoctorResponseDto(int id, String firstName, String lastName, String specialization, String email,
            String phoneNumber, String experience, String status, String branch, Integer consultationFee,
            String availableDays, String availableTimeSlots, String qualifications, List<PatientResponseDto> patients) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
        this.status = status;
        this.branch = branch;
        this.consultationFee = consultationFee;
        this.availableDays = availableDays;
        this.availableTimeSlots = availableTimeSlots;
        this.qualifications = qualifications;
        this.patients = patients;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAvailableTimeSlots() {
        return availableTimeSlots;
    }

    public void setAvailableTimeSlots(String availableTimeSlots) {
        this.availableTimeSlots = availableTimeSlots;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public List<PatientResponseDto> getPatients() {
        return patients;
    }

    public void setPatients(List<PatientResponseDto> patients) {
        this.patients = patients;
    }
}
