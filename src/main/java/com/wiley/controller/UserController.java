package com.wiley.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wiley.dao.UserDao;
import com.wiley.pojo.Doctor;
import com.wiley.pojo.User;

@Controller
//@RequestMapping("/hi")
public class UserController 
{
	@Autowired
	private UserDao userDao;
	@RequestMapping("/show")
	public String name()
	{
		return "signup";
	}
	@GetMapping("/insert")
	public String input(Model model  )
	{
		User user=new User();
		model.addAttribute("user",user);
		return "signup";
	}
	@ResponseBody
	public String UpdateId(Model model)
	{
		User user=new User();
		Doctor doctor=new Doctor();
		model.addAttribute("doctor",doctor);
		model.addAttribute("user",user);
		return "Updated succesfully";
	}
	@PostMapping("/save")
	//@ResponseBody
	public String userInsertion(User user) {
		userDao.insertUser(user);
		return "welcome";	
	}
	
	@ResponseBody
	public String insertDoctorid(User user,Doctor doctor)
	{
		userDao.updateUser(user,doctor);
		return "DoctorDetails updated";
	}
}
