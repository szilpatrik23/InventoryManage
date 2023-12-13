package ims;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Database {
    public static Connection mycon(){
        Connection con;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/inventory","root","");
            return con;
            
        } catch (ClassNotFoundException | SQLException e) {
            
            System.out.println(e);
            return null;
        }
    }
            
    
}
