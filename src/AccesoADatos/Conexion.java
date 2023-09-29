/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rafa
 */
public class Conexion {
    //Declaración de constantes de tipo String con información que utilizaremos para la conexión
    private static final String URL = "jdbc:mariadb://localhost:3306/";
    private static final String DB = "universidadEjemplo";
    private static final String USUARIO = "root";
    private static final String PASS = "";
    private static Connection connection;

    private Conexion() {
    } //la constante “connection” representará a un objeto de tipo Connection a través del cual podremos enviar nuestras peticiones a la Base de Datos.

    public static Connection getConexion() { //NO o va devolver un objeto conexion de la clase. Va a devolver un objeto tipo Connection

        if (connection == null) { //es la primeras vez que vamos a invocar este metodo ahi se carga los drivrr de conexion.

            try {
                Class.forName("org.mariadb.jdbc.Driver");
                //Setup the connection with the DB
                connection = DriverManager.getConnection(URL + DB , USUARIO  , PASS);

                JOptionPane.showMessageDialog(null, "Conectado");
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la BD "+ex.getMessage());
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Drivers "+ex.getMessage());
            }       

        }
        return connection;
    }
}
