package com.sathya.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.spring.model.Customer;
import com.sathya.spring.model.Item;

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao
{
	@Autowired
	private HibernateTemplate ht;
	@Override
	public int insertCustomer(Customer customer) 
	{
		int x=(Integer)ht.save(customer);
		return x;
	}
	@Override
	public List<Customer> getAllCustomers() 
	{
		List<Customer> list=ht.loadAll(Customer.class);
		return list;
	}
	@Override
	public String getCustomerNameById(int customerId) 
	{
		String customerName=null;
		String hql="select customerName from "+Customer.class.getName()+" where customerId=?";
		@SuppressWarnings("unchecked")
		List<String> list=(List<String>) ht.find(hql, customerId);
		if(list!=null && list.size()>0)
		{
			customerName=list.get(0);
		}
		return customerName;
	}
	@Override
	public Customer getCustomerByEmail(String customerEmail) 
	{
		Customer customer=null;
		String hql="from "+Customer.class.getName()+" where customerEmail=?";
		@SuppressWarnings("unchecked")
		List<Customer> list=(List<Customer>) ht.find(hql, customerEmail);
		if(list!=null && list.size()>0)
		{
			customer=list.get(0);
		}
		return customer;
	}
	@Override
	public List<Item> getAllItemsOfCustomer(int customerId) 
	{
		String hql="from "+Item.class.getName()+" where customerId=?";
		@SuppressWarnings("unchecked")
		List<Item> list=(List<Item>) ht.find(hql,customerId);
		return list;
	}
	
}
