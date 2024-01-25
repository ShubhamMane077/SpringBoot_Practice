package com.nt.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Patient;

public interface PatientDao extends CrudRepository<Patient, Integer> {

	@Override
	List<Patient> findAll();
}
