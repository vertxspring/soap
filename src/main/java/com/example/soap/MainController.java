package com.example.soap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class MainController {
 
	@Autowired
   MailService ms;

   
   @RequestMapping(value = "sendmail",method = RequestMethod.GET)
   @ResponseBody
   public String method3(@RequestParam("recipent") String recipient,@RequestParam("subject") String sub, @RequestParam("content") String body) {
	System.out.println(body);
	   ms.sendMail(recipient,sub,body);
	   return "success";
   }
   
   
}