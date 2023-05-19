package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class CheckPackage extends JFrame {
    
    CheckPackage(){
        setBounds(550, 100, 900, 950);
        
        String[] package1 = {"GOLD PACKAGE", "6 Days and 7 Nights", "Airport Assistance", "Half Day City Tour", "Daily Buffet", "Soft Drinks Free", "Full Day 3 Islands Cruise", "English Speaking Guide", "BOOK NOW", "SUMMER SPECIALS", "RS 12000/-", "package1.jpg"};
        String[] package2 = {"SILVER PACKAGE", "5 Days and 6 Nights", "Toll Free", "Entrance Free Tickets", "Meet and Greet at Airport", "Welcome Drinks on Arrival", "Night Safari", "Cruise with Dinner", "BOOK NOW", "WINTER SPECIALS", "RS 24000/-", "package2.jpg"};
        String[] package3 = {"BRONZE PACKAGE", "6 Days and 5 Nights", "Return Airfare", "Free Clubbing", "Horse Riding", "Hard Drinks Free", "Daily Buffer", "BBQ Dinner", "BOOK NOW", "WINTER SPECIALS", "RS 32000/-", "package3.jpg"};
        
        JTabbedPane tab = new JTabbedPane();
        JPanel p1 = createPackage(package1);
        tab.addTab("Package 1", null, p1);
        
        JPanel p2 = createPackage(package2);
        tab.addTab("Package 2", null, p2);
        
        JPanel p3 = createPackage(package3);
        tab.addTab("Package 3", null, p3);
        
        add(tab);
        
        
        setVisible(true);
    }
    
    public JPanel createPackage(String[] pack){
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel(pack[0]);
        l1.setBounds(50, 5, 300, 65);
        l1.setForeground(Color.YELLOW);
        l1.setFont(new Font("TAHOMA", Font.BOLD, 30));
        p1.add(l1);
        
        JLabel l2 = new JLabel(pack[1]);
        l2.setBounds(30, 60, 300, 65);
        l2.setForeground(Color.RED);
        l2.setFont(new Font("TAHOMA", Font.BOLD, 15));
        p1.add(l2);
        
        JLabel l3 = new JLabel(pack[2]);
        l3.setBounds(30, 110, 300, 65);
        l3.setForeground(Color.BLUE);
        l3.setFont(new Font("TAHOMA", Font.BOLD, 15));
        p1.add(l3);
        
        JLabel l4 = new JLabel(pack[3]);
        l4.setBounds(30, 160, 300, 65);
        l4.setForeground(Color.RED);
        l4.setFont(new Font("TAHOMA", Font.BOLD, 15));
        p1.add(l4);
        
        JLabel l5 = new JLabel(pack[4]);
        l5.setBounds(30, 210, 300, 65);
        l5.setForeground(Color.BLUE);
        l5.setFont(new Font("TAHOMA", Font.BOLD, 15));
        p1.add(l5);
        
        JLabel l6 = new JLabel(pack[5]);
        l6.setBounds(30, 260, 300, 65);
        l6.setForeground(Color.RED);
        l6.setFont(new Font("TAHOMA", Font.BOLD, 15));
        p1.add(l6);
        
        JLabel l7 = new JLabel(pack[6]);
        l7.setBounds(30, 310, 300, 65);
        l7.setForeground(Color.BLUE);
        l7.setFont(new Font("TAHOMA", Font.BOLD, 15));
        p1.add(l7);
        
        JLabel l8 = new JLabel(pack[7]);
        l8.setBounds(30, 360, 300, 65);
        l8.setForeground(Color.RED);
        l8.setFont(new Font("TAHOMA", Font.BOLD, 15));
        p1.add(l8);
        
        JLabel l9 = new JLabel(pack[8]);
        l9.setBounds(100, 400, 300, 65);
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("TAHOMA", Font.BOLD, 30));
        p1.add(l9);
        
        JLabel l10 = new JLabel(pack[9]);
        l10.setBounds(100, 450, 300, 65);
        l10.setForeground(Color.MAGENTA);
        l10.setFont(new Font("TAHOMA", Font.BOLD, 30));
        p1.add(l10);
        
        JLabel l11 = new JLabel(pack[10]);
        l11.setBounds(500, 450, 300, 65);
        l11.setForeground(Color.CYAN);
        l11.setFont(new Font("TAHOMA", Font.BOLD, 30));
        p1.add(l11);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/" +pack[11]));
        Image i2;
        i2 = i1.getImage().getScaledInstance(600, 450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(360, 20 , 480, 440);
        p1.add(l12);
        
        return p1;
    }
    
    public static void main(String[] args){
        new CheckPackage();
    }
    
}
