package com.imdad.ems.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.imdad.ems.repository.EmployeeRepository;
import com.imdad.ems.repository.HibernateEmployeeRepositoryImpl;
import com.imdad.ems.service.EmployeeService;
import com.imdad.ems.service.EmployeeServiceImpl;

@Configuration
@ComponentScan("com.imdad.ems")
@PropertySource("application.properties")
public class ApplicationConfiguration {
	
	@Bean(name="employeeService")
	@Scope("prototype")
	public EmployeeService getEmployeeService(){
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl(); 
		
		//employeeServiceImpl.setEmployeeRepository(getEmployeeRepository());
		return employeeServiceImpl;
		
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcePlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	/*@Bean(name="employeeRepository")
	public EmployeeRepository getEmployeeRepository(){
		return new HibernateEmployeeRepositoryImpl();
		
	}*/
	
	

}
