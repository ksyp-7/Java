import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="posneg.class" height=500 width=500>
</applet>
*/
public class posneg extends JApplet implements ActionListener{
    JButton b;
    JLabel l1,l2;
    JTextField t1;
    public void init(){
        setLayout(new GridLayout(3,2));
        l1 = new JLabel("Enter Number ");
        l2 = new JLabel("           ");
        t1 = new JTextField(20);
        b = new JButton("Click me");

        
        add(l1);
        add(t1);
        add(b);
        add(l2);

        b.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        int A=Integer.parseInt(t1.getText());
        if(A>0){
            l2.setText(A+" is Positive Number ");
        }else if(A<0){
            l2.setText(A+" is Negative Number ");
        }else{
            l2.setText("Entered number is Zero");
        }
    }
}