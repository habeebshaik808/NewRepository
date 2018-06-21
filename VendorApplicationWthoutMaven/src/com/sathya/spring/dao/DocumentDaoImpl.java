package com.sathya.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.spring.model.Document;
@Repository
@Transactional
public class DocumentDaoImpl implements DocumentDao
{
	@Autowired
	private HibernateTemplate ht;
	@Override
	public int saveDocument(Document document) 
	{
	   int x=(Integer)ht.save(document);
		return x;
	}
	@Override
	public List<Object[]> getPartialEntity() 
	{
		@SuppressWarnings("unchecked")
		List<Object[]> list=(List<Object[]>)ht.find("select fileId,fileName from "+Document.class.getName());
		return list;
	}
	@Override
	public Document getObjectById(int fileId) 
	{
		Document document=ht.get(Document.class, fileId);
		return document;
	}
	

}
