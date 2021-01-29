import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="salary.class" height=300 width=300>
</applet>
*/ 
public class salary extends JApplet implements ActionListener{
    JButton abc;
    JLabel Eno,Ena,Esa,EMT,DA,DA_A,HRA,HRA_A,MA,MA_A,PF,PF_A,GS,GS_A,NS,NS_A;
    JTextField t1,t2,t3;
    public void init(){
        setLayout(new GridLayout (10,2));
        Eno = new JLabel ("Enter Employe Number ");
        Ena = new JLabel ("Enter Employe Name ");
        Esa = new JLabel ("Enter Employe Salary ");
        EMT = new JLabel ("                       ");
        DA = new JLabel ("DA ");
        DA_A = new JLabel ("                       ");
        HRA = new JLabel ("HRA");
        HRA_A = new JLabel ("                       ");
        MA = new JLabel ("MA ");
        MA_A = new JLabel ("                       ");
        PF = new JLabel ("PF ");
        PF_A = new JLabel ("                       ");
        GS = new JLabel ("Gross Salary ");
        GS_A = new JLabel ("                       ");
        NS = new JLabel ("Net Salary");
        NS_A= new JLabel ("                       ");
        abc =new JButton("click me");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);

        add(Eno);
        add(t1);
        add(Ena);
        add(t2);
        add(Esa);
        add(t3);
        add(abc);
        add(EMT);
        add(DA);
        add(DA_A);
        add(HRA);
        add(HRA_A);
        add(MA);
        add(MA_A);
        add(PF);
        add(PF_A);
        add(GS);
        add(GS_A);
        add(NS);
        add(NS_A);
        abc.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int Sal=Integer.parseInt(t3.getText());
        int D=5*Sal/100;
        DA_A.setText("DA ==> "+D);
        int D1=3*Sal/100;
        HRA_A.setText("HRA ==> "+D1);
        int D2=2*Sal/100;
        MA_A.setText("MA ==> "+D2);
        int D3=1*Sal/100;
        PF_A.setText("PF ==> "+D3);
        int GR_S=D+D1+D2+D3+Sal;
        GS_A.setText("Gross Salary ==> "+GR_S );
        int NS_S=GR_S-D3;
        NS_A.setText("Net Salary ==> " +NS_S);

    }
}