package com.sathya.spring.dao;

import java.util.List;

import com.sathya.spring.model.User;

public interface UserDao 
{
	public void insertUser(User user);
	public List<User> getAllUsers();
	public User getUserById(int userId);
	public void updateUser(User user);
	public void deleteUser(User user);
	public User getUserByNameAndPassword(String username,String password);

}
