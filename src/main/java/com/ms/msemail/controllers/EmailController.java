package com.ms.msemail.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.ms.msemail.services.EmailService;

@RestController
public class EmailController {
	
	final EmailService service;
	
	public EmailController(EmailService service) {
		this.service = service;
	}
	
	
}
