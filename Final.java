package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Final extends JFrame implements ActionListener{
    JButton signup, login;
    Final(){
        setBounds(380, 100, 870, 700);
        setLayout(null);
        setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel("WELCOME TO");
        l1.setBounds(150, 20, 600, 80);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("TAHOMA", Font.BOLD, 80));
        add(l1);
        
        JLabel l2 = new JLabel("YATRI");
        l2.setBounds(150, 200, 600, 80);
        l2.setForeground(Color.BLUE);
        l2.setFont(new Font("TAHOMA", Font.BOLD, 100));
        add(l2);
        
        JLabel l3 = new JLabel(".COM");
        l3.setBounds(150, 380, 600, 80);
        l3.setForeground(Color.RED);
        l3.setFont(new Font("TAHOMA", Font.BOLD, 80));
        add(l3);
        
        
        
        signup = new JButton("Signup");
        signup.setBounds(80, 600, 100, 25);
        signup.setBackground(new Color(0, 0, 100));
        signup.setForeground(Color.YELLOW);
        signup.setFont(new Font("TAHOMA", Font.PLAIN, 15));
        signup.addActionListener(this);
        add(signup);
        
         login = new JButton("Login");
        login.setBounds(680, 600, 100, 25);
        login.setBackground(new Color(0, 0, 100));
        login.setForeground(Color.YELLOW);
        login.setFont(new Font("TAHOMA", Font.PLAIN, 15));
        login.addActionListener(this);
        add(login);
    
           setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
         if(ae.getSource()== signup)   {
             new Signup();
         
         } else if (ae.getSource()== login){
              new Login();
         }
    }
   public static void main(String args[]){
        new Final();
   }
    
}
