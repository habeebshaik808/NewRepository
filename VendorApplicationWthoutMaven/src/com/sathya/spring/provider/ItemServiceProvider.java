package com.sathya.spring.provider;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sathya.spring.model.Customer;
import com.sathya.spring.model.Item;
import com.sathya.spring.service.CustomerService;
import com.sathya.spring.service.ItemService;
import com.sathya.spring.util.JsonUtil;
import com.sathya.spring.validator.CustomerValidator;

@Component
@Path("/item")
public class ItemServiceProvider 
{
	@Autowired
	private CustomerService customerService;
	@Autowired
	private CustomerValidator customerValidator;
	@Autowired
	private JsonUtil jsonUtil;
	@Autowired
	private ItemService itemService;
	@Path("/saveItem")
	@POST
	public String saveItem(@HeaderParam("username")String username,@HeaderParam("password")String password,				
                                         @HeaderParam("accesstoken")String accesstoken,	String jsonItem)
	{
		if(username == null || "".equals(username.trim()))
		{
			return "User Name can not be empty";
		}
		if(password == null || "".equals(password.trim()))
		{
			return "Password can not be empty";
		}
		if(accesstoken == null || "".equals(accesstoken.trim()))
		{
			return "Access Token can not be empty";
		}
		if(jsonItem == null || "".equals(jsonItem.trim()))
		{
			return "Item(JSON) can not be empty";
		}
		Customer customer=customerService.getCustomerByEmail(username);
		if(customer==null)
		{
			return "Customer(User) is not exist";
		}
		boolean flag=customerValidator.isPwdAndTokenValid(password, accesstoken, customer);
		if(!flag)
		{
			return "Invalid password or accesstoken in request";  
		}
		flag=customerValidator.isCustomerTypeSeller(customer);
		if(!flag)
		{
			return "Invalid customer, only Seller allowed for this operation";
		}
		Object itemObject=jsonUtil.convertJsonToObject(jsonItem,Item.class);
		if(itemObject==null)
		{
			return "Invalid Item(JSON) Details in request";
		}
		Item item=(Item)itemObject;
		item.setCustomerId(customer.getCustomerId());
		int itemId=itemService.saveItem(item);
		return "Item Saved with Id:"+itemId;
	}

}
