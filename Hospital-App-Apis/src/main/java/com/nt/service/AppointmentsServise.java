package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Dao.AppointmentsDao;
import com.nt.Dao.DoctorDao;
import com.nt.Dao.PatientDao;
import com.nt.entity.Appointments;
import com.nt.entity.Doctor;
import com.nt.entity.Patient;
import com.nt.payloads.AppointmentsRequestDto;
import com.nt.payloads.AppointmentsResponseDto;


@Service
public class AppointmentsServise {

	@Autowired
	private PatientDao patientDao;

	@Autowired
	private DoctorDao doctorDao;

	@Autowired
	private AppointmentsDao appointmentsDao;

	public void addAppointment(AppointmentsRequestDto appointmentsDto) {
		Appointments appointment = new Appointments();
		appointment.setAppointmentId(appointmentsDto.getAppointmentId());

		int patientId = appointmentsDto.getPatientId();
		Optional<Patient> patientOpt = patientDao.findById(patientId);
		if (patientOpt.isPresent()) {
			Patient patient = patientOpt.get();
			appointment.setPatientId(patient);
		}

		int doctorId = appointmentsDto.getDoctorId();
		Optional<Doctor> doctorOpt = doctorDao.findById(doctorId);
		if (doctorOpt.isPresent()) {
			Doctor doctor = doctorOpt.get();
			appointment.setDoctorId(doctor);
		}

		appointment.setAppointmentDate(appointmentsDto.getAppointmentDate());
		appointment.setAppointmentTime(appointmentsDto.getAppointmentTime());
		appointment.setStatus(appointmentsDto.getStatus());
		appointment.setPhoneNumber(appointmentsDto.getPhoneNumber());
		appointment.setNotes(appointmentsDto.getNotes());
		appointment.setBranch(appointmentsDto.getBranch());
		appointmentsDao.save(appointment);
	}

	public List<AppointmentsResponseDto> getAllAppointments() {
		List<Appointments> list = appointmentsDao.findAll();
		List<AppointmentsResponseDto> appointmentsDtoList = new ArrayList<>();

		for (Appointments appointment : list) {
			AppointmentsResponseDto appointmentsDto = new AppointmentsResponseDto();
			appointmentsDto.setAppointmentId(appointment.getAppointmentId());
			appointmentsDto.setPatientId(appointment.getPatientId());
			appointmentsDto.setDoctorId(appointment.getDoctorId());
			appointmentsDto.setAppointmentDate(appointment.getAppointmentDate());
			appointmentsDto.setAppointmentTime(appointment.getAppointmentTime());
			appointmentsDto.setStatus(appointment.getStatus());
			appointmentsDto.setPhoneNumber(appointment.getPhoneNumber());
			appointmentsDto.setNotes(appointment.getNotes());
			appointmentsDto.setBranch(appointment.getBranch());
			appointmentsDtoList.add(appointmentsDto);
		}

		return appointmentsDtoList;
	}

	public AppointmentsResponseDto getAppointmentById(int id) {
		Optional<Appointments> appointmentOpt = appointmentsDao.findById(id);
		if (appointmentOpt.isPresent()) {
			Appointments appointment = appointmentOpt.get();
			AppointmentsResponseDto appointmentsDto = new AppointmentsResponseDto();
			appointmentsDto.setAppointmentId(appointment.getAppointmentId());
			appointmentsDto.setPatientId(appointment.getPatientId());
			appointmentsDto.setDoctorId(appointment.getDoctorId());
			appointmentsDto.setAppointmentDate(appointment.getAppointmentDate());
			appointmentsDto.setAppointmentTime(appointment.getAppointmentTime());
			appointmentsDto.setStatus(appointment.getStatus());
			appointmentsDto.setPhoneNumber(appointment.getPhoneNumber());
			appointmentsDto.setNotes(appointment.getNotes());
			appointmentsDto.setBranch(appointment.getBranch());
			return appointmentsDto;
		}
		return null;
	}

	public void deleteAppointmentById(int id) {
		appointmentsDao.deleteById(id);
	}

}
