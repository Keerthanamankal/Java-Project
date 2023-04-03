package com.wiley.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.wiley")
public class DoctorAppConfig {
	
	@Bean
	public InternalResourceViewResolver  viewName()
	{
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate()
	{
		JdbcTemplate jdbcTemplate=new JdbcTemplate(getConnection());
		return jdbcTemplate;
	}
	
	@Bean
	public DataSource getConnection() {
		DriverManagerDataSource data=new DriverManagerDataSource();
		data.setUsername("root");
		data.setPassword("root1234");
		data.setUrl("jdbc:mysql://localhost:3306/doctorappointment?");
		data.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return data;
	}

}
