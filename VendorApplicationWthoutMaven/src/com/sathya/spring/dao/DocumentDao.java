package com.sathya.spring.dao;

import java.util.List;

import com.sathya.spring.model.Document;

public interface DocumentDao 
{
	public int saveDocument(Document document);
	public List<Object[]> getPartialEntity();
	public Document getObjectById(int fileId);

}
