import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="reverse.class" height=300 width=300> 
</applet>
*/
public class reverse extends JApplet implements ActionListener{
    JButton b;
    JLabel l1,l2;
    JTextField t1;
    public void init(){
        setLayout(new GridLayout(2,2));

        t1=new JTextField(20);
        b=new JButton("Click Me");
        l1=new JLabel("Enter Number ");
        l2=new JLabel("       ");

        b.addActionListener(this);
        add(l1);
        add(t1);
        add(b);
        add(l2);
    }
    public void actionPerformed(ActionEvent e){
        int A=Integer.parseInt(t1.getText());
        int Rev=0;
        int Rem;
        while(A != 0){
            Rem = A%10;
            Rev=Rev*10+Rem;
            A=A/10;
        }
        l2.setText("Reversed Number ==> "+Rev);
    }

}