import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="factorial.class" height=500 width=500>
</applet>
*/

public class factorial extends JApplet implements ActionListener{
        JButton b;
        JLabel l1,l2;
        JTextField t1;        
    public void init(){
        setLayout(new GridLayout(2,2));

        b=new JButton("Click Me");
        l1=new JLabel("Enter Number");
        l2=new JLabel("   ");
        t1=new JTextField(20);



        add(l1);
        add(t1);
        add(b);
        add(l2);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int A=Integer.parseInt(t1.getText());
        int fact = 1;
        if(A<=0){
            l2.setText("ERROR!, foctorial of "+A+" isn't possibe");
        }else{
            for(int i=1; i<=A; i++){
                fact=fact*i;
            }
            l2.setText("foctorial of "+A+" is "+fact);
        }
    }
}