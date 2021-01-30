import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="Armstrong.class" height=500 width=500>
</applet>
*/
public class Armstrong extends JApplet implements ActionListener{
    JButton b;
    JTextField t1;
    JLabel l1,l2;
    public void init(){
        setLayout(new GridLayout(3,2));
        b=new JButton("Clck Me");
        t1=new JTextField(20);
        l1=new JLabel("Enter Number");
        l2=new JLabel("                    ");

        add(l1);
        add(t1);
        add(b);
        add(l2);

        b.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        int A=Integer.parseInt(t1.getText());
        int B=A;
        int Res=0;
        int Rem;
        while(A != 0){
            Rem = A % 10;
            Res=Rem*Rem*Rem+Res;
            A=A/10;
        }
        if(Res == B){
            l2.setText(B+ " is Armstrong Number ");
        }else{
            l2.setText(B+ " isn't Armstrong Number ");
        }

    }
}