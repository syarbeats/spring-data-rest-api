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
	
	@Transactional
	public Employee getEmployeeById(int id) {
		return empRepo.findById(id).get();
	}
	
	@Transactional
	public Employee updateEmployeeSalary(Employee emp) {
		empRepo.save(emp);
		return emp;
	}
	
	@Transactional
	public Employee addEmployee(Employee emp) {
		return empRepo.save(emp);
	}
	
	@Transactional
	public void deleteEmployee(Employee emp) {
		 empRepo.delete(emp);
	}
}
