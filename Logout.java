package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Logout extends JFrame implements ActionListener {

    JButton logout, cancel;
    JLabel message;

    Logout() {
        setSize(400, 200);
        setLocation(500, 300);
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);

        message = new JLabel("Are you sure you want to log out?");
        message.setBounds(50, 30, 300, 25);
        message.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        add(message);

        logout = new JButton("Logout");
        logout.setBounds(50, 80, 100, 30);
        logout.setBackground(new Color(25, 26, 27));
        logout.setForeground(Color.ORANGE);
        logout.addActionListener(this);
        add(logout);

        cancel = new JButton("Cancel");
        cancel.setBounds(200, 80, 100, 30);
        cancel.setBackground(new Color(28, 29, 30));
        cancel.setForeground(Color.ORANGE);
        cancel.addActionListener(this);
        add(cancel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == logout) {
            // Close all other windows
            for (Window window : Window.getWindows()) {
                if (window != this) {
                    window.dispose();
                }
            }
            setVisible(false);
            new Login();
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        Logout l = new Logout();
    }

}
