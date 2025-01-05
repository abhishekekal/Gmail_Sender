package com.Gmailsender.Entity;



public class Email {
    private String toEmail;
    private String subject;
    private String body;

    // Getters and Setters
    
    public Email(String toEmail, String subject, String body) {
		super();
		this.toEmail = toEmail;
		this.subject = subject;
		this.body = body;
	}
    
   
	public Email() {
		// TODO Auto-generated constructor stub
	}


	public String getToEmail() {
        return toEmail;
    }

    

	public void setToEmail(String toEmail) {
        this.toEmail = toEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    
    @Override
   	public String toString() {
   		return "Email [toEmail=" + toEmail + ", subject=" + subject + ", body=" + body + "]";
   	}

    
    
}

