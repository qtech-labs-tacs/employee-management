package com.qtechlabs.employeemanagement.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfiguration {
	
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}
