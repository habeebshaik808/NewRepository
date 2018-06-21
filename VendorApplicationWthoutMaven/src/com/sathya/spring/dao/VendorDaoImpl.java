package com.sathya.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.spring.model.Vendor;

@Repository
@Transactional
public class VendorDaoImpl implements VendorDao
{
    @Autowired
    private HibernateTemplate ht;
	@Override
	public int insertVendor(Vendor vendor) 
	{
		int x=(Integer)ht.save(vendor);
		return x;
	}
	@Override
	public List<Vendor> getAllVendors() 
	{
		List<Vendor> list=ht.loadAll(Vendor.class);
		return list;
	}  
	@Override
	public Vendor getVendorById(int vendorId)
	{
		Vendor vendor=ht.get(Vendor.class, vendorId);
		return vendor;
	}
	@Override
	public void updateVendor(Vendor vendor) 
	{
		ht.saveOrUpdate(vendor);
	}
	@Override
	public void deleteVendor(Vendor vendor) 
	{
		ht.delete(vendor);
	}
	@Override
	public List<Object[]> getVendorWiseCount() 
	{
		String hql="select vendorName,count(vendorName) from "+Vendor.class.getName()+" group by vendorName";
		@SuppressWarnings("unchecked")
		List<Object[]> data=(List<Object[]>) ht.find(hql);
		return data;
	}
	
}
