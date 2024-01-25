package com.nt.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Doctor;
import com.nt.payloads.DoctorRequestDto;

public interface DoctorDao extends CrudRepository<Doctor, Integer> {

	@Override
	List<Doctor> findAll();
}
