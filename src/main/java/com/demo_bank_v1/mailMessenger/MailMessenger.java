package com.demo_bank_v1.mailMessenger;

import com.demo_bank_v1.config.MailConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;


@Service
public class MailMessenger {
	
	@Autowired
	private JavaMailSender mailsender;
	
	public void sendEmail(String toEmail,String subject,String body) {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("adminallsafe@gmail.com");
		message.setText(toEmail);
		message.setText(body);
		message.setSubject(subject);
		mailsender.send(message);
	}
    }
    // End Of HTML EMAIL MESSAGE METHOD.




