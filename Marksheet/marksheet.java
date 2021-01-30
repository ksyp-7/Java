import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
<applet code="marksheet.class" height=500 width=500>
</applet>
*/

public class marksheet extends JApplet implements ActionListener{
    JButton b;
    JTextField t1,t2,t3,TS,tE;
    JLabel  l1,l2,l3,l4,p,pa,c,ca,t,ta,S,E,sn,S_A;
    public void init(){
        setLayout(new GridLayout(10,2));
        S=new JLabel("Enter Studen Name ");
        E=new JLabel("Enter En Rollment Number");
        l1=new JLabel("Enter Marks Of Subject 1");
        l2=new JLabel("Enter Marks Of Subject 2");
        l3=new JLabel("Enter Marks Of Subject 3");
        p=new JLabel("Your Per ");
        t=new JLabel("Total Marks");
        c=new JLabel("Your Class ");
        l4=new JLabel("          ");
        S_A=new JLabel("                ");
        ta=new JLabel("                ");
        ca=new JLabel("                ");
        pa=new JLabel("                ");
        t1=new JTextField(20);
        t2=new JTextField(20);
        t3=new JTextField(20);
        b=new JButton("Click Me");
        sn=new JLabel("Student Name ");
        TS=new JTextField(20);
        tE=new JTextField(20);


        add(S);
        add(TS);
        add(E);
        add(tE);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b);
        add(l4);
        add(sn);
        add(S_A);
        add(c);
        add(ca);
        add(t);
        add(ta);
        add(p);
        add(pa);
        
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int A=Integer.parseInt(t1.getText());
        int B=Integer.parseInt(t2.getText());
        int C=Integer.parseInt(t3.getText());
        int D=A+B+C;
        int P=D*100/300;
        String S=TS.getText();
        S_A.setText(S);
        if(A>=70 && B>=70 && C>=70){
            ca.setText("First Class");
            pa.setText(""+P);
            ta.setText(""+D);
        }else if(A>=60 && B>=60 && C>=60){
            ca.setText("Second Class");
            pa.setText(""+P);
            ta.setText(""+D);
        }else if(A>=33 && B>=33 && C>=33){
            ca.setText("Pass Class");
            pa.setText(""+P);
            ta.setText(""+D);
        }else{
            ca.setText("You Are Faild IN Exams");
        }
    }
}