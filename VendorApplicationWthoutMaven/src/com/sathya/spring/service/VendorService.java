package com.sathya.spring.service;

import java.util.List;

import com.sathya.spring.model.Vendor;

public interface VendorService 
{
	public int insertVendor(Vendor vendor);
	public List<Vendor> getAllVendors();
	public Vendor getVendorById(int vendorId);
	public void updateVendor(Vendor vendor);
	public void deleteVendor(Vendor vendor);
	
	public List<Object[]> getVendorWiseCount();//Charts
}
