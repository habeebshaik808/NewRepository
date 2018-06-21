package com.sathya.spring.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.spring.dao.UserDao;
import com.sathya.spring.model.User;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	public UserDao dao;
	@Override
	public void insertUser(User user) 
	{
		dao.insertUser(user);
	}
	@Override
	public List<User> getAllUsers() 
	{
		List<User> list=dao.getAllUsers();
		return list;
	}
	@Override
	public User getUserById(int userId) 
	{
		return dao.getUserById(userId);
	}
	@Override
	public void updateUser(User user) 
	{
		dao.updateUser(user);
	}
	@Override
	public void deleteUser(User user) 
	{
		dao.deleteUser(user);
		
	}
	@Override
	public User getUserByNameAndPassword(String username, String password) 
	{
		return dao.getUserByNameAndPassword(username, password);
	}

}
