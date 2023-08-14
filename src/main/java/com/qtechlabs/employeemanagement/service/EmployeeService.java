package com.qtechlabs.employeemanagement.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qtechlabs.employeemanagement.dto.EmployeeDTO;
import com.qtechlabs.employeemanagement.model.Employee;
import com.qtechlabs.employeemanagement.repository.EmployeeRepositoryImplementation;

@Service
public class EmployeeService{

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private EmployeeRepositoryImplementation repository;
	
	
	public boolean createEmployee(EmployeeDTO employeeDTO) {
		
		Employee employee = modelMapper.map(employeeDTO, Employee.class);
		repository.insertIntoEmployeeTable(employee);
		return true;
	}

	
	public EmployeeDTO getEmployee(Long employeeId) {
		Employee employee = repository.selectFromEmployeeTable(employeeId);
		EmployeeDTO employeeDTO = modelMapper.map(employee, EmployeeDTO.class);
		return employeeDTO;
	}


	
	
	public EmployeeDTO updateEmployee(Long employeeId, EmployeeDTO employeeDTO) {
		
		Employee employeeFromDatabase = repository.selectFromEmployeeTable(employeeId);
		employeeFromDatabase.setAddress(employeeDTO.getAddress());
		
		Employee updateIntoEmployeeTable = repository.updateIntoEmployeeTable(employeeFromDatabase);
		EmployeeDTO newEmployeeDTO = modelMapper.map(updateIntoEmployeeTable, EmployeeDTO.class);
		return newEmployeeDTO;
	}

	
	
	
	public boolean deleteEmployee(Long employeeId) {
		boolean deleteFromEmployeeTable = repository.deleteFromEmployeeTable(employeeId);
		return deleteFromEmployeeTable;
	}

	
	
}
