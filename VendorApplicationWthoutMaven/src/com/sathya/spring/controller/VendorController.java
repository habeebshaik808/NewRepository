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
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sathya.spring.model.Location;
import com.sathya.spring.model.Vendor;
import com.sathya.spring.service.VendorService;
import com.sathya.spring.util.CommonUtil;
import com.sathya.spring.util.LocationUtil;
import com.sathya.spring.util.VendorUtil;


@Controller
public class VendorController 
{
	@Autowired
	private VendorService service;
	@Autowired
	private ServletContext context;
	@Autowired
	private VendorUtil vendorUtil;
	@Autowired
	private LocationUtil locationUtil;
	@Autowired
	private CommonUtil commonUtil;
	
	@RequestMapping("/registerVendor")
	public String vendorRegistration(ModelMap map)
	{
		List<Location> list=locationUtil.getAllLocations();
		map.addAttribute("locations", list);
		return "vendorRegistration";
	}
	@RequestMapping(value="/saveVendor", method=RequestMethod.POST)
	 public ModelAndView saveVendor(@ModelAttribute("reg")Vendor vendor,@RequestParam("fileObj")CommonsMultipartFile file)
	{
		int id=service.insertVendor(vendor);
		commonUtil.sendEmail(vendor.getVendorEmail(), "Importent Message", "Vendor Registered with Id..."+id,file);
		return new ModelAndView("success","message","Registration Successful With Id:"+id);
		}
	@RequestMapping(value="/allVendors",method=RequestMethod.GET)
	public ModelAndView listOfVendors(ModelMap map)
	{
		List<Vendor> list=service.getAllVendors();
		map.addAttribute("vendors",list);
		return new ModelAndView("vendorsList");
	}
	@RequestMapping(value="/editVendor",method=RequestMethod.GET)
	public ModelAndView editVendor(@RequestParam("id")int vendorId)
	{
		Vendor vendor=service.getVendorById(vendorId);
		return new ModelAndView("editVendor","ven",vendor);
	}
	@RequestMapping(value="/updateVendor",method=RequestMethod.POST)
	public ModelAndView updateVendor(@ModelAttribute("ven")Vendor vendor)
	{
		service.updateVendor(vendor);
		return new ModelAndView("success","message","Vendor Successfully Updated...");
	}
	@RequestMapping(value="/deleteVendor",method=RequestMethod.GET)
	public ModelAndView deleteVendor(@RequestParam("id")int vendorId,ModelMap map)
	{
		Vendor vendor=new Vendor();
		vendor.setVendorId(vendorId);
		service.deleteVendor(vendor);
		List<Vendor> list=service.getAllVendors();
		map.addAttribute("vendors",list);
		return new ModelAndView("vendorsList");
	}
	@RequestMapping(value="/vreport",method=RequestMethod.GET)
	public String showReport()
	{
		List<Object[]> data=service.getVendorWiseCount();
		String path=context.getRealPath("/");
		vendorUtil.vendorPieChart(path, data);
		vendorUtil.vendorBarChart(path, data);
		return "vendorReport";
	}
}
