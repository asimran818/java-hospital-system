/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projectsql;
import java.sql.*;

/**
 *
 * @author admin
 */
public class ProvideConnection {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectsql","root","87654");
            return con;
            
        }
        catch(Exception e){
            return null;
        }
    }
    
}
