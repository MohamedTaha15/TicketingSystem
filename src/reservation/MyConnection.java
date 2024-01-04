/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservation;

/*import sql connection libraries*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Hassan Mansour
 */
public class MyConnection {
    
     public static Connection getConnection(){
    
    Connection con= null;
    try {
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost/tickets1?serverTimezone=UTC","root","");
    }catch (ClassNotFoundException | SQLException ex) {
        System.out.println(ex.getMessage());
    }
    
    return con;
    }

    
}
