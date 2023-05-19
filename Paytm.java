package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Paytm extends JFrame implements ActionListener{
    
    Paytm(){
       setBounds(500, 200, 800, 600);
       
       JEditorPane pane = new JEditorPane();
       pane.setEditable(false);
       
       try{
            pane.setPage("https://paytm.com/rent-payment");
            
       }catch(Exception e){
          pane.setContentType("text/html");
          pane.setText("<html>Could Not Load, Error 404</html>");
       }
       JScrollPane sp = new JScrollPane(pane);
       getContentPane().add(sp);
       
       JButton back = new JButton("Back");
        back.setBounds(400, 10, 100, 45);
        back.addActionListener(this);
        pane.add(back);
       
       setVisible(true);
       
    }
    
    public void actionPerformed(ActionEvent e){
         setVisible(false);
         new Payment();
    }
    
    public static void main(String[] args){
        new Paytm();
    }
    
}
