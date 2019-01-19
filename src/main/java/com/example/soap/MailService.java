package com.example.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailService {


	@Autowired
	JavaMailSender emailSender;
	
	public void sendMail(String recipient, String subject, String body){
		 SimpleMailMessage message = new SimpleMailMessage(); 
	        message.setTo(recipient); 
	        message.setSubject(subject); 
	        message.setText(body);
	        emailSender.send(message);
	}
}
