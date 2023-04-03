package com.wiley.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.wiley.pojo.Doctor;
import com.wiley.pojo.User;
import com.wiley.rowmapper.UserRowMapper;
@Repository
public class UserDaoImple implements UserDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<User> loadUsers() {
		String selectQuery="select * from users";
		List<User> listofUsers=jdbcTemplate.query(selectQuery, new UserRowMapper());
		return listofUsers;
	}

	@Override
	public void insertUser(User user) {
		Object[] Query= {user.getUsername(),user.getEmail(),user.getPassword(),user.getMobilenumber()};
		String insertQuery= "insert into users(name,email,password,mobilenumber) values(?,?,?,?)";
		jdbcTemplate.update(insertQuery,Query);
		
		
	}

	@Override
	public void deleteUser(String mobilenumber) {
		
		
	}

	@Override
	public void updateUser(User user , Doctor doctor) {
		Object[] Query= {user.getMobilenumber(),doctor.getDoctorid()};
		String updateQuery="update users set doctorid=? where mobilenumber=?";
		jdbcTemplate.update(updateQuery,Query);
	}

	
	
}
