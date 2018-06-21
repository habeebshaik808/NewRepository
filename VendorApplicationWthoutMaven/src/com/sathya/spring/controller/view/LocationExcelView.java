package com.sathya.spring.controller.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.sathya.spring.model.Location;

@SuppressWarnings("deprecation")
public class LocationExcelView extends AbstractExcelView
{
	@Override
	protected void buildExcelDocument(Map<String, Object> map, HSSFWorkbook wb, HttpServletRequest req,HttpServletResponse res) throws Exception 
	{	
		@SuppressWarnings("unchecked")
		List<Location> list=(List<Location>)map.get("locations");
		HSSFSheet sheet=wb.createSheet("Location");
		setHeader(sheet);
		setBody(sheet, list);
	}
	public void setHeader(HSSFSheet sheet)
	{
		int rowNum=0;
		HSSFRow row=sheet.createRow(rowNum);
		row.createCell(0).setCellValue("LocationId");
		row.createCell(1).setCellValue("LocationName");
		row.createCell(2).setCellValue("LocationType");
		row.createCell(3).setCellValue("SupervisorName");
		row.createCell(4).setCellValue("AdviserName");
		row.createCell(5).setCellValue("State");
		row.createCell(6).setCellValue("Country");
		row.createCell(7).setCellValue("PinCode");
	}
	public void setBody(HSSFSheet sheet,List<Location> list)
	{
		int rowNum=1;
		for(Location location:list)
		{
			HSSFRow row=sheet.createRow(rowNum);
			row.createCell(0).setCellValue(location.getLocationId());
			row.createCell(1).setCellValue(location.getLocationName());
			row.createCell(2).setCellValue(location.getLocationType());
			row.createCell(3).setCellValue(location.getSupervisorName());
			row.createCell(4).setCellValue(location.getAdviserName());
			row.createCell(5).setCellValue(location.getState());
			row.createCell(6).setCellValue(location.getCountry());
			row.createCell(7).setCellValue(location.getPinCode());
			rowNum++;
		}
	}
	
}
