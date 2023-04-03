package com.wiley.rowmapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wiley.pojo.*;


public class DoctorRowMapper implements RowMapper<Doctor>
{

	@Override
	public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
		Doctor doctor=new Doctor();
		doctor.setDoctorid(rs.getInt("id"));
		doctor.setName(rs.getString("name"));
		doctor.setSpecialization(rs.getString("specialization"));
		doctor.setLocation(rs.getString("area"));
		doctor.setDoctorFees(rs.getDouble("cost"));
		
		return doctor;
	}
	


}
