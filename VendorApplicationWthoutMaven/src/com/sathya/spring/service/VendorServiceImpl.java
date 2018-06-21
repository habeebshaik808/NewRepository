package com.sathya.spring.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.spring.dao.VendorDao;
import com.sathya.spring.model.Vendor;

@Service
public class VendorServiceImpl implements VendorService
{
	@Autowired
	private VendorDao dao;
	public int insertVendor(Vendor vendor)
	{
		return dao.insertVendor(vendor);
	}
	@Override
	public List<Vendor> getAllVendors() 
	{
		List<Vendor> list=dao.getAllVendors();
		if(list!=null && !list.isEmpty())
		{
			Collections.sort(list);
		}
		return list;
	}  
	@Override
	public Vendor getVendorById(int vendorId)
	{
		Vendor vendor=dao.getVendorById(vendorId);
		return vendor;
	}
	@Override
	public void updateVendor(Vendor vendor) 
	{
		dao.updateVendor(vendor);
	}
	@Override
	public void deleteVendor(Vendor vendor) 
	{
	   dao.deleteVendor(vendor);
	}
	@Override//Charts
	public List<Object[]> getVendorWiseCount() 
	{
		return dao.getVendorWiseCount();
	}

}
