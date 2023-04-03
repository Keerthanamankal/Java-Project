package com.wiley.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.wiley.pojo.Doctor;
import com.wiley.rowmapper.DoctorRowMapper;

@Repository
public class DoctorDaoImpl implements DoctorDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insert(Doctor doctor) {
		
		
		
		
	}

	

	

}
