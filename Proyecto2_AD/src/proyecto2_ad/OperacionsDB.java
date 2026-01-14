/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_ad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alumno
 */
public class OperacionsDB {
    
     private static Connection conexion;
     
     
     public static Connection abrirConexion(String url) throws SQLException{
     
          conexion = DriverManager.getConnection(url,"root","abc123.");
          return conexion;
         
    }
     
    public static void cerrarConexion(Connection conexion) throws SQLException{
    
        conexion.close();
        
    }
    
    
}
