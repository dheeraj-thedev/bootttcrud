package com.trainingbasket.bootcrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trainingbasket.bootcrud.model.Employee;
import com.trainingbasket.bootcrud.model.EmployeeDTO;
import com.trainingbasket.bootcrud.repository.EmployeeRepository;
import com.trainingbasket.bootcrud.utils.ConvertUtils;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void createOrUpdateEmployee(EmployeeDTO empDTO) {
		employeeRepository.save(new ConvertUtils().convertDtoToModel(empDTO));
	}

	@Override
	public List<EmployeeDTO> getAllEmployee() {
		List<Employee> employees = employeeRepository.findAll();
		List<EmployeeDTO> dtos = new ArrayList<EmployeeDTO>();
		for (Employee emp : employees) {
			dtos.add(new ConvertUtils().convertModelToDto(emp));
		}
		return dtos;
	}

	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public EmployeeDTO editEmployee(Long id) {
		return new ConvertUtils().convertModelToDto(employeeRepository.getOne(id));
	}

}
