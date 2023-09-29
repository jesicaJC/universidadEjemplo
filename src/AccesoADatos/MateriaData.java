/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author rafa
 */
public class MateriaData {
     private Connection con;

    //Constructor
    public MateriaData() {
        con = Conexion.getConexion();
    }

    //Métodos:
    public void guardarMateria(Materia materia) {
        String sql = "INSERT INTO materia (nombre, año,estado) VALUES (? ,?, ?)";
        try {
            //preparedStatement envian la setencia anterior
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            //Remplazo los ? por los datos del alumno que quiero enviar 
//            ps.setInt(1, materia.getIdMateria());
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria()); // Get codigo es para pedir el "idMateria" en la base de datos
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();//ejecuta
            ResultSet rs = ps.getGeneratedKeys();//Obtiene la clave,recibimos un resultset consulta
            if (rs.next()) {
                materia.setIdMateria(rs.getInt("idMateria"));
                JOptionPane.showMessageDialog(null, "Materia añadido con éxito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a Materia "+ ex.getMessage());
        }
    }
//
    public Materia buscarMateria(int id) {
        Materia materia = null;
        String sql = "SELECT nombre, año ,estado FROM materia WHERE idMateria = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("Año"));
               materia.setEstado(true);
            }else{
             JOptionPane.showMessageDialog(null, "No existe la Materia");
        }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a Materias"+ ex.getMessage());
            // Manejo de excepciones en caso de error.
//            ex.printStackTrace();
        }
        return materia;
    }
//
    public void modificarMateria(Materia materia) {
        String sql = "UPDATE materia SET  nombre = ?, año = ? WHERE idMateria = ?";
         PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
//            
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setInt(3, materia.getIdMateria());
//            ps.executeUpdate();
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia modificada Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La materia no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            // Manejo de excepciones en caso de error.
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia: " + ex.getMessage());
        }
    }
//
    public void eliminarMateria(int id) {
         String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";
//        String sql = "DELETE FROM materia WHERE idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
//            ps.executeUpdate();
             int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó la Materia");
            }
//            
            ps.close();
        } catch (SQLException ex) {
            // Manejo de excepciones en caso de error.
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }
    }
//
    public List<Materia> listarMaterias() {
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT idMateria, nombre, año FROM materia";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            // Manejo de excepciones en caso de error.
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materias: " + ex.getMessage());
        }
        return materias;
    }
}
