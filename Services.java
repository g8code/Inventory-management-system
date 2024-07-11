import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Services extends JFrame implements ActionListener{
	JLabel l1;
	JButton b1,b2,b3,b4;
	
	
	public Services(){
		
		Font f2 = new Font("Comic Sans", Font.BOLD, 45);
	    Font f3 = new Font("Calibri", Font.PLAIN,18);
	    
		new JFrame();
		setSize(650,700);
		setTitle("Services");
		setLayout(null);
		
		l1=new JLabel("SERVICES");
		l1.setBounds(80,40,450,45);
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setForeground(Color.RED);
		l1.setFont(f2);
		add(l1);
		
		b1=new JButton("Laptop");
	    b1.setBounds(220,150,150,60);
	    b1.setFont(f3);
	    b1.addActionListener(this);
	    add(b1);
	    
	    b2=new JButton("Computer");
	    b2.setBounds(220,250,150,60);
	    b2.setFont(f3);
	    b2.addActionListener(this);
	    add(b2);
	    
	    b3=new JButton("Printer");
	    b3.setBounds(220,350,150,60);
	    b3.setFont(f3);
	    b3.addActionListener(this);
	    add(b3);
	    
	    b4=new JButton("Scanner");
	    b4.setBounds(220,450,150,60);
	    b4.setFont(f3);
	    b4.addActionListener(this);
	    add(b4);
	
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
            LaptopInfo lp = new LaptopInfo();
            dispose(); 
        } else if (e.getSource() == b2) {
            ComputerInfo cp = new ComputerInfo();
            dispose();
        } else if (e.getSource() == b3) {
            PrinterInfo pp = new PrinterInfo();
            dispose();
        }else if (e.getSource() == b4) {
            ScannerInfo sp = new ScannerInfo();
            dispose();
        }
		
	}

}
