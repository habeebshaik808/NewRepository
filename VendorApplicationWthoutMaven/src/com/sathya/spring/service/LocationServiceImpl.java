package com.sathya.spring.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.spring.dao.LocationDao;
import com.sathya.spring.model.Location;

@Service
public class LocationServiceImpl implements LocationService
{
	@Autowired
	private LocationDao dao;
	
	@Override
	public int insertLocation(Location location)
	{
		int x=(Integer)dao.insertLocation(location);
		return x;
	}
	@Override
	public List<Location> getAllLocations() 
	{
		List<Location> list=dao.getAllLocations();
		if(list!=null && !list.isEmpty())
		{
			Collections.sort(list);
		}
		return list;
	}
	@Override
	public Location getLocationById(int locationId) 
	{
	    Location location=dao.getLocationById(locationId);
		return location;
	}
	@Override
	public void updateLocation(Location location) 
	{
		dao.updateLocation(location);
	}
	@Override
	public void deleteLocation(Location location) 
	{
		dao.deleteLocation(location);
	}
	@Override//Validation
	public Location getLocationByName(String locationName) 
	{
		return dao.getLocationByName(locationName);
	}
	@Override//Charts
	public List<Object[]> getLocationwiseCount() 
	{
		return dao.getLocationwiseCount();
	}
}
