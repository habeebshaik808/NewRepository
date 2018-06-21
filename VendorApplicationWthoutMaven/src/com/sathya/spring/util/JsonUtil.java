package com.sathya.spring.util;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class JsonUtil 
{
	@SuppressWarnings("unchecked")
	public Object convertJsonToObject(String json,@SuppressWarnings("rawtypes") Class cls)
	{
		Object obj=null;
		try
		{
			obj=new ObjectMapper().readValue(json, cls);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		return obj;
	}
	public String convertObjectToJson(Object obj)
	{
		String json=null;
		try 
		{
			json=new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return json;
	}

}
