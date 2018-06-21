package com.sathya.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Item_tab")
public class Item implements Comparable<Item>
{
	@Id
	@Column(name="itm_id")
	private int itemId;
	@Column(name="itm_name")
	private String itemName;
	@Column(name="itm_cost")
	private double itemCost;
	@Column(name="itm_cust_id")
	private int customerId;
	
	public Item() 
	{
		super();
	}
	public Item(int itemId)
	{
		super();
		this.itemId = itemId;
	}
	public Item(int itemId, String itemName, double itemCost, int customerId) 
	{
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemCost = itemCost;
		this.customerId = customerId;
	}
	public int getItemId()
	{
		return itemId;
	}
	public void setItemId(int itemId) 
	{
		this.itemId = itemId;
	}
	public String getItemName() 
	{
		return itemName;
	}
	public void setItemName(String itemName) 
	{
		this.itemName = itemName;
	}
	public double getItemCost() 
	{
		return itemCost;
	}
	public void setItemCost(double itemCost) 
	{
		this.itemCost = itemCost;
	}
	public int getCustomerId() 
	{
		return customerId;
	}
	public void setCustomerId(int customerId) 
	{
		this.customerId = customerId;
	}
	@Override
	public String toString() 
	{
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemCost=" + itemCost + ", customerId="
				+ customerId + "]";
	}
	@Override
	public int compareTo(Item item) 
	{
		return itemId-item.itemId;
	}
	

}
