package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Dao.DoctorDao;
import com.nt.entity.Doctor;
import com.nt.payloads.DoctorRequestDto;
import com.nt.payloads.DoctorResponseDto;

@Service
public class DoctorService {

	@Autowired
	private DoctorDao doctorDao;

	public void addDoctor(DoctorRequestDto doctorDto) {

		Doctor doctor = new Doctor();
		doctor.setId(doctorDto.getId());
		doctor.setFirstName(doctorDto.getFirstName());
		doctor.setLastName(doctorDto.getLastName());
		doctor.setSpecialization(doctorDto.getSpecialization());
		doctor.setEmail(doctorDto.getEmail());
		doctor.setPhoneNumber(doctorDto.getPhoneNumber());
		doctor.setAddress(doctorDto.getAddress());
		doctor.setExperience(doctorDto.getExperience());
		doctor.setStatus(doctorDto.getStatus());
		doctor.setBranch(doctorDto.getBranch());
		doctor.setConsultationFee(doctorDto.getConsultationFee());
		doctor.setAvailableDays(doctorDto.getAvailableDays());
		doctor.setAvailableTimeSlots(doctorDto.getAvailableTimeSlots());
		doctor.setJoiningDate(doctorDto.getJoiningDate());
		doctor.setQualifications(doctorDto.getQualifications());

		doctorDao.save(doctor);

	}

	public void updateDoctor(DoctorRequestDto doctorDto) {

		Doctor doctor = new Doctor();
		doctor.setId(doctorDto.getId());
		doctor.setFirstName(doctorDto.getFirstName());
		doctor.setLastName(doctorDto.getLastName());
		doctor.setSpecialization(doctorDto.getSpecialization());
		doctor.setEmail(doctorDto.getEmail());
		doctor.setPhoneNumber(doctorDto.getPhoneNumber());
		doctor.setAddress(doctorDto.getAddress());
		doctor.setExperience(doctorDto.getExperience());
		doctor.setStatus(doctorDto.getStatus());
		doctor.setBranch(doctorDto.getBranch());
		doctor.setConsultationFee(doctorDto.getConsultationFee());
		doctor.setAvailableDays(doctorDto.getAvailableDays());
		doctor.setAvailableTimeSlots(doctorDto.getAvailableTimeSlots());
		doctor.setJoiningDate(doctorDto.getJoiningDate());
		doctor.setQualifications(doctorDto.getQualifications());

		doctorDao.save(doctor);

	}

	public List<DoctorResponseDto> getAllDoctors() {
		List<Doctor> doctorList = doctorDao.findAll();
		List<DoctorResponseDto> doctorDtoList = new ArrayList<>();
		// doctorList.stream().map(doc->mapDoctorDto(doc)).collect(Collectors.toList());

		for (Doctor doctor : doctorList) {
			DoctorResponseDto doctorDto = new DoctorResponseDto();

			doctorDto.setId(doctor.getId());
			doctorDto.setFirstName(doctor.getFirstName());
			doctorDto.setLastName(doctor.getLastName());
			doctorDto.setSpecialization(doctor.getSpecialization());
			doctorDto.setEmail(doctor.getEmail());
			doctorDto.setPhoneNumber(doctor.getPhoneNumber());
			doctorDto.setExperience(doctor.getExperience());
			doctorDto.setStatus(doctor.getStatus());
			doctorDto.setBranch(doctor.getBranch());
			doctorDto.setConsultationFee(doctor.getConsultationFee());
			doctorDto.setAvailableDays(doctor.getAvailableDays());
			doctorDto.setAvailableTimeSlots(doctor.getAvailableTimeSlots());
			doctorDto.setQualifications(doctor.getQualifications());
			doctorDtoList.add(doctorDto);
		}

		return doctorDtoList;
	}

	public DoctorResponseDto getDoctorById(int id) {
		Optional<Doctor> opt = doctorDao.findById(id);

		if (opt.isPresent()) {
			Doctor doctor = opt.get();
			DoctorResponseDto doctorDto = new DoctorResponseDto();

			doctorDto.setId(doctor.getId());
			doctorDto.setFirstName(doctor.getFirstName());
			doctorDto.setLastName(doctor.getLastName());
			doctorDto.setSpecialization(doctor.getSpecialization());
			doctorDto.setEmail(doctor.getEmail());
			doctorDto.setPhoneNumber(doctor.getPhoneNumber());
			doctorDto.setExperience(doctor.getExperience());
			doctorDto.setStatus(doctor.getStatus());
			doctorDto.setBranch(doctor.getBranch());
			doctorDto.setConsultationFee(doctor.getConsultationFee());
			doctorDto.setAvailableDays(doctor.getAvailableDays());
			doctorDto.setAvailableTimeSlots(doctor.getAvailableTimeSlots());
			doctorDto.setQualifications(doctor.getQualifications());
			return doctorDto;
		}
		return null;
	}

	public void deleteDoctorById(int id) {
		doctorDao.deleteById(id);
	}

}
