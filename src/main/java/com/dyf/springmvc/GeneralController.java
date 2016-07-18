package com.dyf.springmvc;  
  

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;  

@Controller 
public class GeneralController {  

	 @RequestMapping("hello")
     public String hello(HttpServletRequest request){
         request.setAttribute("newUserName", "hello ");
         return "login";
  }
} 