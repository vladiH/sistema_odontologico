/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author vladimir
 */
public class Conexion {
   private final static String bd = "odontologia";
   private final static String login = "root";
   private final static String password = "021300430@";
   private final static String url = "jdbc:mysql://localhost/"+bd;

    public Connection conexion() {
        try{
         Class.forName("com.mysql.jdbc.Driver");         
         Connection conn = DriverManager.getConnection(url,login,password);
         if (conn!=null){
            System.out.println("Conectado a la base de datos ["+bd+"]");
         }
         return conn;
      }catch(SQLException e){
         System.err.println(e.getMessage());
      }catch(ClassNotFoundException e){
         System.err.println(e.getMessage());
      }
      return null;
    }

}
