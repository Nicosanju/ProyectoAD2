/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2_ad;

import java.sql.Connection;
import java.sql.SQLException;

public class Proyecto2_AD {

    private static Connection conexion;
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        OperacionsDB.abrirConexion("jdbc:mysql://localhost:3306/spotify");

    }

}
