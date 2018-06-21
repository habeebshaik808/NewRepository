package com.sathya.spring.util;

import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Component;

@Component
public class CoDecUtil 
{
	public String doEncode(String normalString)
	{
		byte[] arr=Base64.encodeBase64(normalString.getBytes());
		return new String(arr);
	}
	public String doDecode(String encodedString)
	{
		byte[] arr=Base64.decodeBase64(encodedString.getBytes());
		return new String(arr);
	}
	

}
