package com.sathya.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sathya.spring.dao.ItemDao;
import com.sathya.spring.model.Item;
@Service
public class ItemServiceImpl implements ItemService
{
	@Autowired
	private ItemDao dao;
	@Override
	public int saveItem(Item item)
	{
		return dao.saveItem(item);
	}
	
}
