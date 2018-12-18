package com.imdad.ems;


import java.applet.AppletContext;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imdad.ems.model.Employee;
import com.imdad.ems.service.EmployeeService;
import com.imdad.ems.service.EmployeeServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
		//EmployeeService employeeService = new EmployeeServiceImpl();
		
		List<Employee> employees = employeeService.getAllEmployees();
		
		for(Employee employee: employees){
			System.out.println(employee.getName()+ " from "+ employee.getLocation());
		}
		

	}

}
