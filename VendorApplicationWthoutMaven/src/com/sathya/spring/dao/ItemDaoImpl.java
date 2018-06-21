package com.sathya.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.spring.model.Item;
@Repository
@Transactional
public class ItemDaoImpl implements ItemDao
{
	@Autowired
	private HibernateTemplate ht;
	@Override
	public int saveItem(Item item) 
	{
		int x=(Integer)ht.save(item);
		return x;
	}
	

}
