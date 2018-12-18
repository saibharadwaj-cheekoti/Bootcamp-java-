package com.imdad.ems.repository;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.imdad.ems.model.Employee;

@Repository
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	@Value("${name}")
	String name;
	
	@Value("${city}")
	String town;
	
	@Override
	public List<Employee> getAllEmployees(){
				
		List<Employee> employees = new ArrayList<>();
		Employee employee = new Employee();
		employee.setLocation(name);
		employee.setName(town);
		employees.add(employee);
		return employees;
		
		
		
	}

}
