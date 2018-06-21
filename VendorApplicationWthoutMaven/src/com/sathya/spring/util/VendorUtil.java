package com.sathya.spring.util;

import java.io.File;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;

@Component
public class VendorUtil
{
	public void vendorPieChart(String path,List<Object[]> data)
	{
		DefaultPieDataset dataset=new DefaultPieDataset();
		for(Object[] ob:data)
		{
			dataset.setValue(ob[0].toString(), new Double(ob[1].toString()));
		}
		JFreeChart chart=ChartFactory.createPieChart3D("Vendor Report", dataset, true, true, false);
		try 
		{
			ChartUtilities.saveChartAsJPEG(new File(path+"/vendorPie.jpg"), chart, 400, 400);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void vendorBarChart(String path,List<Object[]> data)
	{
		DefaultCategoryDataset dataset=new DefaultCategoryDataset();
		for(Object[] ob:data)
		{
			dataset.setValue(new Double(ob[1].toString()), ob[0].toString(), "");
		}
		JFreeChart chart=ChartFactory.createBarChart3D("Vendor Report", "Vendor Names", "Count", dataset);
		try 
		{
			ChartUtilities.saveChartAsJPEG(new File(path+"/vendorBar.jpg"), chart, 400, 400);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	

}
