package com.sathya.spring.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.spring.dao.DocumentDao;
import com.sathya.spring.model.Document;

@Service
public class DocumentServiceImpl implements DocumentService
{
	@Autowired
	private DocumentDao dao;
	@Override
	public int saveDocument(Document document) 
	{
		return dao.saveDocument(document);
	}
	@Override
	public List<Object[]> getPartialEntity() 
	{
		List<Object[]> list=dao.getPartialEntity();
		return list;
	}
	@Override
	public Document getObjectById(int fileId) 
	{
		return dao.getObjectById(fileId);
	}

}
