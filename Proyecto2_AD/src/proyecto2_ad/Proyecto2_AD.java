/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2_ad;

import controller.MainController;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import view.MainJFrame;

public class Proyecto2_AD {

    private static Connection conexion;
    
    public static void main(String[] args){
        try {
            abrirBaseDatos();
            MainJFrame main = new MainJFrame();
            MainController mc = new MainController(main);
            main.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            System.getLogger(Proyecto2_AD.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
        
        
    }
    
    public static void abrirBaseDatos() throws ClassNotFoundException, SQLException{
    
    Class.forName("com.mysql.cj.jdbc.Driver");
    OperacionsDB.abrirConexion("jdbc:mysql://localhost:3306/world");}

}
