package com.sathya.spring.service;

import java.util.List;

import com.sathya.spring.model.Customer;
import com.sathya.spring.model.Item;

public interface CustomerService 
{
	public int insertCustomer(Customer customer);
	public List<Customer> getAllCustomers();
	public String getCustomerNameById(int customerId);
	public Customer getCustomerByEmail(String customerEmail);
	public List<Item> getAllItemsOfCustomer(int customerId);

}
