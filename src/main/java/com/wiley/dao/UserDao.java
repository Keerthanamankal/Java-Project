package com.wiley.dao;

import java.util.List;

import com.wiley.pojo.Doctor;
import com.wiley.pojo.User;

public interface UserDao {

	List<User> loadUsers();
	void insertUser(User user);
	void deleteUser(String mobilenumber);
	void updateUser(User user,Doctor doctor);
}
