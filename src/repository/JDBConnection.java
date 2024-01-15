package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBConnection {

    static Connection con;
       
    public static Connection getConnection() {
        if(con==null){
         try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/university", "root", "kiara2003");
            System.out.println("Successs");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       }
        return con;
    }
    //for testing
     public static  void setConnection(Connection mockcon) {
        con = mockcon;
    }

}
