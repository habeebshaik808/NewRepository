package com.sathya.spring.service;

import java.util.List;

import com.sathya.spring.model.Document;

public interface DocumentService 
{
	public int saveDocument(Document document);
	public List<Object[]> getPartialEntity();
	public Document getObjectById(int fileId);

}
