/*
 PRACTICA
 */
package AccesoADatos;

import entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
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
public class AlumnoData { //PRACTICA

    private Connection con = null; //CARGAR dRUVER Y ESTABLECER LA CONEXION CON LA BASE UNIVERSIDAD

    public AlumnoData() { //constructor va inicializar la variable con
        con = Conexion.getConexion();
        //getConexion es un metodo de la clase Conexion que va a cargar los driver y conectarse con la base
    }

    public void guardarAlumno(Alumno alumno) {
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            //preparedStatement envian la setencia anterior
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);//que me devuelva la lista de claves generadas
            //Remplazo los ? por los datos del alumno que quiero enviar 
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));//Date de sql, valueOf lo convierte a DATE
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();//ejecuta el preparedStatement armado anterior
            ResultSet rs = ps.getGeneratedKeys();//Obtiene la clave,recibimos un resultset consulta
            //ResultSet va a venir una especie de matriz con una sola columna(ID), con tantas filas como alumnados haya insertado
            //en este caso solo enviamos un solo alumno y va a tener 1 sola fila.
            if (rs.next()) {//
                alumno.setIdAlumno(rs.getInt("idAlumno"));//nos mandan por parametro un alumno con dni ,apellido etc, nosotros le devolvemos por referencia un ID
                //el ID lo saco del resultSet getInt y el numero de columna osea el numero del id
                JOptionPane.showMessageDialog(null, "Alumno añadido con éxito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se añadio el Alumno /Error al acceder a la tabla Alumno: " + ex.getMessage());
        }
    }

    public Alumno buscarAlumno(int id) {
        Alumno alumno = null;
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno: " + ex.getMessage());
        }
        return alumno;
    }

    public Alumno buscarAlumnoPorDni(int dni) {
        Alumno alumno = null;
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno: " + ex.getMessage());
        }
        return alumno;
    }

    public List<Alumno> listarAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM alumno WHERE estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                alumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno: " + ex.getMessage());
        }
        return alumnos;
    }

    public void modificarAlumno(Alumno alumno) {
        String sql = "UPDATE alumno SET dni = ?, apellido = ?, nombre = ?, fechaNacimiento = ? WHERE idAlumno = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));//valueOf lo conviete a Date
            ps.setInt(5, alumno.getIdAlumno());
            int exito = ps.executeUpdate();//execute devuelve en un entero con la cantidad de filas afectadas
            if (exito == 1) { //va a devolver 1 porque el id es unico
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El alumno no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno: " + ex.getMessage());
        }
    }

    public void eliminarAlumno(int id) {
        try {
            String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó el alumno.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno");
        }
    }

    

    

    
    }

    
    



