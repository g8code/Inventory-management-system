import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import java.util.Random;

public class OTPSmail {
    private final String username = "projectsystem21@gmail.com";
    private final String password = "ujhrlmnhbgbosgyk"; 
    private String currentOTP;

    public void sendOTP(String to) throws MessagingException {
        Random ra = new Random();
        currentOTP = ra.nextInt(9) + "" + ra.nextInt(9) + ra.nextInt(9) + ra.nextInt(9); 

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "25"); 

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(username));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
        message.setSubject("OTP For Login");
        message.setText("OTP code = " + currentOTP);
        Transport.send(message);
    }

    public boolean verifyOTP(String userOTP) {
        return userOTP.equals(currentOTP);
    }
}
