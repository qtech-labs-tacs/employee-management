package com.qtechlabs.employeemanagement.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qtechlabs.employeemanagement.model.Employee;

@Repository
public class EmployeeRepositoryImplementation {

	@Autowired
	private EmployeeRepository repository;

	
	public boolean insertIntoEmployeeTable(Employee employee) {
		repository.save(employee);
		return true;
	}
	
	

	public Employee selectFromEmployeeTable(Long employeeId) {
		Optional<Employee> employeeOptional = repository.findById(employeeId);
		if (employeeOptional.isPresent()) {
			Employee employee = employeeOptional.get();
			return employee;
		}
		return null;
	}

	
	
	
	public Employee updateIntoEmployeeTable(Employee employee) {
		Employee emp = repository.save(employee);
		return emp;
	}

	public boolean deleteFromEmployeeTable(Long employeeId) {
		repository.deleteById(employeeId);
		return true;
	}

}
