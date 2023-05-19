package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
    
    String username;
    
    JButton addPersonalDetails, viewPersonalDetails, updatePersonalDetails, checkpackage, bookpackage;
    JButton viewpackage, viewhotels, destinations, bookhotels, viewbookedhotel, payment;
    JButton calculator,notepad, about, deletePersonalDetails, logout;
    
    Dashboard(String username){
        this.username= username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);//setbounds
       setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0 , 70, 70);
        p1.add(icon);
        
        JLabel heading = new JLabel ("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE) ;
        heading.setFont(new Font("TAHOMA", Font.BOLD, 35));
        p1.add(heading);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 105));
        p2.setBounds(0, 65, 300, 900);
        add(p2);
        
        
        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0, 0, 300, 50);
        addPersonalDetails.setBackground(new Color(0, 0, 100));
        addPersonalDetails.setForeground(Color.YELLOW);
        addPersonalDetails.setFont(new Font("TAHOMA", Font.PLAIN, 15));
        addPersonalDetails.setMargin(new Insets(0, 0, 0, 130));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0, 40, 300, 50);
        updatePersonalDetails.setBackground(new Color(0, 0, 100));
        updatePersonalDetails.setForeground(Color.YELLOW);
        updatePersonalDetails.setFont(new Font("TAHOMA", Font.PLAIN, 15));
        updatePersonalDetails.setMargin(new Insets(0, 0, 0, 105));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
        viewPersonalDetails = new JButton("View Personal Details");
        viewPersonalDetails.setBounds(0, 80, 300, 50);
        viewPersonalDetails.setBackground(new Color(0, 0, 100));
        viewPersonalDetails.setForeground(Color.YELLOW);
        viewPersonalDetails.setFont(new Font("TAHOMA", Font.PLAIN, 15));
        viewPersonalDetails.setMargin(new Insets(0, 0, 0, 125));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 120, 300, 50);
        deletePersonalDetails.setBackground(new Color(0, 0, 100));
        deletePersonalDetails.setForeground(Color.YELLOW);
        deletePersonalDetails.setFont(new Font("TAHOMA", Font.PLAIN, 15));
        deletePersonalDetails.setMargin(new Insets(0, 0, 0, 112));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
        
        checkpackage = new JButton("Check Package");
        checkpackage.setBounds(0, 160, 300, 50);
        checkpackage.setBackground(new Color(0, 0, 100));
        checkpackage.setForeground(Color.YELLOW);
        checkpackage.setFont(new Font("TAHOMA", Font.PLAIN, 15));
        checkpackage.setMargin(new Insets(0, 0, 0, 160));
        checkpackage.addActionListener(this);
        p2.add(checkpackage);
        
        bookpackage = new JButton("Book Package");
        bookpackage.setBounds(0, 200, 300, 50);
        bookpackage.setBackground(new Color(0, 0, 100));
        bookpackage.setForeground(Color.YELLOW);
        bookpackage.setFont(new Font("TAHOMA", Font.PLAIN, 15));
        bookpackage.setMargin(new Insets(0, 0, 0, 162));
        bookpackage.addActionListener(this);
        p2.add(bookpackage); 
        
        viewpackage = new JButton("View Package");
        viewpackage.setBounds(0, 240, 300, 50);
        viewpackage.setBackground(new Color(0, 0, 100));
        viewpackage.setForeground(Color.YELLOW);
        viewpackage.setFont(new Font("TAHOMA", Font.PLAIN, 15));
        viewpackage.setMargin(new Insets(0, 0, 0, 162));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);
        
        viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0, 280, 300, 50);
        viewhotels.setBackground(new Color(0, 0, 100));
        viewhotels.setForeground(Color.YELLOW);
        viewhotels.setFont(new Font("TAHOMA", Font.PLAIN, 15));
        viewhotels.setMargin(new Insets(0, 0, 0, 175));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        bookhotels = new JButton("Book Hotels");
        bookhotels.setBounds(0, 320, 300, 50);
        bookhotels.setBackground(new Color(0, 0, 100));
        bookhotels.setForeground(Color.YELLOW);
        bookhotels.setFont(new Font("TAHOMA", Font.PLAIN, 15));
        bookhotels.setMargin(new Insets(0, 0, 0, 175));
        bookhotels.addActionListener(this);
        p2.add(bookhotels);
        
        viewbookedhotel = new JButton("View Booked Hotels");
        viewbookedhotel.setBounds(0, 360, 300, 50);
        viewbookedhotel.setBackground(new Color(0, 0, 100));
        viewbookedhotel.setForeground(Color.YELLOW);
        viewbookedhotel.setFont(new Font("TAHOMA", Font.PLAIN, 15));
        viewbookedhotel.setMargin(new Insets(0, 0, 0, 120));
        viewbookedhotel.addActionListener(this);
        p2.add(viewbookedhotel);
        
        destinations = new JButton("Destinations");
        destinations.setBounds(0, 400, 300, 50);
        destinations.setBackground(new Color(0, 0, 100));
        destinations.setForeground(Color.YELLOW);
        destinations.setFont(new Font("TAHOMA", Font.PLAIN, 15));
        destinations.setMargin(new Insets(0, 0, 0, 175));
        destinations.addActionListener(this);
        p2.add(destinations);
        
        payment = new JButton("Payement");
        payment.setBounds(0, 440, 300, 50);
        payment.setBackground(new Color(0, 0, 100));
        payment.setForeground(Color.YELLOW);
        payment.setFont(new Font("TAHOMA", Font.PLAIN, 15));
        payment.setMargin(new Insets(0, 0, 0, 175));
        payment.addActionListener(this);
        p2.add(payment);
        
        calculator = new JButton("Calculator");
        calculator.setBounds(0, 480, 300, 50);
        calculator.setBackground(new Color(0, 0, 100));
        calculator.setForeground(Color.YELLOW);
        calculator.setFont(new Font("TAHOMA", Font.PLAIN, 15));
        calculator.setMargin(new Insets(0, 0, 0, 175));
        calculator.addActionListener(this);
        p2.add(calculator);
        
        notepad = new JButton("Notepad");
        notepad.setBounds(0, 520, 300, 50);
        notepad.setBackground(new Color(0, 0, 100));
        notepad.setForeground(Color.YELLOW);
        notepad.setFont(new Font("TAHOMA", Font.PLAIN, 15));
        notepad.setMargin(new Insets(0, 0, 0, 175));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        about = new JButton("About");
        about.setBounds(0, 560, 300, 50);
        about.setBackground(new Color(0, 0, 100));
        about.setForeground(Color.YELLOW);
        about.setFont(new Font("TAHOMA", Font.PLAIN, 15));
        about.setMargin(new Insets(0, 0, 0, 175));
        about.addActionListener(this);
        p2.add(about);
        
        logout = new JButton("Logout");
        logout.setBounds(0, 600, 300, 50);
        logout.setBackground(new Color(0, 0, 100));
        logout.setForeground(Color.YELLOW);
        logout.setFont(new Font("TAHOMA", Font.PLAIN, 15));
        logout.setMargin(new Insets(0, 0, 0, 175));
        logout.addActionListener(this);
        p2.add(logout);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(5, 0 , 1650, 1000);
        add(image);
        
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(400, 70, 1200, 80);
        text.setForeground(Color.BLACK);
        text.setFont(new Font("Raleway", Font.PLAIN, 60));
        image.add(text);
        
        
        
        setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae){
         if(ae.getSource()== addPersonalDetails)   {
             new AddCustomer(username);
         
         } else if (ae.getSource()== viewPersonalDetails){
              new ViewCustomer(username);
         
         }else if (ae.getSource()== updatePersonalDetails){
              new UpdateCustomer(username);
     }else if (ae.getSource()== checkpackage){
              new CheckPackage();
     }else if (ae.getSource()== bookpackage){
              new BookPackage(username);
     }else if (ae.getSource()== viewpackage){
              new ViewPackage(username);
     }else if (ae.getSource()== viewhotels){
              new CheckHotels();
     }else if (ae.getSource()== destinations){
              new Destinations();
     }else if (ae.getSource()== bookhotels){
              new BookHotel(username);
     }else if (ae.getSource()== viewbookedhotel){
              new ViewBookedHotel(username);
     }else if (ae.getSource()== payment){
              new Payment();
     }else if (ae.getSource()== calculator){
         try{
              Runtime.getRuntime().exec("calc.exe");
         }catch(Exception e){
               e.printStackTrace();
     }
     }else if (ae.getSource()== notepad){
                  try{
              Runtime.getRuntime().exec("notepad.exe");
         }catch(Exception e){
               e.printStackTrace();
     }
              
     }else if (ae.getSource()== about){
              new About();
     }else if (ae.getSource()== deletePersonalDetails){
              new DeleteDetails("");
     }else if( ae.getSource()== logout) {
            new Logout();
     }
    }
    
public static void main(String[] args){
   new Dashboard("");

}

}


