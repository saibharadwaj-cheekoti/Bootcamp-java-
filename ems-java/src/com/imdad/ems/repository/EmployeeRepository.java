package com.imdad.ems.repository;

import java.util.List;

import com.imdad.ems.model.Employee;



public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}