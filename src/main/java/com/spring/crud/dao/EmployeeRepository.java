package com.spring.crud.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.crud.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
