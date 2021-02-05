import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="bio.class" height=500 width="600">
</applet>
*/
public class bio extends JApplet implements ActionListener{
     JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20;
     JTextField t1,t2;
     JTextArea A1;
     JCheckBox cb1,cb2,cb3,cb4;
     JRadioButton r1,r2;
     JComboBox c1,c2,c3;
     JButton b1;
     ButtonGroup b;
     JPanel p1,p2;

        public void init(){     
            setLayout(new GridLayout(15,2));
            l1=new JLabel("Name");
            l2=new JLabel("Address");
            l3=new JLabel("Contact");
            l4=new JLabel("Gender");
            l5=new JLabel("Hobby");
            l6=new JLabel("City");
            l7=new JLabel("State");
            l8=new JLabel("Countery");
            l9=new JLabel("           ");
            l11=new JLabel("           ");
            l12=new JLabel("           ");
            l10=new JLabel("           ");
            l13=new JLabel("           ");
            l14=new JLabel("           ");
            l15=new JLabel("           ");
            l16=new JLabel("           ");
            l17=new JLabel("           ");
            l18=new JLabel("           ");
            l19=new JLabel("           ");
            l20=new JLabel("           ");
            t1=new JTextField(20);
            t2=new JTextField(20);
            p1=new JPanel();
            p2=new JPanel();
            A1= new JTextArea(2,10);

            r1=new JRadioButton("Male");
            r2=new JRadioButton("Female");
            String s1[] = { "Jalpaiguri", "Mumbai", "Noida", "Kolkata", "New Delhi","Surendranagr" }; 
            c1=new JComboBox(s1);
            String s2[] = {"Gujrat","Dheli","West-bangal"}; 
            c2=new JComboBox(s2);
            String s3[] = {"india"}; 
            c3=new JComboBox(s3);
            p1.setLayout(new FlowLayout(FlowLayout.LEFT));
            b1=new JButton("Click");
            b=new ButtonGroup();
            
            p2.setLayout(new FlowLayout(FlowLayout.LEFT));
            cb1= new JCheckBox("Reading");
            cb2= new JCheckBox("Swimming");
            cb3=new JCheckBox("Dansing");
            cb4= new JCheckBox("Travaling");

            add(l1);
            add(t1);
            add(l2);
            add(A1);
            add(l3);
            add(t2);
            add(l4);
            b.add(r1);
            b.add(r2);
            p1.add(r1);
            p1.add(r2);
            add(p1);
            add(l5);
            p2.add(cb1);
            p2.add(cb2);
            p2.add(cb3);
            p2.add(cb4);
            add(p2);
            add(l6);
            add(c1);
            add(l7);
            add(c2);
            add(l8);
            add(c3);
            add(b1);
            add(l9);
            add(l10);
            add(l14);
            add(l11);
            add(l15);
            add(l12);
            add(l16);
            add(l13);
            add(l17);
            add(l18);
            add(l19);
            add(l20);
            b1.addActionListener(this);
        }

    public void actionPerformed(ActionEvent e){
        String N=t1.getText();
        String A=t2.getText();
        String C=A1.getText();
        String S=" ";
        l10.setText("Your Name is "+N);
        l11.setText("Your Address is "+C);
        l12.setText("Your Contact no is ==> "+A);
        if(r1.isSelected()){
            l13.setText("You Are Male");
        }else{
            l13.setText("You Are FeMale");
        }
        if(cb1.isSelected()){
            S=S+"  "+cb1.getText();
        }
        if(cb3.isSelected()){
            S=S+"  "+cb2.getText();
        }
        if(cb4.isSelected()){
            S=S+"  "+cb3.getText();
        }
        if(cb2.isSelected()){
            S=S+"  "+cb4.getText();
        }
        l18.setText("Your Hobbies are "+S);
        String T =c1.getSelectedItem().toString()+","+c2.getSelectedItem().toString()+","+c1.getSelectedItem().toString();
        l20.setText(T);
    }
    }