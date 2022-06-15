package com.controllador;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.EmailService;
@Service
@Transactional
@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    private EmailService emailService;
    @Autowired
    private EmailService userService;
    private EntityManager entityManager;
    private EntityManagerFactory entityManagerFactory;
    private JavaMailSender mailSender;





    @PostMapping("/createUser")
   /* public ResponseEntity<User> createUser(@RequestBody UserPojo userPojo){

        User user= new User(userPojo.getId(),userPojo.getNombre(),userPojo.getPrioridad(),userPojo.getEdad());
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @PostMapping("/sendEmail")
    public String sendEmail(@RequestBody UserPojo emailPojo){
        try{
            emailService.sendEmail(emailPojo.getCorreo(), "Bienvenido", "Email, Password", "gestiondev.ueb@gmail.com");
            return "Correo enviado";
        }catch (Exception e){
            return e.getMessage();
        }
        }
*/
	public EmailService getUserService() {
		return userService;
	}

	public void setUserService(EmailService userService) {
		this.userService = userService;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public JavaMailSender getMailSender() {
		return mailSender;
	}

	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	public EmailService getEmailService() {
		return emailService;
	}

	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}

	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}
	
}
