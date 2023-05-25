package com.example.jenkins.practise.demo.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	private static final Logger logger = LoggerFactory.getLogger(MyController.class);
	
	
	
	@GetMapping("/rabin")
	public String what() {
		logger.info("whattttt");
		return "I am fine";
	}

	}


