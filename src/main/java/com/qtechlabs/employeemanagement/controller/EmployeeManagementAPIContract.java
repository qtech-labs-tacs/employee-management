package com.qtechlabs.employeemanagement.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.qtechlabs.employeemanagement.dto.EmployeeDTO;

public interface EmployeeManagementAPIContract {

	
	// POST/CREATE/INSERT
	@PostMapping("/api/v1/employee/")
	public ResponseEntity<String> createEmployee(@RequestBody EmployeeDTO employeeDTO); 
	
	// GET/RETRIEVE/SELECT
	@GetMapping("/api/v1/employee/{employeeId}")
	public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable Long employeeId);
	
	
	// PUT/UPDATE/UPDATE
	@PutMapping("/api/v1/employee/{employeeId}")
	public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable Long employeeId, @RequestBody EmployeeDTO employeeDTO);
	
	
	// DELETE/DELETE/DELETE
	@DeleteMapping("/api/v1/employee/{employeeId}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Long employeeId);
	
	
}
