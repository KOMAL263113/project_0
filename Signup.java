package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener {
    JButton create, back;
    JTextField tfname, tfusername, tfpassword, tfanswer;
    Choice security;
    
        Signup() {
        setBounds(350, 200, 900, 360); // set location and size
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(120, 250, 250));
        p1.setBounds(0, 0, 500, 400);
        p1.setLayout(null);
        add(p1);

        JLabel lblusername = new JLabel("USERNAME");
        lblusername.setBounds(50, 20, 125, 25);
        lblusername.setFont(new Font("TAHOMA", Font.BOLD, 15));
        p1.add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(190, 20, 180, 25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);

        JLabel lblname = new JLabel("NAME");
        lblname.setBounds(50, 60, 125, 25);
        lblname.setFont(new Font("TAHOMA", Font.BOLD, 15));
        p1.add(lblname);

        tfname = new JTextField();
        tfname.setBounds(190, 60, 180, 25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);

        JLabel lblpassword = new JLabel("PASSWORD");
        lblpassword.setBounds(50, 100, 125, 25);
        lblpassword.setFont(new Font("TAHOMA", Font.BOLD, 15));
        p1.add(lblpassword);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(190, 100, 180, 25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);

        JLabel lblsecurity = new JLabel("SECURITY");
        lblsecurity.setBounds(50, 140, 125, 25);
        lblsecurity.setFont(new Font("TAHOMA", Font.BOLD, 15));
        p1.add(lblsecurity);

        security = new Choice();
        security.add("FAV ANIME");
        security.add("FAV PERSON");
        security.add("FAV CAR");
        security.setBounds(190, 140, 180, 25);
        p1.add(security);

        JLabel lblanswer = new JLabel("ANSWER");
        lblanswer.setBounds(50, 180, 125, 25);
        lblanswer.setFont(new Font("TAHOMA", Font.BOLD, 15));
        p1.add(lblanswer);

        tfanswer = new JTextField();
        tfanswer.setBounds(190, 180, 180, 25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);

        create = new JButton("Create");
        create.setBackground(Color.ORANGE);
        create.setForeground(new Color(27, 28, 29));
        create.setFont(new Font("SAN SERIF", Font.ITALIC, 15));
        create.setBounds(80, 250, 100, 30);
        create.addActionListener(this);
        p1.add(create);

        back = new JButton("Back");
        back.setBackground(Color.ORANGE);
        back.setForeground(new Color(27, 28, 29));
        back.setFont(new Font("SAN SERIF", Font.ITALIC, 15));
        back.setBounds(250, 250, 100, 30);
        back.addActionListener(this);
        p1.add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(560, 40, 250, 250);
        add(l2);
        
       

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == create) {
            String username = tfusername.getText();
            String name = tfname.getText();
            String password = tfpassword.getText();
            String question = security.getSelectedItem();
            String answer = tfanswer.getText();
            

    String query = "insert into accounts values('" + username + "','" + name + "','" + password + "', '" + question + "', '" + answer + "')";
         try{
             Conn c = new Conn();
           //4)executiong mysql queries
             c.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "Accont Created Successfully");
             setVisible(true);
             new Login();
         } catch (Exception e){
             e.printStackTrace();
         }
          
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Signup().setVisible(true);
    }
}