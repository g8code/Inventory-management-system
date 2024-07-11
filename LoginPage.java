import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage implements ActionListener {
    JLabel l1, l2, l3;
    JTextField tf1;
    JPasswordField tf2;
    JButton b1, b2;
    JFrame f1;

    public static void main(String[] args) {
        new LoginPage();
    }

    LoginPage() {
        Font f2 = new Font("Comic Sans", Font.BOLD, 45);
        Font f3 = new Font("Calibri", Font.PLAIN, 28);

        f1 = new JFrame();
        f1.setSize(650, 500);
        f1.setTitle("Login");
        f1.setLayout(null);

        l1 = new JLabel("YASH  COMPUTERS");
        l1.setBounds(100, 50, 450, 45);
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(Color.RED);
        l1.setFont(f2);
        f1.add(l1);

        l2 = new JLabel("USERNAME :");
        l2.setBounds(130, 150, 200, 45);
        l2.setForeground(Color.BLACK);
        l2.setFont(f3);
        f1.add(l2);

        tf1 = new JTextField();
        tf1.setBounds(290, 155, 200, 30);
        f1.add(tf1);

        l3 = new JLabel("PASSWORD :");
        l3.setBounds(130, 220, 200, 45);
        l3.setForeground(Color.BLACK);
        l3.setFont(f3);
        f1.add(l3);

        tf2 = new JPasswordField();
        tf2.setBounds(290, 225, 200, 30);
        f1.add(tf2);

        b1 = new JButton("Login");
        b1.setBounds(180, 320, 100, 50);
        b1.addActionListener(this);
        f1.add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(320, 320, 100, 50);
        b2.addActionListener(this);
        f1.add(b2);

        f1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == b1) {
            String username = tf1.getText();
            String password = new String(tf2.getPassword());
            if (isValidUser(username, password)) {
                new Services();
                f1.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.");
            }
        } else if (obj == b2) {
            f1.dispose();
        }
    }

    private boolean isValidUser(String username, String password) {
        // Replace this logic with your actual validation mechanism
        return username.equals("admin") && password.equals("admin");
    }
}