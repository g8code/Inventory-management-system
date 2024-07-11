import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.mail.MessagingException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class LaptopInfo implements ActionListener {
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
	TextArea ta;
	JButton b1,b2;
	JComboBox<Object> cb1;
	JFrame f1;
	

	public static void main(String[] args) {
		new LaptopInfo();
	}
	
	LaptopInfo(){
		
		 Font f2 = new Font("Comic Sans", Font.BOLD, 45);
	     Font f3 = new Font("Calibri", Font.PLAIN,28);
	     
		f1=new JFrame();
		f1.setSize(700,850);
		f1.setTitle("LaptopInfo");
		f1.setLayout(null);
		
		l1=new JLabel("LAPTOP");
		l1.setBounds(100,50,450,45);
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setForeground(Color.RED);
		l1.setFont(f2);
		f1.add(l1);
		
		l2=new JLabel("Company :");
		l2.setBounds(100,150,200,45);
		l2.setForeground(Color.BLACK);
		l2.setFont(f3);
		f1.add(l2);
		
		tf1=new JTextField();
		tf1.setBounds(250,155,300,30);
		f1.add(tf1);
		
		l3=new JLabel("    "+"Model :");
		l3.setBounds(100,200,200,45);
		l3.setForeground(Color.BLACK);
		l3.setFont(f3);
		f1.add(l3);
		
		tf2=new JTextField();
		tf2.setBounds(250,205,300,30);
		f1.add(tf2);
		
		l4=new JLabel("      "+"RAM :");
		l4.setBounds(100,250,200,45);
		l4.setForeground(Color.BLACK);
		l4.setFont(f3);
		f1.add(l4);
		
		tf3=new JTextField();
		tf3.setBounds(250,255,300,30);
		f1.add(tf3);

		l5=new JLabel("Processor :");
		l5.setBounds(100,300,200,45);
		l5.setForeground(Color.BLACK);
		l5.setFont(f3);
		f1.add(l5);
		
		tf4=new JTextField();
		tf4.setBounds(250,305,300,30);
		f1.add(tf4);
		
		l6=new JLabel("Cust Name :");
		l6.setBounds(100,350,200,45);
		l6.setForeground(Color.BLACK);
		l6.setFont(f3);
		f1.add(l6);
		
		tf5=new JTextField();
		tf5.setBounds(250,355,300,30);
		f1.add(tf5);
		
		l7=new JLabel("Mobile No. :");
		l7.setBounds(100,400,200,45);
		l7.setForeground(Color.BLACK);
		l7.setFont(f3);
		f1.add(l7);
		
		tf6=new JTextField();
		tf6.setBounds(250,405,300,30);
		 tf6.addKeyListener(new KeyAdapter() {
	            public void keyTyped(KeyEvent ke) {
	                char ch = ke.getKeyChar();
	                if (!((ch >= '0') && (ch <= '9') || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))) {
	                    ke.consume();
	                }
	            }
	        });
		f1.add(tf6);
		
		l8=new JLabel("     "+"Email :");
		l8.setBounds(100,450,200,45);
		l8.setForeground(Color.BLACK);
		l8.setFont(f3);
		f1.add(l8);
		
		tf7=new JTextField();
		tf7.setBounds(250,455,210,30);
		 tf7.addKeyListener(new KeyAdapter()
	  	  {
	  		public void keyTyped(KeyEvent ke)
	  		{
	  			char ch=ke.getKeyChar();
	  		
	  		if(!((ch>'A'&& ch<='Z')||(ch>='a' && ch<='z')||(ch>='0' && ch<='9')||ch==KeyEvent.VK_BACK_SPACE ||ch==KeyEvent.VK_SPACE))
	  		{
	  			f1.getToolkit().beep();
	  			ke.consume();
	  		}
	  		}
	  	});
		 String s1[] = {"@gmail.com","@yahoo.com","@rediffmail.com","@outlook.com","@msn.co.in"};
	      cb1 = new JComboBox<Object>(s1);
	      cb1.setBounds(460,455,100,30);
	      f1.add(cb1);
		  f1.add(tf7);
		
		l9=new JLabel("    "+"Issue :");
		l9.setBounds(100,520,100,45);
		l9.setForeground(Color.BLACK);
		l9.setFont(f3);
		f1.add(l9);
		
		ta=new TextArea();
		ta.setBounds(250,505,300,100);
		f1.add(ta);
		
		l10=new JLabel("Charges :");
		l10.setBounds(100,620,200,45);
		l10.setForeground(Color.BLACK);
		l10.setFont(f3);
		f1.add(l10);
		
		tf8=new JTextField();
		tf8.setBounds(250,625,300,30);
		tf8.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent ke) {
                char ch = ke.getKeyChar();
                if (!((ch >= '0') && (ch <= '9') || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))) {
                    ke.consume();
                }
            }
        });
		f1.add(tf8);
		
		b1=new JButton("Back");
	    b1.setBounds(250,690,100,50);
	    b1.addActionListener(this);
	    f1.add(b1);
	    
	    b2=new JButton("Submit");
	    b2.setBounds(400,690,100,50);
	    b2.addActionListener(this);
	    f1.add(b2);
	    
		
	    f1.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	 Object obj = e.getSource(); 
	 if(obj==b1){ 
			 new Services();
		    f1.dispose();
	 	}else if(obj==b2){
	 		String comp = tf1.getText();
	        String model = tf2.getText();
	        String ram = tf3.getText();
	        String pro = tf4.getText();
	        String cust= tf5.getText();
	        String mobno = tf6.getText();
	        String domain = (String) cb1.getSelectedItem();
	        String email = tf7.getText() + domain;
	        String issue = ta.getText();
	        String charges=tf8.getText();
	        String attachmentPath = "";
	        
	        InsertIntoDatabase.laptopdata(comp,model,ram,pro,cust,mobno,email,issue,charges);
	        
	        JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Specify a file to save");
            fileChooser.setSelectedFile(new java.io.File(cust + "_Invoice.pdf"));
            int userSelection = fileChooser.showSaveDialog(f1);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                java.io.File fileToSave = fileChooser.getSelectedFile();
                attachmentPath = fileToSave.getAbsolutePath();
                DynamicBilling.generatePDF(comp, model, ram, pro, cust, mobno, email, issue, charges, attachmentPath);
                JOptionPane.showMessageDialog(f1, "PDF saved: " + attachmentPath);

                
                try {
                    EmailSender.sendEmail(email, "Invoice and Details", "Here are your Laptop details and invoice.", attachmentPath);
                    JOptionPane.showMessageDialog(f1, "Email sent successfully to: " + email);
                } catch (MessagingException me) {
                    JOptionPane.showMessageDialog(f1, "Error sending email: " + me.getMessage());
                }
            }}
  }

	private void clearFields() {
		// TODO Auto-generated method stub
		tf1.setText("");
	    tf2.setText("");
	    tf3.setText("");
	    tf4.setText("");
	    tf5.setText("");
	    tf6.setText("");
	    tf7.setText("");
	    ta.setText("");
	    tf8.setText("");
	}
}

