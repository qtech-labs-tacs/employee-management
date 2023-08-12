package com.qtechlabs.employeemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qtechlabs.employeemanagement.dto.EmployeeDTO;
import com.qtechlabs.employeemanagement.service.EmployeeManagementServiceContractImplementation;


@RestController
public class EmployeeManagementAPIContractImplementation implements EmployeeManagementAPIContract {

	@Autowired
	private EmployeeManagementServiceContractImplementation service;

	// POST/CREATE/INSERT
	@PostMapping("/api/v1/employee/")
	public ResponseEntity<String> createEmployee(@RequestBody EmployeeDTO employeeDTO) {
		service.createEmployee(employeeDTO);
		return new ResponseEntity<String>("Employee Created", HttpStatus.CREATED);
	}

	// GET/RETRIEVE/SELECT
	@GetMapping("/api/v1/employee/{employeeId}")
	public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable Long employeeId) {
		EmployeeDTO employee = service.getEmployee(employeeId);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}

	// PUT/UPDATE/UPDATE
	@PutMapping("/api/v1/employee/{employeeId}")
	public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable Long employeeId,
			@RequestBody EmployeeDTO employeeDTO) {
		EmployeeDTO updateEmployee = service.updateEmployee(employeeId, employeeDTO);
		return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
	}

	// DELETE/DELETE/DELETE
	@DeleteMapping("/api/v1/employee/{employeeId}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Long employeeId) {
		service.deleteEmployee(employeeId);
		return new ResponseEntity<String>("Employee Deleted", HttpStatus.OK);
	}

	
	
	
}
