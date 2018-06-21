package com.sathya.spring.util;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class CodeUtil 
{
	private String generateString(int length)
	{
		return UUID.randomUUID().toString().replaceAll("-", "").substring(0,length);
	}
	public String generateToken()
	{
		return generateString(8);
	}
	public String generatePwd()
	{
		return generateString(6);
	}
	
	
	

}
