
package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JDBConnection {
   static Connection con;
    PreparedStatement pst;

    public static Connection getConnection()
    {
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost/university", "root","Suela2003!");
            System.out.println("Successs");
        }

        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
       return con; 
    }
    
}
