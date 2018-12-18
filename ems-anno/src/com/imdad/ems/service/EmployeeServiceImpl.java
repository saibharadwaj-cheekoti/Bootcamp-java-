package com.imdad.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imdad.ems.model.Employee;
import com.imdad.ems.repository.EmployeeRepository;
import com.imdad.ems.repository.HibernateEmployeeRepositoryImpl;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	 @Autowired
	EmployeeRepository employeeRepository;// = new HibernateEmployeeRepositoryImpl();
	
	  public EmployeeServiceImpl() {
		System.out.println("default constructor");
	}
	
	@Override
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	

}
