package com.trainingbasket.bootcrud.utils;

import com.trainingbasket.bootcrud.model.Employee;
import com.trainingbasket.bootcrud.model.EmployeeDTO;

public class ConvertUtils {
	public EmployeeDTO convertModelToDto(Employee employee) {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setAge(employee.getAge());
		dto.setBloodGroup(employee.getBloodGroup());
		dto.setEmailID(employee.getEmailID());
		dto.setFirstName(employee.getFirstName());
		dto.setId(employee.getId());
		dto.setLastName(employee.getLastName());
		dto.setMobileNumber(employee.getMobileNumber());
		dto.setPersonalEmail(employee.getPersonalEmail());
		dto.setUserName(employee.getUserName());
		return dto;
	}

	public Employee convertDtoToModel(EmployeeDTO empDTO) {
		Employee employee = new Employee();
		if (empDTO.getId() != null) {
			employee.setId(empDTO.getId());
		}
		employee.setAge(empDTO.getAge());
		employee.setBloodGroup(empDTO.getBloodGroup());
		employee.setEmailID(empDTO.getEmailID());
		employee.setFirstName(empDTO.getFirstName());
		employee.setLastName(empDTO.getLastName());
		employee.setMobileNumber(empDTO.getMobileNumber());
		employee.setPersonalEmail(empDTO.getPersonalEmail());
		employee.setUserName(empDTO.getUserName());
		return employee;
	}

}
