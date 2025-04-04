package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.JokApi;

@RestController
public class JokController 
{
	String s1 ;
	String s2;
	
		@GetMapping(value = "/")
		public ModelAndView m1(ModelAndView m)
		{
			 String url = "https://official-joke-api.appspot.com/jokes/random";
	         RestTemplate restTemplate = new RestTemplate();
	         String a=null;;
	         String b=null;
	         
	         try {
	             JokApi joke = restTemplate.getForObject(url, JokApi.class);
	             a= joke.getSetup();
	             b= joke.getPunchline();
	             s1 =a;
	             s2 = b;
	             
	         } catch (RestClientException e) {
	             System.out.println("Failed to fetch joke: " + e.getMessage());
	         }
			
			m.addObject("setup", a);
			m.addObject("punchline", b);
			m.setViewName("index.jsp");
			return m;
		}
		
		
		@GetMapping("/change")
		public ModelAndView m2(ModelAndView m)
		{
			m1(m);
			return m;
		}
		
		@GetMapping("/translate")
		public ModelAndView m3(ModelAndView m)
		{
			String str1 = translateToMarathi(s1);
			String str2 = translateToMarathi(s2);
			
			  	m.addObject("setup", str1);
			    m.addObject("punchline", str2);
			     
			
			m.setViewName("index.jsp");
			return m;
		}
		
		
		private String translateToMarathi(String text) 
		{
			if (text == null) return "";
			// This is a placeholder. Use a real translation API here.
			return "मराठीत " + text;
		}
		
}
