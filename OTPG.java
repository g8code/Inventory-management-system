import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.mail.MessagingException;

public class OTPG implements ActionListener {
    JLabel l1, l2, l3;
    JTextField tf1, tf2;
    JButton b1, b2;
    JFrame f1;
    OTPSmail otpMailer = new OTPSmail(); 

    public static void main(String[] args) {
        new OTPG();
    }

    OTPG() {
        f1 = new JFrame("VERIFY");
        f1.setSize(500, 450);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setResizable(false);

        l1 = new JLabel("Email Verify");
        l1.setBounds(170, 50, 300, 45);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Arial", Font.BOLD, 30));
        f1.add(l1);

        l2 = new JLabel("Email:");
        l2.setBounds(50, 150, 200, 45);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Calibri", Font.PLAIN, 28));
        f1.add(l2);

        tf1 = new JTextField();
        tf1.setBounds(180, 155, 200, 30);
        f1.add(tf1);

        l3 = new JLabel("OTP:");
        l3.setBounds(50, 200, 200, 45);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Calibri", Font.PLAIN, 28));
        f1.add(l3);

        tf2 = new JTextField();
        tf2.setBounds(180, 205, 200, 30);
        f1.add(tf2);

        b1 = new JButton("Verify");
        b1.setBounds(120, 300, 100, 30);
        b1.addActionListener(this);
        f1.add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(300, 300, 100, 30);
        b2.addActionListener(this);
        f1.add(b2);

        f1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String email = tf1.getText();
            String userOTP = tf2.getText();
            if (!userOTP.isEmpty()) {
                if (otpMailer.verifyOTP(userOTP)) {
                    JOptionPane.showMessageDialog(f1, "Valid user");
                } else {
                    JOptionPane.showMessageDialog(f1, "Invalid OTP");
                }
            } else {
                try {
                    otpMailer.sendOTP(email);
                    JOptionPane.showMessageDialog(f1, "OTP sent to " + email);
                } catch (MessagingException ex) {
                    JOptionPane.showMessageDialog(f1, "Error sending OTP: " + ex.getMessage());
                }
            }
        } else if (e.getSource() == b2) {
            f1.dispose();
        }
    }
}
