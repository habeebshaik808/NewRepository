package com.sathya.spring.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sathya.spring.model.Customer;
import com.sathya.spring.util.CoDecUtil;

@Component
public class CustomerValidator 
{
	@Autowired
	private CoDecUtil codecUtil;
	
	public boolean isPwdAndTokenValid(String reqPwd,String reqToken,Customer customer)
	{
		boolean flag=false;
		String dbPwd=codecUtil.doDecode(customer.getCustomerPassword());
		String dbToken=codecUtil.doDecode(customer.getAccessToken());
		if(reqPwd.equals(dbPwd) && reqToken.equals(dbToken))
		{
			flag=true;
		}
		return flag;	
	}
	public boolean isCustomerTypeSeller(Customer customer)
	{
		return "Seller".equalsIgnoreCase(customer.getCustomerType());
	}
	public boolean isCustomerTypeConsumer(Customer customer)
	{
		return "Consumer".equalsIgnoreCase(customer.getCustomerType());
	}

}
