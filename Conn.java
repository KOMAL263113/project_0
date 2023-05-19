package travel.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    Conn(){
        //jdbc
        //to connect wuth dtabase
        //5 steps connectivity
        //1)register the driver(mysql-initialise the class-its an external entity so exceptional handling)
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2)creating the connection string
        c = DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem", "root", "komalkiran3102");
            //3)creating the statement
            s=c.createStatement();
            //4)executing mysql queries
    } catch(Exception e) {
        e.printStackTrace();
    }
    
}
}