package com.sathya.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sathya.spring.model.Customer;
import com.sathya.spring.model.Item;
import com.sathya.spring.service.CustomerService;
import com.sathya.spring.util.CoDecUtil;
import com.sathya.spring.util.CodeUtil;
import com.sathya.spring.util.CommonUtil;

@Controller
public class CustomerController 
{
	@Autowired
	private CustomerService service;
	@Autowired
	private CodeUtil codeUtil;
	@Autowired
	private CoDecUtil codecUtil;
	@Autowired
	private CommonUtil commonUtil;
	
	@RequestMapping(value="/registerCustomer",method=RequestMethod.GET)
	public String insertCustomer()
	{
		return "customerRegistration";
	}
	@RequestMapping(value="/saveCustomer",method=RequestMethod.POST)
	public  ModelAndView saveCustomer(@ModelAttribute("cust")Customer customer)
	{
		String gToken=codeUtil.generateToken();
		String gPwd=codeUtil.generatePwd();
		
		String encodedToken=codecUtil.doEncode(gToken);
		String encodedPwd=codecUtil.doEncode(gPwd);
		
		customer.setAccessToken(encodedToken);
		customer.setCustomerPassword(encodedPwd);
		
		int id=service.insertCustomer(customer);
		
		commonUtil.sendEmail(customer.getCustomerEmail(), "You are Register Successfully...",
				                            "Welcome to Customer : "+customer.getCustomerName()+
				                            "your password is: "+gPwd+", your token  number is : "+gToken+
				                            ", Customer type is: "+customer.getCustomerType());
		return new ModelAndView("success","message","Registration Successful With Id:"+id);
	}
	@RequestMapping(value="/allCustomers",method=RequestMethod.GET)
	public ModelAndView listOfCustomers(ModelMap map)
	{
		List<Customer> list=service.getAllCustomers();
		map.addAttribute("customers",list);
		return new ModelAndView("customersList");
	}
	@RequestMapping("/showCustomerItems")
	public ModelAndView getAllItemsOfCustomer(@RequestParam("id")int customerId,ModelMap map)
	{
		List<Item> list=service.getAllItemsOfCustomer(customerId);
		map.addAttribute("items",list);
		String customerName=service.getCustomerNameById(customerId);
		map.addAttribute("name",customerName);
		return new ModelAndView("customerItemsList");
	}
}
