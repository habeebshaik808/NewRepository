package com.sathya.spring.service;

import java.util.List;

import com.sathya.spring.model.Location;

public interface LocationService 
{
	public int insertLocation(Location location);
	public List<Location> getAllLocations();
	public Location getLocationById(int locationId);
	public void updateLocation(Location location);
	public void deleteLocation(Location location);
	
	public Location getLocationByName(String locationName);//validation
	public List<Object[]> getLocationwiseCount();//Charts

}
