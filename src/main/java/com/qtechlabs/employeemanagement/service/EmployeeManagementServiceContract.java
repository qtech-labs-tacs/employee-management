package com.qtechlabs.employeemanagement.service;


import com.qtechlabs.employeemanagement.dto.EmployeeDTO;

public interface EmployeeManagementServiceContract {

	public boolean createEmployee(EmployeeDTO employeeDTO);

	public EmployeeDTO getEmployee(Long employeeId);

	public EmployeeDTO updateEmployee(Long employeeId, EmployeeDTO employeeDTO);

	public boolean deleteEmployee(Long employeeId);

}
