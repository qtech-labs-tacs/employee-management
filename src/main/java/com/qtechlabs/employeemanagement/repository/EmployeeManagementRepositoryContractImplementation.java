package com.qtechlabs.employeemanagement.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qtechlabs.employeemanagement.model.Employee;

@Repository
public class EmployeeManagementRepositoryContractImplementation implements EmployeeManagementRepositoryContract {

	@Autowired
	private EmployeeManagementRepository repository;

	
	@Override
	public boolean insertIntoEmployeeTable(Employee employee) {
		repository.save(employee);
		return true;
	}
	
	

	@Override
	public Employee selectFromEmployeeTable(Long employeeId) {
		Optional<Employee> employeeOptional = repository.findById(employeeId);
		if (employeeOptional.isPresent()) {
			Employee employee = employeeOptional.get();
			return employee;
		}
		return null;
	}

	
	
	
	@Override
	public Employee updateIntoEmployeeTable(Employee employee) {
		Employee emp = repository.save(employee);
		return emp;
	}

	@Override
	public boolean deleteFromEmployeeTable(Long employeeId) {
		repository.deleteById(employeeId);
		return true;
	}

}
