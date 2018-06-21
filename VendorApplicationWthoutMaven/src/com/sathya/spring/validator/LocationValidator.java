package com.sathya.spring.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sathya.spring.model.Location;
import com.sathya.spring.service.LocationService;
@Component
public class LocationValidator 
{
	@Autowired
	private LocationService service;
	
	public String doValidateLocationName(String locationName)
	{
		String str=null;
		Location location=service.getLocationByName(locationName);
		if(location!=null)
		{
			str="Location Name '"+locationName+"' already exist in Database";
		}
		return str;
	}

}
