package com.tarikMarket.gestion.services;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Home {
	 @RequestMapping("/")
	    public String home(){
	        return "Hello World!";
	    }
}
