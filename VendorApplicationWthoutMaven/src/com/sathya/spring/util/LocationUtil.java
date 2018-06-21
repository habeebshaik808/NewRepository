package com.sathya.spring.util;

import java.io.File;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sathya.spring.model.Location;
import com.sathya.spring.service.LocationService;

@Component
public class LocationUtil 
{
	@Autowired
	private LocationService service;
	
	public List<Location> getAllLocations() 
	{
		return service.getAllLocations() ;
	}
	public void locationPieChart(String path,List<Object[]> data)
	{
		DefaultPieDataset dataset=new DefaultPieDataset();
		for(Object[] ob:data)
		{
			dataset.setValue(ob[0].toString(), new Double(ob[1].toString()));
		}
		JFreeChart chart=ChartFactory.createPieChart3D("Location Report", dataset, true, true, false);
		try 
		{
			ChartUtilities.saveChartAsJPEG(new File(path+"/locationPie.jpg"), chart, 400, 400);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void locationBarChart(String path,List<Object[]> data)
	{
		DefaultCategoryDataset dataset=new DefaultCategoryDataset();
		for(Object[] ob:data)
		{
			dataset.setValue(new Double(ob[1].toString()), ob[0].toString(), "");
		}
		JFreeChart chart=ChartFactory.createBarChart3D("Location Report", "Location Type", "Count", dataset);
		try 
		{
			ChartUtilities.saveChartAsJPEG(new File(path+"/locationBar.jpg"), chart, 400, 400);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
}
