/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;

/**
 *
 * @author hakay
 */
public class Database {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        String url="jdbc:mysql://localhost:3306/students";
        String uname="root";
        String pass="root";
        String Query="select *from results";
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=(Connection) DriverManager.getConnection(url,uname,pass);
       Statement st=(Statement) con.createStatement();
       ResultSet rs=(ResultSet) st.executeQuery(Query);
       rs.next();
       String name=rs.getString("student");
       
       System.out.print(name);
       st.close();
       con.close();
    }
    
}
