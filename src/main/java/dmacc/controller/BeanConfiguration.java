package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.House;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public House house() {
		House bean = new House( );
		bean.setAddress("3243 W. 73rd ST.");
		bean.setNumOfBedrooms(2);
		return bean;
	}

}
