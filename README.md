# Spring Boot Email Sender with Attachment

This is a Spring Boot project that enables users to send emails with optional file attachments using Thymeleaf for the frontend and JavaMailSender for email handling.

## Features
- Send emails with attachments.
- User-friendly web interface using Thymeleaf.
- Supports file uploads up to 10MB.
- Error handling and success notifications.

## Technologies Used
- **Backend:** Spring Boot, Spring MVC
- **Frontend:** Thymeleaf
- **Email:** JavaMailSender, MimeMessageHelper
- **File Upload:** MultipartFile
- **Build Tool:** Maven
- **Java Version:** 8 or higher

---

## Project Setup

### 1. Clone the Repository
```bash
git clone https://github.com/username/email-sender-springboot.git
cd email-sender-springboot
```

### 2. Configure Email Credentials
Create an `application.properties` file in `src/main/resources` and add the following email configurations:

```properties
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your-email@gmail.com
spring.mail.password=your-password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

# Maximum file size
spring.servlet.multipart.max-file-size=10MB
spring.servlet.multipart.max-request-size=10MB
```

> **Note:** Enable "Less secure app access" for Gmail or set up an app-specific password.

### 3. Build and Run the Application
```bash
mvn clean install
mvn spring-boot:run
```

### 4. Access the Application
Visit [http://localhost:8080/sendEmail](http://localhost:8080/sendEmail) to send emails.

---

## How to Use
1. Fill in the email recipient's address.
2. Enter the subject and body of the email.
3. Attach a file (optional).
4. Click "Send Email".
5. A success message will appear if the email is sent.

---

## Project Structure
```
src/
|-- main/
|   |-- java/
|   |   |-- com/Gmailsender/
|   |       |-- controller/       # EmailController
|   |       |-- model/            # Email Model
|   |       |-- service/          # EmailService
|   |-- resources/
|       |-- templates/
|           |-- emailForm.html    # Thymeleaf Email Form
|       |-- application.properties
|-- test/
|-- pom.xml
```

---

## API Endpoints
- **GET /sendEmail** – Displays the email form.
- **POST /sendEmail** – Sends an email with or without an attachment.

---
## images 
Step 1:-

![Screenshot (3)](https://github.com/user-attachments/assets/e7bef098-2afa-475d-85ea-bc03fd745d48)


Step 2:- 

![Screenshot (4)](https://github.com/user-attachments/assets/400cedfe-ea55-404a-abd9-2b5df880ad4a)


Step 3:- 
![Screenshot (5)](https://github.com/user-attachments/assets/47ca646b-5239-4aa0-8c52-846b34fd248a)


Step 4:- 

![WhatsApp Image 2025-01-05 at 10 51 37 AM](https://github.com/user-attachments/assets/808f069e-841c-48ce-a97e-141321f6b521)




---
## Troubleshooting
- Ensure SMTP configuration is correct.
- Check email server settings if emails are not being sent.
- Verify attachment file size does not exceed limits.
- Review the console for error logs.

---

## License
This project is licensed under the MIT License. Feel free to modify and use it.

---

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

---

## Contact
**Author:** Abhishek Hanmant Ekal  
**Email:** ekalabhishek4@gmail.com  
**LinkedIn:** [LinkedIn Profile](https://www.linkedin.com/in/abhishek-ekal-57642425b)

