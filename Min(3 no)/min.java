import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="min.class" height=500 width=500>
</applet>
*/
public class min extends JApplet implements ActionListener{
    JButton b;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3;
    public void init(){
        setLayout(new GridLayout(8,2));  


        l1 = new JLabel("Enter Number 1 ");
        l2 = new JLabel("Enter Number 2 ");
        l3 = new JLabel("Enter Number 3 ");
        l4 = new JLabel("           ");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        b = new JButton("Click Me");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b);
        add(l4);

        b.addActionListener(this);
    }
public void actionPerformed(ActionEvent e){
    int A=Integer.parseInt(t1.getText());
    int B=Integer.parseInt(t2.getText());
    int C=Integer.parseInt(t3.getText());

    if(A<B && A<C){
        l4.setText(A+"is Minimum than "+B+" and "+C);
    }else if(B<A && B<C){
        l4.setText(B+"is Minimum than "+A+" and "+C);
    }else{
        l4.setText(C+"is Minimum than "+A+" and "+B);
    }
}
}