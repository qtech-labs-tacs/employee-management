package com.qtechlabs.employeemanagement.repository;

import com.qtechlabs.employeemanagement.model.Employee;

public interface EmployeeManagementRepositoryContract {

	public boolean insertIntoEmployeeTable(Employee employee);

	public Employee selectFromEmployeeTable(Long employeeId);

	public Employee updateIntoEmployeeTable(Employee employee);

	public boolean deleteFromEmployeeTable(Long employeeId);
	
	
}
