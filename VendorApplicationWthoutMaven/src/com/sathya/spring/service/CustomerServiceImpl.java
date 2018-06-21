package com.sathya.spring.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.spring.dao.CustomerDao;
import com.sathya.spring.model.Customer;
import com.sathya.spring.model.Item;

@Service
public class CustomerServiceImpl implements CustomerService
{
	@Autowired
	private CustomerDao dao;
	@Override
	public int insertCustomer(Customer customer) 
	{
		int x=(Integer)dao.insertCustomer(customer);
		return x;
	}
	@Override
	public List<Customer> getAllCustomers() 
	{
		List<Customer> list=dao.getAllCustomers();
		if(list!=null && !list.isEmpty())
		{
			Collections.sort(list);
		}
		return list;
	}
	@Override
	public String getCustomerNameById(int customerId) 
	{
		String customerName=dao.getCustomerNameById(customerId);
		return customerName;
	}
	@Override
	public Customer getCustomerByEmail(String customerEmail) 
	{
		return dao.getCustomerByEmail(customerEmail);
	}
	@Override
	public List<Item> getAllItemsOfCustomer(int customerId) 
	{
		List<Item> list=dao.getAllItemsOfCustomer(customerId);
		if(list!= null && list.size()>1)
		{
			Collections.sort(list);;
		}
		return list;
	}
	

}
