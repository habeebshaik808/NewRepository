 package com.sathya.spring.controller;

import java.util.List;

import javax.servlet.ServletContext;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sathya.spring.model.Location;
import com.sathya.spring.service.LocationService;
import com.sathya.spring.util.LocationUtil;
import com.sathya.spring.validator.LocationValidator;

@Controller
public class LocationController 
{
	@Autowired
	private LocationService service;
	@Autowired
	private LocationValidator validator;
	@Autowired
	private ServletContext context;
	@Autowired
	private LocationUtil locationUtil;
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String home()
	{
		return "home";
	}
	@RequestMapping(value="/registerLocation" ,method=RequestMethod.GET)
	public ModelAndView insertLocation()
	{
		return new ModelAndView("locationRegistration");
	}
	@RequestMapping(value="/saveLocation", method=RequestMethod.POST)
	public ModelAndView saveLocation(@ModelAttribute("loc")Location location,ModelMap map)
	{
		//validation
		String error=validator.doValidateLocationName(location.getLocationName());
		if(error!=null)
		{
			map.addAttribute("msgerror",error);
		}
		else
		{
			int id=service.insertLocation(location);
			map.addAttribute("message","Registration Successfull With Id:"+id);
		}
		return new ModelAndView("success");
	}
	@RequestMapping(value="/allLocations", method=RequestMethod.GET)
	public ModelAndView listOfLocations(ModelMap map)
	{
		List<Location> list=service.getAllLocations();
		map.addAttribute("locations",list);
		return new ModelAndView("locationsList");
	}
	@RequestMapping(value="/editLocation", method=RequestMethod.GET)
	public ModelAndView editLocation(@RequestParam("id")int locationId)
	{
		Location location=service.getLocationById(locationId);
		return new ModelAndView("editLocation","loc",location);
	}
	@RequestMapping(value="/updateLocation", method=RequestMethod.POST)
	public ModelAndView updateLocation(@ModelAttribute("loc")Location location)
	{
		service.updateLocation(location);
		return new ModelAndView("success","message","Location Successfully Updated... ");
	}
	@RequestMapping(value="/deleteLocation", method=RequestMethod.GET)
	public ModelAndView deleteLocations(@RequestParam("id")int locationId,ModelMap map)
	{
		Location location=new Location();
		location.setLocationId(locationId);
		service.deleteLocation(location);
		List<Location> list=service.getAllLocations();
		map.addAttribute("locations",list);
		return new ModelAndView("locationsList");
	}
	@RequestMapping(value="/pdf",method=RequestMethod.GET)
	public String exportExcel(ModelMap map)
	{
		List<Location> list=service.getAllLocations();
		map.addAttribute("locations",list);
		return "userpdfclass";
	}
	@RequestMapping(value="/excel",method=RequestMethod.GET)
	public String exportToPdf(ModelMap map)
	{
		List<Location> list=service.getAllLocations();
		map.addAttribute("locations",list);
		return "userexcelclass";
	}
	@RequestMapping(value="/lreport",method=RequestMethod.GET)
	public String showReport()
	{
		List<Object[]> data=service.getLocationwiseCount();
		String path=context.getRealPath("/");
		locationUtil.locationPieChart(path, data);
		locationUtil.locationBarChart(path, data);
		return "locationReport";
	}
	
}
