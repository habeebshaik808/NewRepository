package com.sathya.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.spring.model.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao
{
	@Autowired
	private HibernateTemplate ht;
	@Override
	public void insertUser(User user) 
	{
		ht.save(user);
	}
	@Override
	public List<User> getAllUsers() 
	{
		return ht.loadAll(User.class);
	}
	@Override
	public User getUserById(int userId)
	{
		return ht.get(User.class, userId);
	}
	@Override
	public void updateUser(User user) 
	{
		ht.update(user);
	}
	@Override
	public void deleteUser(User user) 
	{
	    ht.delete(user);	
	}
	@Override
	public User getUserByNameAndPassword(String username, String password) 
	{
		String hql="from "+User.class.getName()+" where (userEmail=? or userMobile=?) "+" and password=? ";
		@SuppressWarnings("unchecked")
		List<User> list=(List<User>) ht.find(hql,username,username,password);
		return list!=null?list.size()>0?list.get(0):null:null; 
	}
}
