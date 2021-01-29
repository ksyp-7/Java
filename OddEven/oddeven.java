import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*
<applet code="oddeven.class" height=500 width=500>
</applet>
*/

public class oddeven extends JApplet implements ActionListener{
    JButton b;
    JTextField t;
    JLabel l,l2;
    public void init(){
        setLayout(new GridLayout(2,2));
        t = new JTextField(20);
        l = new JLabel("Enter Number");
        b = new JButton("Click Me");
        l2 = new JLabel("           ");

        add(l);
        add(t);
        add(b);
        add(l2);

        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int a=Integer.parseInt(t.getText());
        if(a%2==0){
            l2.setText(" Number is even");
        }else{
            l2.setText(" Number is Odd");
        }
    }

}