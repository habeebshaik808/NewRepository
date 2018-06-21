package com.sathya.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sathya.spring.model.User;
import com.sathya.spring.service.UserService;
import com.sathya.spring.util.CommonUtil;

@Controller
public class UserController 
{
	@Autowired
	private UserService service;
	@Autowired
	private CommonUtil commonUtil;
	
	@RequestMapping("/registerUser")
	public String userRegistration()
	{
		return "userRegistration";
	}
	@RequestMapping(value="/saveUser",method=RequestMethod.POST)
	 public ModelAndView saveUser(@ModelAttribute("reg")User user)
	{
		
			service.insertUser(user);
			commonUtil.sendEmail(user.getUserEmail(), "Welcome to VendorDatManagement ","you are Rigistered Successfully with Vendor Data Management");
			return new ModelAndView("success","message","Registration Successful ");
		
	}
	@RequestMapping(value="/allUsers",method=RequestMethod.GET)
	public String listOfUsers(ModelMap map)
	{
		List<User> list=service.getAllUsers();
		map.addAttribute("users",list);
		return "usersList";
	}
	@RequestMapping(value="/editUser",method=RequestMethod.GET)
	public String editUser(@RequestParam("id")int userId,ModelMap map)
	{
		User user=service.getUserById(userId);
		map.addAttribute("u",user);
		return "editUser";
	}
	@RequestMapping(value="/updateUser",method=RequestMethod.POST)
	public String updateUser(@ModelAttribute("u")User user,ModelMap map)
	{
		service.updateUser(user);
		map.addAttribute("message","User Successfully Updated");
		return "success";
	}
	/*@RequestMapping(value="/deleteUser",method=RequestMethod.GET)
	public String deleteUser(@RequestParam("id")int userId,ModelMap map)
	{
		User user=new User();
		user.setUserId(userId);
		service.deleteUser(user);
		List<User> list=service.getAllUsers();
		map.addAttribute("users",list);
		return "usersList";
	}*/
	@RequestMapping(value="/loginCheck",method=RequestMethod.POST)
	public ModelAndView checkUserLogin(@RequestParam("un")String username,@RequestParam("pwd")String password,HttpServletRequest request,ModelMap map)
	{
		User user=service.getUserByNameAndPassword(username, password);
		if(user==null)
		{
			map.addAttribute("msgerror", "Invalid username/password");
		}
		else
		{
			map.addAttribute("message","Login Successfullly....");
			HttpSession session=request.getSession();
			session.setAttribute("userName",user.getUserName());
		}
		return new ModelAndView("success");
	}
	@RequestMapping("/userLogout")
	public ModelAndView userLogout(HttpServletRequest request)
	{
	    HttpSession session=request.getSession(false);
		session.setAttribute("userName",null);
		session.invalidate();
		return new ModelAndView("success","message", "Logout Successful...");
	}

}
