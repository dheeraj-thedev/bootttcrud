package com.trainingbasket.bootcrud.service;

import java.util.List;

import com.trainingbasket.bootcrud.model.EmployeeDTO;

public interface EmployeeService {

	public void createOrUpdateEmployee(EmployeeDTO empDTO);

	public List<EmployeeDTO> getAllEmployee();

	public void deleteEmployee(Long id);

	public EmployeeDTO editEmployee(Long id);
}

// DTO Data Transformation Objects

// When we write any Hibernate or JPA bean we have to annotate that bean with many 
//validations and database specific generators