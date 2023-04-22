package com.ms.msemail.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.msemail.dtos.EmailDto;
import com.ms.msemail.models.EmailModel;
import com.ms.msemail.services.EmailService;

import jakarta.validation.Valid;

@RestController
public class EmailController {
	
	final EmailService service;
	
	public EmailController(EmailService service) {
		this.service = service;
	}
	
	@PostMapping("/sending-email")
	public ResponseEntity<EmailModel> sendingEmail(@RequestBody @Valid EmailDto emailDto){
		EmailModel emailModel = new EmailModel();
		BeanUtils.copyProperties(emailDto, emailModel);
		service.sendEmail(emailModel);
		return new ResponseEntity<>(emailModel, HttpStatus.CREATED);
	}
	
}
