import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="max.class" width=500 height=500>
</applet>
*/
public class max extends JApplet implements ActionListener{
        JButton b;
        JTextField t1,t2;
        JLabel l1,l2,l3;


    public void init(){
        setLayout (new GridLayout(3,2));

        l1=new JLabel("Enter Number 1");
        l2=new JLabel("Enter Number 2");
        l3=new JLabel("         ");
        b=new JButton("click me");
        t1 = new JTextField(20);
        t2 = new JTextField(20);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        add(l3);

        b.addActionListener(this);

    }

public void actionPerformed(ActionEvent e){

    int A=Integer.parseInt(t1.getText());
    int B=Integer.parseInt(t2.getText());
    if(A > B){
        l3.setText(A+ "is Maximum than "+B);
    }else{
        l3.setText(B+ "is Maximum than "+A);
    }
}
}