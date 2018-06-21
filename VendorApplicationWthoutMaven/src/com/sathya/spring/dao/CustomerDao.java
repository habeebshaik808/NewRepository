package com.sathya.spring.dao;

import java.util.List;

import com.sathya.spring.model.Customer;
import com.sathya.spring.model.Item;

public interface CustomerDao 
{
	public int insertCustomer(Customer customer);
	public List<Customer> getAllCustomers();
	public String getCustomerNameById(int customerId);
	public Customer getCustomerByEmail(String customerEmail);
	public List<Item> getAllItemsOfCustomer(int customerId);

}
