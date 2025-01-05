package com.Gmailsender.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.Gmailsender.Entity.Email;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

	// no attachment 
	
//    @Autowired
//    private JavaMailSender javaMailSender;
//
//    public void sendEmail(Email email) {
//        SimpleMailMessage msg = new SimpleMailMessage();
//        msg.setFrom("humanityerror15@gmail.com"); // Use environment variables or properties for better security
//        msg.setTo(email.getToEmail());
//        msg.setSubject(email.getSubject());
//        msg.setText(email.getBody());
//
//        javaMailSender.send(msg);
//        System.out.println("Email sent to " + email.getToEmail());
//    }
	

	
	// add the attchment 
	
    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmailWithAttachment(Email email, MultipartFile attachment) {
        try {
            // Create the email message
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);

            // Set the email details
            messageHelper.setFrom("humanityerror15@gmail.com");
            messageHelper.setTo(email.getToEmail());
            messageHelper.setSubject(email.getSubject());
            messageHelper.setText(email.getBody());

            // Check if an attachment is provided
            if (attachment != null && !attachment.isEmpty()) {
                messageHelper.addAttachment(attachment.getOriginalFilename(), attachment);
            }

            // Send the email
            javaMailSender.send(mimeMessage);

        } catch (MailException | MessagingException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to send email with attachment", e);
        }
}
}

