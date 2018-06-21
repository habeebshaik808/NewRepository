package com.sathya.spring.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sathya.spring.model.Document;
import com.sathya.spring.service.DocumentService;

@Controller
public class DocumentController 
{
	@Autowired
	private DocumentService service;
    @RequestMapping("/showDocument")
    public String showDocument(ModelMap map)
    {
		List<Object[]> list=service.getPartialEntity();
		map.addAttribute("documents",list);
		return "documents";
	}
	@RequestMapping(value="/uploadDocument",method=RequestMethod.POST)
	public ModelAndView uploadDocument(@RequestParam("fid")int fileId,@RequestParam("filedetails")CommonsMultipartFile cmf)
	 {
		  if(cmf!=null)
		   {
			  Document document=new Document();
			  document.setFileId(fileId);
			  document.setFileName(cmf.getOriginalFilename());
			  document.setFileData(cmf.getBytes());
			   service.saveDocument(document);
		    }
		return new ModelAndView("success","message","File Uploaded Successfully");
	}
	@RequestMapping(value="/allDocuments", method=RequestMethod.GET)
	public ModelAndView listOfDocuments(ModelMap map)
	{
		List<Object[]> list=service.getPartialEntity();
		map.addAttribute("documents",list);
		return new ModelAndView("allDocuments");
	}
	@RequestMapping("/download")
	public void downloadDocument(HttpServletResponse res,@RequestParam("id")int fileId)
	{
		Document document=service.getObjectById(fileId);
		res.addHeader("Content-Disposition", "attachment;filename="+document.getFileName());
		try 
		{
			FileCopyUtils.copy(document.getFileData(), res.getOutputStream());
		 }
		 catch(IOException e) 
		 {
		     e.printStackTrace();
		  }
	 }

}
