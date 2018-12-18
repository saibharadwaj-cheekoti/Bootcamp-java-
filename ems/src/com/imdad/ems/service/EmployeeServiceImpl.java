package com.imdad.ems.service;

import java.util.List;

import com.imdad.ems.model.Employee;
import com.imdad.ems.repository.EmployeeRepository;
import com.imdad.ems.repository.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {
	 
	EmployeeRepository employeeRepository; //= new HibernateEmployeeRepositoryImpl();
	
	public EmployeeServiceImpl() {
		System.out.println("Default Constructor fired");
		this.employeeRepository = employeeRepository;
	}
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		System.out.println("Constructor fired ");
		this.employeeRepository = employeeRepository;
	}

	/* (non-Javadoc)
	 * @see com.imdad.ems.service.EmployeeService#getAllEmployees()
	 */
	@Override
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Setter fired");
		this.employeeRepository = employeeRepository;
	}
	
	

}
