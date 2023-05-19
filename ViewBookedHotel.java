package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ViewBookedHotel extends JFrame implements ActionListener{
    JButton back;
    
      ViewBookedHotel(String username){
        setBounds(450, 200, 1000, 600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel("VIEW BOOK DETAILS");
        text.setBounds(60, 0, 300, 30);
        text.setFont(new Font("TAHOMA", Font.BOLD , 20));
        add(text);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30,50, 150, 25);
        add(lblusername);
        
        JLabel labelusername = new JLabel();
        labelusername.setBounds(220,50, 150, 25);
        add(labelusername);
      
        JLabel lblpackage = new JLabel("Hotel Name");
        lblpackage.setBounds(30,90, 150, 25);
        add(lblpackage);
        
        JLabel labelpackage = new JLabel();
        labelpackage.setBounds(220,90, 150, 25);
        add(labelpackage);
        
        JLabel lblpersons = new JLabel("Total Persons");
        lblpersons.setBounds(30,130, 150, 25);
        add(lblpersons);
        
        JLabel labelpersons = new JLabel();
        labelpersons.setBounds(220,130, 150, 25);
        add(labelpersons);
        
        JLabel lbldays = new JLabel("Total Days");
        lbldays.setBounds(30,170, 150, 25);
        add(lbldays);
        
        JLabel labeldays = new JLabel();
        labeldays.setBounds(220,170, 150, 25);
        add(labeldays);
        
        JLabel lblac = new JLabel("AC/ Non- AC");
        lblac.setBounds(30,210, 150, 25);
        add(lblac);
        
        JLabel labelac = new JLabel();
        labelac.setBounds(220,210, 150, 25);
        add(labelac);
        
        JLabel lblfood = new JLabel("Food Included");
        lblfood.setBounds(30,250, 150, 25);
        add(lblfood);
        
        JLabel labelfood = new JLabel();
        labelfood.setBounds(220,250, 150, 25);
        add(labelfood);
        
        JLabel lblid = new JLabel("ID");
        lblid.setBounds(30,290, 150, 25);
        add(lblid);
        
        JLabel labelid = new JLabel();
        labelid.setBounds(220,290, 150, 25);
        add(labelid);
        
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30,330, 150, 25);
        add(lblnumber);
        
        JLabel labelnumber= new JLabel();
        labelnumber.setBounds(220,330, 150, 25);
        add(labelnumber);
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(30,370, 150, 25);
        add(lblphone);
        
        JLabel labelphone = new JLabel();
        labelphone.setBounds(220,370, 150, 25);
        add(labelphone);
        
        JLabel lbltotal = new JLabel("Total");
        lbltotal.setBounds(30,410, 150, 25);
        add(lbltotal);
        
        JLabel labeltotal = new JLabel();
        labeltotal.setBounds(220,410, 150, 25);
        add(labeltotal);
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.ORANGE);
        back.setBounds(130, 480, 100, 45);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450, 40 , 530, 380);
        add(image);
        
        try {
            Conn conn = new Conn() ;
            String query = "select * from bookhotels where username = '"+username+"'";
            ResultSet rs = conn.s.executeQuery(query);
            while(rs.next()){
                  labelusername.setText(rs.getString("username"));
                  labelpackage.setText(rs.getString("name"));
                  labelpersons.setText(rs.getString("persons"));
                  labeldays.setText(rs.getString("days"));
                  labelac.setText(rs.getString("ac"));
                  labelfood.setText(rs.getString("food"));
                  labelid.setText(rs.getString("id"));
                  labelnumber.setText(rs.getString("number"));
                  labelphone.setText(rs.getString("phone"));
                  labeltotal.setText(rs.getString("total"));
                   
            }
            
            
        }catch(Exception e){
          e.printStackTrace();
        }
        
        
        setVisible(true);
        
      }
    
        public void actionPerformed(ActionEvent ae){
            setVisible(false);
        }
    
    public static void main(String[] args){
         new ViewBookedHotel("");
    }
}
