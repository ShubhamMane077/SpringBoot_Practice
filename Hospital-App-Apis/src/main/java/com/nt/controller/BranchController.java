package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.service.BranchService;

@RestController
@RequestMapping("/branches")
public class BranchController {

	@Autowired
	private BranchService branchService ;
	
	@PostMapping
	public String addBranch() {
		
		
		return"";
	}
	
}
