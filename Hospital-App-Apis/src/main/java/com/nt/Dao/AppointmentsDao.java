package com.nt.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Appointments;

public interface AppointmentsDao extends CrudRepository<Appointments, Integer> {
	
	@Override
	List<Appointments> findAll();
}
