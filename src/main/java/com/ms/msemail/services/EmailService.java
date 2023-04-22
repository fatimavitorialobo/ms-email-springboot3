package com.ms.msemail.services;

import org.springframework.stereotype.Service;

import com.ms.msemail.repositories.EmailRepository;

@Service
public class EmailService {
	
	final EmailRepository repository;

	public EmailService(EmailRepository repository) {
		this.repository = repository;
	}

}
