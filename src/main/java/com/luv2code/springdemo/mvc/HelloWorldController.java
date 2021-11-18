package com.luv2code.springdemo.mvc;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
// need a controller method to show the html form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	// need a controller method to process the html form
	@RequestMapping("/processForm")
	public String processForm(){
		return "helloworld";
	}
	
	// new a controller
	@RequestMapping("/processFormVersionTwo")
	public String letsShouldDude(HttpServletRequest request,Model model ) {
		// read the request form the form
		String mess=request.getParameter("studentName");
		// convert to upper
		mess="Yo! "+ mess.toUpperCase();
		
		// add method
		 model.addAttribute("message",mess);
		
		return "helloworld";}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String mess,Model model ) {	
		// convert to upper
		mess="Hey my friend from v3 :v "+ mess.toUpperCase();
		
		// add method
		 model.addAttribute("message",mess);
		
		return "helloworld";}
	
}
