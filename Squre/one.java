import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 /*
 <applet code="one.class" height=300 width=300>
 </applet>
 */
 public class one extends JApplet implements ActionListener{
 
 	JButton b1;
 	JLabel l1,l2;
 	JTextField t1;
 	public void init(){
 		setLayout(new GridLayout (2,2));
 		l1=new JLabel("Enter Number");
 		t1=new JTextField(20);
 		b1=new JButton("Click Me");
 		l2=new JLabel("                        ");
 		add(l1);
 		add(t1);
 		add(b1);
 		add(l2);
 		b1.addActionListener(this);
 	}
 	public void actionPerformed(ActionEvent e){
 		int n=Integer.parseInt(t1.getText());
 		int o=n*n;
 		l2.setText("Square==> "+o);
 	
 	
 	}
 
 }
