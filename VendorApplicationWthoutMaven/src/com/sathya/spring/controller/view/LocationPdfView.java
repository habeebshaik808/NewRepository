package com.sathya.spring.controller.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

import com.sathya.spring.model.Location;

public class LocationPdfView extends AbstractPdfView
{
	@Override
	protected void buildPdfDocument(Map<String,Object> map, Document document, PdfWriter writer, HttpServletRequest req,HttpServletResponse res) throws Exception 
	{
		Paragraph p=new Paragraph("An Oracle database is a collection of data treated as a unit. The purpose of a database is to store and retrieve related information. A database server is the key to solving the problems of information management. In general, a server reliably manages a large amount of data in a multiuser environment so that many users can concurrently access the same data. All this is accomplished while delivering high performance.");
		p.setAlignment("center");
		@SuppressWarnings("unchecked")
		List<Location> list=(List<Location>)map.get("locations");
		Table t=new Table(6);
		t.addCell("LocationId");
		t.addCell("LocationName");
		t.addCell("LocationType");
		//t.addCell("SupervisorName");
		//t.addCell("AdvisorName");
		t.addCell("State");
		t.addCell("Country");
		t.addCell("PinCode");
		for(Location location:list)
		{
		   t.addCell(""+location.getLocationId());
		   t.addCell(location.getLocationName());
		   t.addCell(location.getLocationType());
		//   t.addCell(location.getSupervisorName());
		  // t.addCell(location.getAdviserName());
		   t.addCell(location.getState());
		   t.addCell(location.getCountry());
		   t.addCell(""+location.getPinCode());
		   
		}
		document.add(p);
		document.add(t);
		
	}
	

}
