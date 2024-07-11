import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;

import java.io.File;
import java.util.Properties;

public class EmailSender {

    private final static String USERNAME = "projectsystem21@gmail.com";
    private final static String PASSWORD = "ujhrlmnhbgbosgyk";

    public static void sendEmail(String to, String subject, String messageText, String attachmentPath) throws MessagingException {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587"); 

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(USERNAME, PASSWORD);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(USERNAME));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
        message.setSubject(subject);

        BodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setText(messageText);

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);

        messageBodyPart = new MimeBodyPart();
        DataSource source = new FileDataSource(attachmentPath);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(new File(attachmentPath).getName());
        multipart.addBodyPart(messageBodyPart);

        message.setContent(multipart);

        Transport.send(message);
        System.out.println("Email sent successfully with attachments.");
    }
}
