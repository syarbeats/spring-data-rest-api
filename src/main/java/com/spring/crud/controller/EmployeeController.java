package com.spring.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.crud.model.Employee;
import com.spring.crud.services.EmployeeServices;

@Controller
public class EmployeeController {

	private final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	private EmployeeServices employeeService;
	
	@RequestMapping(value = "/employeeList", method = RequestMethod.GET)
	public String getEmployeeList(Model model){
		List<Employee> empList = getEmployeeService().getEmployeeList();
		model.addAttribute("empList", empList);
		return "employee_list";
	}
	
	@RequestMapping(value = EmployeeRestURI.GET_EMPLOYEE_LIST, method = RequestMethod.GET)
	public @ResponseBody List<Employee> getAllEmployees(){
		logger.info("Getting all employees data....");
		List<Employee> empList = getEmployeeService().getEmployeeList();
		return empList;
		
	}

	public EmployeeServices getEmployeeService() {
		return employeeService;
	}

	@Autowired
	public void setEmployeeService(EmployeeServices employeeService) {
		this.employeeService = employeeService;
	}

	
}
