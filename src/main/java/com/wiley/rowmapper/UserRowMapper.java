package com.wiley.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wiley.pojo.User;

public class UserRowMapper implements RowMapper<User>
{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user=new User();
		user.setUsername(rs.getString("name"));
		user.setMobilenumber(rs.getString("mobilenumber"));
		user.setEmail(rs.getString("email"));
		user.setPassword(rs.getString("password"));
		user.setUserid(rs.getInt("userid"));
		return user;
	}

	
}
