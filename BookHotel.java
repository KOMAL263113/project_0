package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class BookHotel extends JFrame implements ActionListener{
    
    Choice chotel, cac,cfood;
    JTextField tfpersons, tfdays;
    JLabel labelusername, labelid, labelnumber, labelphone, labeltotal;
    JButton checkprice, bookpackage, back;
  
     String username;
    BookHotel(String username){
        this.username = username;
        
        setBounds(350, 100, 1100, 700);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        
        JLabel text = new JLabel("BOOK HOTEL");
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
      
        JLabel lblpackage = new JLabel("Select Hotel");
        lblpackage.setFont(new Font("TAHOMA", Font.PLAIN , 15));
        lblpackage.setBounds(30,110, 150, 25);
        add(lblpackage);
        
        chotel = new Choice();
        chotel.setBounds(180, 112, 150, 15);
        add(chotel);
        
        
        try{
               Conn c = new Conn();
               ResultSet rs = c.s.executeQuery("select * from hotel");
               while(rs.next()){
                   chotel.add(rs.getString("name"));
               }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JLabel lblpersons = new JLabel("Total Persons");
        lblpersons.setFont(new Font("TAHOMA", Font.PLAIN , 15));
        lblpersons.setBounds(30,170, 150, 25);
        add(lblpersons);
        
        tfpersons = new JTextField("1");
        tfpersons.setBounds(180, 175, 200, 25);
        add(tfpersons);
        
        JLabel lbldays = new JLabel("No. of Days");
        lbldays.setFont(new Font("TAHOMA", Font.PLAIN , 15));
        lbldays.setBounds(30,230, 150, 25);
        add(lbldays);
        
        tfdays = new JTextField("1");
        tfdays.setBounds(180, 235, 200, 25);
        add(tfdays);
        
        JLabel lblac = new JLabel("AC/ Non-AC");
        lblac.setFont(new Font("TAHOMA", Font.PLAIN , 15));
        lblac.setBounds(30,290, 150, 25);
        add(lblac);
        
        cac = new Choice();
        cac.add("AC");
        cac.add("Non- AC");
        cac.setBounds(180, 295, 150, 15);
        add(cac);
        
        JLabel lblfood = new JLabel("Food Included");
        lblfood.setFont(new Font("TAHOMA", Font.PLAIN , 15));
        lblfood.setBounds(30,350, 150, 25);
        add(lblfood);
        
        cfood = new Choice();
        cfood.add("YES");
        cfood.add("NO");;
        cfood.setBounds(180, 355, 150, 15);
        add(cfood);
        
        JLabel lblid = new JLabel("ID");
        lblid.setFont(new Font("TAHOMA", Font.PLAIN , 15));
        lblid.setBounds(30,410, 150, 25);
        add(lblid);
        
        labelid = new JLabel();
        labelid.setBounds(220,415, 150, 25);
        add(labelid);
        
        JLabel lblnumber = new JLabel("Number");
        lblid.setFont(new Font("TAHOMA", Font.PLAIN , 15));
        lblnumber.setBounds(30,470, 150, 25);
        add(lblnumber);
        
        labelnumber = new JLabel();
        labelnumber.setBounds(220,475, 150, 25);
        add(labelnumber);
        
        JLabel lblphone = new JLabel("Phone");
        lblid.setFont(new Font("TAHOMA", Font.PLAIN , 15));
        lblphone.setBounds(30,530, 150, 25);
        add(lblphone);
        
        labelphone = new JLabel();
        labelphone.setBounds(220,535, 150, 25);
        add(labelphone);
        
        JLabel lbltotal = new JLabel("Total Price");
        lbltotal.setFont(new Font("TAHOMA", Font.PLAIN , 15));
        lbltotal.setBounds(30,590, 150, 25);
        add(lbltotal);
        
        labeltotal = new JLabel();
        labeltotal.setBounds(220,595, 150, 25);
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
       checkprice.setBounds(490, 580, 120, 25);
       checkprice.addActionListener(this);
       add(checkprice);
       
       bookpackage = new JButton("Book Hotel");
       bookpackage.setBackground(Color.BLACK);
       bookpackage.setForeground(Color.ORANGE);
       bookpackage.setBounds(690, 580, 120, 25);
       bookpackage.addActionListener(this);
       add(bookpackage);
       
       back = new JButton("Back");
       back.setBackground(Color.BLACK);
       back.setForeground(Color.ORANGE);
       back.setBounds(890, 580, 120, 25);
       back.addActionListener(this);
       add(back);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2;
        i2 = i1.getImage().getScaledInstance(600, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(500, 20 , 580, 500);
        add(l12);
        
        setVisible(true);
    
    }
    public void actionPerformed(ActionEvent ae){
    
    if(ae.getSource()==checkprice){
        try{
          Conn c= new Conn();
          ResultSet rs = c.s.executeQuery("select * from hotel where name ='"+chotel.getSelectedItem()+"'");
          while(rs.next()){
            int cost = Integer.parseInt(rs.getString("costperperson"));
            int ac = Integer.parseInt(rs.getString("acroom"));
            int food = Integer.parseInt(rs.getString("foodincluded"));
            
            int persons = Integer.parseInt(tfpersons.getText());
            int days = Integer.parseInt(tfdays.getText());
            
            String acselected = cac.getSelectedItem();
            String foodselected = cfood.getSelectedItem();
            
            if(persons * days > 0){
               int total = 0;
               total+= acselected.equals("AC") ? ac : 0;
               total+= foodselected.equals("YES") ? food :0;
               total+= cost;
               total = total* persons* days;
               labeltotal.setText("Rs "+total);
             } else{
                 JOptionPane.showMessageDialog(null, "Enter a valid number");
            }
           }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    
      }else if(ae.getSource()==bookpackage){
        try{
            Conn c= new Conn();
            c.s.executeUpdate("insert into bookhotels values('"+labelusername.getText()+"', '"+chotel.getSelectedItem()+"','"+tfpersons.getText()+"', '"+tfdays.getText()+"', '"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"','"+labelid.getText()+"', '"+labelnumber.getText()+"', '"+labelphone.getText()+"', '"+labeltotal.getText()+"')");
            
            JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
            setVisible(false);
             
        }catch(Exception e){
             e.printStackTrace();
        }
    
    }else
        setVisible(false);
    
    }
    
    public static void main(String[] args){
      new BookHotel("");
    }
}
