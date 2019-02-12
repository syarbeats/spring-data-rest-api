package com.spring.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import com.spring.crud.dao.EmployeeRepository;
import com.spring.crud.model.Employee;

@Service
public class EmployeeServices {

	@Autowired
	private EmployeeRepository empRepo;
	
	@Transactional
	public List<Employee> getEmployeeList(){
		
		return Lists.newArrayList(empRepo.findAll());
	}
	
}
