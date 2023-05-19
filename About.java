package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class About extends JFrame implements ActionListener{
    
    About(){
        setBounds(600, 200, 500, 550);
        setLayout(null);
        setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel("ABOUT");
        l1.setBounds(200, 20, 300, 65);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("TAHOMA", Font.BOLD, 30));
        add(l1);
        
        String s= s = "                                    About This Apllication          \n  "
                + "\nThe objective of the Travel and Tourism Management System"
                + "project is to develop a system that automates the processes "
                + "and activities of a travel and the purpose is to design a "
                + "system using which one can perform all operations related to "
                + "traveling.\n\n"
                + "This application will help in accessing the information related "
                + "to the travel to the particular destination with great ease. "
                + "The users can track the information related to their tours with "
                + "great ease through this application. The travel agency information "
                + "can also be obtained through this application.\n"
                + "Advantages of Project:"
                + "\nGives accurate information"
                + "\nSimplifies the manual work"
                + "\nIt minimizes the documentation related work"
                + "\nProvides up to date information"
                + "\nFriendly Environment by providing warning messages."
                + "\ntravelers details can be provided"
                + "\nbooking confirmation notification"
                + "\nCUSTOMER CARE NUMBER = 8280472866 or you can DIAL= 674-324567"
                + "\nIF ANY QUERIES FEEL FREE TO EMAIL US ON : yatri.com24@gmail.com"
                ;
        
        TextArea area = new TextArea(s, 10, 40, Scrollbar.VERTICAL );
        area.setEditable(false);
        area.setBounds(20, 100, 450, 300);
        add(area);
        
        JButton back = new JButton("Back");
        back.setBounds(350, 10, 90, 25);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
      setVisible(false)    ;
    }
    
    public static void main (String[] args){
        new About();
    }
    
}
