package com.cardalyze.springapidemo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * This class is required to make Spring Boot run as WAR file.
 * 
 * @author cardalyze
 *
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringapidemoApplication.class);
	}
	

}
