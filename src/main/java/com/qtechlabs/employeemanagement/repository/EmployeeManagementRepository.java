package com.qtechlabs.employeemanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.qtechlabs.employeemanagement.model.Employee;

public interface EmployeeManagementRepository extends CrudRepository<Employee, Long> {

}
