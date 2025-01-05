package com.Gmailsender.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.Gmailsender.Entity.Email;
import com.Gmailsender.services.EmailService;

@Controller

public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/sendEmail")
    public String showEmailForm(Model model) {
        model.addAttribute("email", new Email());
        return "emailForm"; // emailForm.html template
    }

    
     // for the no attacment this file 
    
//    @PostMapping("/sendEmail")
//    public String sendEmail(Email email, Model model) {
//        emailService.sendEmail(email);
//        model.addAttribute("message", "Email sent successfully to " + email.getToEmail());
//        return "done"; // Return to the email form with success message
//    }
    
    @PostMapping("/sendEmail")
    public String sendEmail(Email email, MultipartFile attachment, Model model) {
        try {
            emailService.sendEmailWithAttachment(email, attachment); // Send email with attachment
            model.addAttribute("message", "Email sent successfully to " + email.getToEmail()); // Add success message
        } catch (Exception e) {
            model.addAttribute("message", "Failed to send email.");
        }
        return "done"; // Return to the email form with success/failure message
    }
    
    
}
