package com.qtechlabs.employeemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qtechlabs.employeemanagement.contract.controller.EmployeeDTO;
import com.qtechlabs.employeemanagement.contract.controller.EmployeeManagementAPIContract;
import com.qtechlabs.employeemanagement.service.EmployeeManagementServiceContractImplementation;



@RestController
public class EmployeeManagementAPIContractImplementation implements EmployeeManagementAPIContract {

	@Autowired
	private EmployeeManagementServiceContractImplementation service;

	// POST/CREATE/INSERT
	@PostMapping("/api/v1/employee/")
	public String createEmployee(@RequestBody EmployeeDTO employeeDTO) {
		service.createEmployee(employeeDTO);
		return  "Employee Created";
	}

	// GET/RETRIEVE/SELECT
	@GetMapping("/api/v1/employee/{employeeId}")
	public EmployeeDTO getEmployee(@PathVariable Long employeeId) {
		EmployeeDTO employee = service.getEmployee(employeeId);
		return employee;
	}

	// PUT/UPDATE/UPDATE
	@PutMapping("/api/v1/employee/{employeeId}")
	public EmployeeDTO updateEmployee(@PathVariable Long employeeId,
			@RequestBody EmployeeDTO employeeDTO) {
		EmployeeDTO updateEmployee = service.updateEmployee(employeeId, employeeDTO);
		return updateEmployee;
	}

	// DELETE/DELETE/DELETE
	@DeleteMapping("/api/v1/employee/{employeeId}")
	public String deleteEmployee(@PathVariable Long employeeId) {
		service.deleteEmployee(employeeId);
		return "Employee Deleted";
	}

	
	
	
}
