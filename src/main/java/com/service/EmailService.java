package com.service;

import java.util.Properties;

import javax.mail.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;
@Service
public class EmailService {

    //Importante hacer la inyección de dependencia de JavaMailSender:
    @Autowired
    private JavaMailSender mailSender;
    
    @Bean
	public JavaMailSender getJavaMailSender() {
		
    	init();
    	
    	JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		
    	mailSender.setHost("smtp.gmail.com");
		mailSender.setPort(587);
		mailSender.setUsername("proyectoINGS1@gmail.com");
		mailSender.setPassword("ProyectoExcel12");
		
		Properties props = mailSender.getJavaMailProperties();
		
		props.put("mail.transport.protocol","smtp");
		props.put("mail.smtp.auth","true");
		props.put("mail.smtp.starttls.enable","true");
		props.put("mail.debug","true");
		
		return mailSender;
		
	}
    
    private final Properties properties = new Properties();
 
	private Session session;
	
	@Bean
	private void init() {
 
		properties.put("mail.smtp.host", "mail.gmail.com");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.port",25);
		properties.put("mail.smtp.mail.sender","proyectoINGS1@gmail.com");
		properties.put("mail.smtp.user", "proyectoINGS1@gmail.com");
		properties.put("mail.smtp.auth", "ProyectoExcel12");
 
		setSession(Session.getDefaultInstance(properties));
	}
	
    public void sendEmail(String to, String subject, String content, String from) {

        try {
        	
            System.out.println(to);
            System.out.println("");
            SimpleMailMessage email = new SimpleMailMessage();
            email.setTo(to);
            email.setSubject(subject);
            email.setText(content);
            mailSender.send(email);

        } catch (MailException e) {
            System.out.println("ESA MONDA NO SIRVE" + e.getMessage());
        }

    }

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}
    
}
