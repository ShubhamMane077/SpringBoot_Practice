package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Ward {
	
	@Column(name = "ward_id")
	int wardId ;
	
	@Column(name = "ward_name")
	String wardName ;
	
	@Column(name = "max_capacity")
	int maxCapacity ;
	
	@Column(name = "current_occupancy")
	int currentOccupancy = 0;
	
	@Column(name = "floor_number")
	int floorNumber ;

	@Column(name = "wing")
	String wing ;
	    
	@ManyToOne
	@JoinColumn(name = "branch")
	Branch branch ;

	@Column(name = "status")
	String status = "Active";
	
	@Column(name = "charges")
	int charges ;

}
