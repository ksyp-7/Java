import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="sod.class" height=500 width=500>
</applet>
*/
public class sod extends JApplet implements ActionListener{
    JButton b;
    JTextField t1;
    JLabel l1,l2;
    public void init(){
        setLayout(new GridLayout(2,2));

        b=new JButton("Click Me");
        l1=new JLabel("Enter Number ");
        l2=new JLabel("         ");
        t1=new JTextField(20);

        add(l1);
        add(t1);
        add(b);
        add(l2);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        int A =Integer.parseInt(t1.getText());
        int sum=0;
        while(A>0){
            int X;
            
            X=A%10;
            sum=sum+X;
            A=A/10;

        }
        l2.setText("Sum Of Digits ==> "+sum);
    }
}