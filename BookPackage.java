package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class BookPackage extends JFrame implements ActionListener{
    
    Choice cpackage;
    JTextField tfpersons;
    JLabel labelusername, labelid, labelnumber, labelphone, labeltotal;
    JButton checkprice, bookpackage, back;
  
     String username;
    BookPackage(String username){
        this.username = username;
        
        setBounds(350, 200, 1100, 500);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        
        JLabel text = new JLabel("BOOK PACKAGE");
        text.setBounds(100, 10, 200, 30);
        text.setFont(new Font("TAHOMA", Font.BOLD , 20));
        add(text);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("TAHOMA", Font.PLAIN , 15));
        lblusername.setBounds(30,50, 150, 25);
        add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(220,50, 150, 25);
        add(labelusername);
      
        JLabel lblpackage = new JLabel("Select Package");
        lblpackage.setFont(new Font("TAHOMA", Font.PLAIN , 15));
        lblpackage.setBounds(30,110, 150, 25);
        add(lblpackage);
        
        cpackage = new Choice();
        cpackage.add("GOLD PACKAGE");
        cpackage.add("SILVER PACKAGE");
        cpackage.add("BRONZE PACKAGE");
        cpackage.setBounds(180, 112, 150, 15);
        add(cpackage);
        
        JLabel lblpersons = new JLabel("Total Persons");
        lblpersons.setFont(new Font("TAHOMA", Font.PLAIN , 15));
        lblpersons.setBounds(30,170, 150, 25);
        add(lblpersons);
        
        tfpersons = new JTextField("1");
        tfpersons.setBounds(180, 175, 200, 25);
        add(tfpersons);
        
        JLabel lblid = new JLabel("ID");
        lblid.setFont(new Font("TAHOMA", Font.PLAIN , 15));
        lblid.setBounds(30,230, 150, 25);
        add(lblid);
        
        labelid = new JLabel();
        labelid.setBounds(220,230, 150, 25);
        add(labelid);
        
        JLabel lblnumber = new JLabel("Number");
        lblid.setFont(new Font("TAHOMA", Font.PLAIN , 15));
        lblnumber.setBounds(30,290, 150, 25);
        add(lblnumber);
        
        labelnumber = new JLabel();
        labelnumber.setBounds(220,290, 150, 25);
        add(labelnumber);
        
        JLabel lblphone = new JLabel("Phone");
        lblid.setFont(new Font("TAHOMA", Font.PLAIN , 15));
        lblphone.setBounds(30,350, 150, 25);
        add(lblphone);
        
        labelphone = new JLabel();
        labelphone.setBounds(220,350, 150, 25);
        add(labelphone);
        
        JLabel lbltotal = new JLabel("Total Price");
        lbltotal.setFont(new Font("TAHOMA", Font.PLAIN , 15));
        lbltotal.setBounds(30,410, 150, 25);
        add(lbltotal);
        
        labeltotal = new JLabel();
        labeltotal.setBounds(220,410, 150, 25);
        add(labeltotal);
        
        try {
            Conn conn = new Conn() ;
            String query = "select * from customers where username = '"+username+"'";
            ResultSet rs = conn.s.executeQuery(query);
            while(rs.next()){
                  labelusername.setText(rs.getString("username"));
                  labelid.setText(rs.getString("id"));
                  labelnumber.setText(rs.getString("number"));
                  labelphone.setText(rs.getString("phone"));
             
            }
            
            
        }catch(Exception e){
          e.printStackTrace();
        }
        
       checkprice = new JButton("Check Price");
       checkprice.setBackground(Color.BLACK);
       checkprice.setForeground(Color.ORANGE);
       checkprice.setBounds(390, 410, 120, 25);
       checkprice.addActionListener(this);
       add(checkprice);
       
       bookpackage = new JButton("Book Package");
       bookpackage.setBackground(Color.BLACK);
       bookpackage.setForeground(Color.ORANGE);
       bookpackage.setBounds(590, 410, 120, 25);
       bookpackage.addActionListener(this);
       add(bookpackage);
       
       back = new JButton("Back");
       back.setBackground(Color.BLACK);
       back.setForeground(Color.ORANGE);
       back.setBounds(790, 410, 120, 25);
       back.addActionListener(this);
       add(back);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2;
        i2 = i1.getImage().getScaledInstance(600, 450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(500, 20 , 560, 350);
        add(l12);
        
        setVisible(true);
    
    }
    public void actionPerformed(ActionEvent ae){
    
    if(ae.getSource()==checkprice){
        String pack = cpackage.getSelectedItem();
        int cost = 0;
        if(pack.equals("GOLD PACKAGE")){
              cost+=12000;
        }else if(pack.equals("SILVER PACKAGE")){
              cost+=24000;
        }else{
              cost+=32000;
        }
        int persons = Integer.parseInt(tfpersons.getText());
        cost*=persons;
        labeltotal.setText("Rs " +cost);
    
    }else if(ae.getSource()==bookpackage){
        try{
            Conn c= new Conn();
            c.s.executeUpdate("insert into bookpackage values('"+labelusername.getText()+"', '"+cpackage.getSelectedItem()+"', '"+tfpersons.getText()+"', '"+labelid.getText()+"', '"+labelnumber.getText()+"', '"+labelphone.getText()+"', '"+labeltotal.getText()+"')");
            
            JOptionPane.showMessageDialog(null, "Package Booked Successfully");
            setVisible(false);
             
        }catch(Exception e){
             e.printStackTrace();
        }
    
    }else
        setVisible(false);
    
    }
    
    public static void main(String[] args){
      new BookPackage("");
    }
}
