package com.sathya.spring.util;

import java.io.IOException;
import java.io.InputStream;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Component
public class CommonUtil 
{
	@Autowired
	private JavaMailSender mailSender;
	
	public String sendEmail(String toAddress,String subject,String text,final CommonsMultipartFile cmf)
	{
		String msg=null;
		try
		{
			MimeMessage message=mailSender.createMimeMessage();
			MimeMessageHelper helper=new MimeMessageHelper(message, true);
			helper.setFrom("habeeb.shaik808@gmail.com");
			helper.setTo(toAddress);
			helper.setSubject(subject);
			helper.setText(text);

			if(cmf!=null)
			{
				helper.addAttachment(cmf.getOriginalFilename(), new InputStreamSource() 
				{
					public InputStream getInputStream() throws IOException 
					{
						return cmf.getInputStream();
					}
				});
			}
			mailSender.send(message);
            msg="Mail sent to Customer Email Id";
		} catch (Exception e)
		{
			e.printStackTrace();
			msg="Mail is not sent";
		}
		return msg;
	}
	public void sendEmail(String toAddress,String subject,String text)
	{
		sendEmail(toAddress, subject, text, null);
	}

}
