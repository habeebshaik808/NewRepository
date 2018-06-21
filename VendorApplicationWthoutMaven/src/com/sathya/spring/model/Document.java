package com.sathya.spring.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="Document_tab")
public class Document implements Comparable<Document>
{
	@Id
	@Column(name="fid")
	private int fileId;
	@Column(name="fname")
	private String fileName;
	@Lob 
	@Column(name="fdata")
	private byte[] fileData;
	
	public int getFileId() 
	{
		return fileId;
	}
	public void setFileId(int fileId) 
	{
		this.fileId = fileId;
	}
	public String getFileName() 
	{
		return fileName;
	}
	public void setFileName(String fileName) 
	{
		this.fileName = fileName;
	}
	public byte[] getFileData() 
	{
		return fileData;
	}
	public void setFileData(byte[] fileData) 
	{
		this.fileData = fileData;
	}
	@Override
	public String toString() 
	{
		return "Document [fileId=" + fileId + ", fileName=" + fileName + ", fileData=" + Arrays.toString(fileData)
				+ "]";
	}
	@Override
	public int compareTo(Document document) 
	{	
		return fileId-document.fileId;
	}
	

}
