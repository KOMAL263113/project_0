package travel.management.system;

import javax.swing.*;
import java.awt.*;


public class Loading extends JFrame implements Runnable{
   
    Thread t;
    JProgressBar bar;
    String username;
    
    public void run(){
        try{
            for (int i = 1; i<= 101; i++){
                int max = bar.getMaximum();
                int value = bar.getValue();
                
                if(value<max){
                    bar.setValue(bar.getValue() +1);
                }else{
                    setVisible(true);
                    new Dashboard(username);
                }
                 Thread.sleep(50)  ;
            }
        }catch ( Exception e){
            e.printStackTrace();
        }
    }
    
    Loading(String username) {
        this.username = username;
        
        t= new Thread(this);
        
        setBounds(500, 200, 650, 400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text = new JLabel("Travel and Tourism Management");
        text.setBounds(50, 20, 600, 40);
        text.setForeground(Color.MAGENTA);
        text.setFont(new Font("TAHOMA", Font.BOLD, 35));
        add(text);
        
        bar = new JProgressBar();
        bar.setBounds(150, 100, 300, 35);
        bar.setStringPainted(true);
        add(bar);
        
        JLabel loading = new JLabel("Loading, Please Wait....");
        loading.setBounds(230, 140, 150, 30);
        loading.setForeground(Color.MAGENTA);
        loading.setFont(new Font("TAHOMA", Font.BOLD, 10));
        add(loading);
        
        JLabel lblusername = new JLabel("Welcome  "   + username);
        lblusername.setBounds(20, 310, 400, 40);
        lblusername.setForeground(Color.RED);
        lblusername.setFont(new Font("TAHOMA", Font.BOLD, 20));
        add(lblusername);
        
        t.start();
        
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new Loading("");
    }
    
    
}
