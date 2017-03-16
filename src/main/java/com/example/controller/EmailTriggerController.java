package com.example.controller;
import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

//import com.example.config.MailConfign;

//import com.example.config.MailConfign;


@RestController
public class EmailTriggerController {

	@Autowired
    public MailConfig emailSender;
	
	 @RequestMapping("/mail")
	    @ResponseBody
	    String send() throws MessagingException {        
	     emailSender.sendmail("*******@gmail.com", "This is Testing", "andylu");
	        return "The email have been sent";
	    }
	 
	
}
