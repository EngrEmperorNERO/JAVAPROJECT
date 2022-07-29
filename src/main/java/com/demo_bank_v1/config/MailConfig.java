package com.demo_bank_v1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import com.demo_bank_v1.mailMessenger.MailMessenger;

import java.util.Properties;


public class MailConfig {

   @Autowired
   private MailMessenger senderService;
   	
   
   @EventListener(ApplicationReadyEvent.class)
   public void sendMail() {
	   senderService.sendEmail("admin1allsafe@gmail.com", "this is subject", "this is body");
   
   
      
    }
    // End Of Email Config Method.
}
