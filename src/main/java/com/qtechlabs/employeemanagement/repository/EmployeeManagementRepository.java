package com.qtechlabs.employeemanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.qtechlabs.employeemanagement.contract.repository.Employee;

public interface EmployeeManagementRepository extends CrudRepository<Employee, Long> {

}
