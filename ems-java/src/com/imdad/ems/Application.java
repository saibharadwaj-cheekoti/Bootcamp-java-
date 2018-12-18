package com.imdad.ems;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imdad.ems.config.ApplicationConfiguration;
import com.imdad.ems.model.Employee;
import com.imdad.ems.service.EmployeeService;
import com.imdad.ems.service.EmployeeServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
		EmployeeService employeeService2 = applicationContext.getBean("employeeService", EmployeeService.class);
		//EmployeeService employeeService = new EmployeeServiceImpl();
		
		List<Employee> employees = employeeService.getAllEmployees();
		
		System.out.println(employeeService.toString());
		System.out.println(employeeService2.toString());
		
		for(Employee employee: employees){
			System.out.println(employee.getName()+ " from "+ employee.getLocation());
		}
		

	}

}
