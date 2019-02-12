package com.spring.crud.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.spring.crud.model.Employee;

public interface EmployeeRepositoryWithPaging extends PagingAndSortingRepository<Employee, Integer>  {

}
