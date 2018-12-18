package com.imdad.ems.repository;


import java.util.ArrayList;
import java.util.List;

import com.imdad.ems.model.Employee;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	/* (non-Javadoc)
	 * @see com.imdad.ems.model.EmployeeRepository#getAllEmployees()
	 */
	@Override
	public List<Employee> getAllEmployees(){
		
		List<Employee> employees = new ArrayList<>();
		Employee employee = new Employee();
		employee.setLocation("Colombo");
		employee.setName("Imdad");
		employees.add(employee);
		return employees;
		
		
		
	}

}
