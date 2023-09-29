/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author rafa
 */
public class Conexion {
//    private String url,bd,usuario,pass,driver;
//    private Connection conexion;
//    
//    public Conexion(String bd){
//     this.bd=bd;
//     url ="jdbc:mariadb://localhost:3306/";
//       usuario="root";
//        pass="";
//        driver = "org.mariadb.jdbc.Driver";
//    }
//    
//      public Connection conectar(){
//          
//        try{
//            //Cargar Driver
//        Class.forName(driver);
//           //Conexion a la bd
//         conexion = DriverManager.getConnection(url+bd,"root","");
//         JOptionPane.showMessageDialog(null,"Conexión exitosa");
//        } catch (ClassNotFoundException ex){
//        JOptionPane.showMessageDialog(null,"Error al cargar el driver "+bd+ex.getMessage());
//        } catch (SQLException ex){
//        JOptionPane.showMessageDialog(null,"Error de conexión"+ex.getMessage());
//}
//        return conexion;
//}
//      
//      public void desconectar(){
//        try {
//            conexion.close();
//            JOptionPane.showMessageDialog(null, "La base de datos se ha desconectado");
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error");
//        }
} 
