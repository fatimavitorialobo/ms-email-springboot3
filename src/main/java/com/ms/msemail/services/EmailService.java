package com.ms.msemail.services;

import java.time.LocalDateTime;

import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.ms.msemail.enums.StatusEmail;
import com.ms.msemail.models.EmailModel;
import com.ms.msemail.repositories.EmailRepository;

@Service
public class EmailService {
	
	final JavaMailSender emailSender;
	final EmailRepository repository;

	public EmailService(EmailRepository repository, JavaMailSender emailSender) {
		this.repository = repository;
		this.emailSender = emailSender;
	}

	@SuppressWarnings("finally")
	public EmailModel sendEmail(EmailModel emailModel) {
		emailModel.setSendDateEmail(LocalDateTime.now());
		try{
			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom(emailModel.getEmailFrom());
			message.setTo(emailModel.getEmailTo());
			message.setSubject(emailModel.getSubject());
			message.setText(emailModel.getText());
			emailSender.send(message);
		
			emailModel.setStatusEmail(StatusEmail.SENT);
		
		}catch (MailException e) {
			emailModel.setStatusEmail(StatusEmail.ERROR);
		} finally {
			return repository.save(emailModel);
	}
	}

}
