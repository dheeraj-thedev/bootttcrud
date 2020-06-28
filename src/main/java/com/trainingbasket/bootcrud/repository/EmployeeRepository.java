package com.trainingbasket.bootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trainingbasket.bootcrud.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
