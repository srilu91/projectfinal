package com.amock.helloazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class HelloAzureApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloAzureApplication.class, args);
	}

	@Controller
	class WebController {
		
		@GetMapping 
		@RequestMapping("/welcome")
		public String home(){
			return "index";
		}
	}
}
