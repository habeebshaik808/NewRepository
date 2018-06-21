package com.sathya.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_tab")
public class Customer implements Comparable<Customer>
{
	@Id
	@Column(name="custId")
	private int customerId;
	@Column(name="custName",length=15)
	private String customerName;
	@Column(name="custType",length=10)
	private String customerType;
	@Column(name="custemail")
	private String customerEmail;
	@Column(name="custaddress")
	private String customerAddress;
	@Column(name="custmobile")
	private long customerMobile;
	@Column(name="custpwd",length=20)
	private String customerPassword;
	@Column(name="custtoken")
	private String accessToken;
	
	public Customer() 
	{
		super();
	}
	public Customer(int customerId) 
	{
		super();
		this.customerId = customerId;
	}
	public Customer(int customerId, String customerName, String customerType, String customerEmail,
			String customerAddress, long customerMobile, String customerPassword, String accessToken) 
	{
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerType = customerType;
		this.customerEmail = customerEmail;
		this.customerAddress = customerAddress;
		this.customerMobile = customerMobile;
		this.customerPassword = customerPassword;
		this.accessToken = accessToken;
	}
	public int getCustomerId() 
	{
		return customerId;
	}
	public void setCustomerId(int customerId) 
	{
		this.customerId = customerId;
	}
	public String getCustomerName() 
	{
		return customerName;
	}
	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}
	public String getCustomerType() 
	{
		return customerType;
	}
	public void setCustomerType(String customerType) 
	{
		this.customerType = customerType;
	}
	public String getCustomerEmail() 
	{
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) 
	{
		this.customerEmail = customerEmail;
	}
	public String getCustomerAddress() 
	{
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) 
	{
		this.customerAddress = customerAddress;
	}
	public long getCustomerMobile() 
	{
		return customerMobile;
	}
	public void setCustomerMobile(long customerMobile) 
	{
		this.customerMobile = customerMobile;
	}
	public String getCustomerPassword() 
	{
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) 
	{
		this.customerPassword = customerPassword;
	}
	public String getAccessToken()
	{
		return accessToken;
	}
	public void setAccessToken(String accessToken)
	{
		this.accessToken = accessToken;
	}
	@Override
	public String toString()
	{
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerType="
				+ customerType + ", customerEmail=" + customerEmail + ", customerAddress=" + customerAddress
				+ ", customerMobile=" + customerMobile + ", customerPassword=" + customerPassword + ", accessToken="
				+ accessToken + "]";
	}
	@Override
	public int compareTo(Customer customer) 
	{
		return customerId-customer.customerId;
	}
	
	

}
