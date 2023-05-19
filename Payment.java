package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Payment extends JFrame implements ActionListener{
    JButton pay, back;
    
    Payment(){
       setBounds(500, 50, 900, 700);
        setLayout(null);
        setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(900, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0 , 900, 600);
        add(image);
        
        pay = new JButton("Pay");
        pay.setBounds(620, 10, 100, 45);
        pay.addActionListener(this);
        image.add(pay);
        
        back = new JButton("Back");
        back.setBounds(750, 10, 100, 45);
        back.addActionListener(this);
        image.add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== pay)   {
               setVisible(false);
               new Paytm();
        }else{
         setVisible(false);        
        }
    }
    public static void main(String[] args){
        new Payment();
    
    }
}
