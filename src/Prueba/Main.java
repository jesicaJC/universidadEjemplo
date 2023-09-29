
package Prueba;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Vistas.MenuPrincipal;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.time.LocalDate;


public class Main {
     public static void main(String[] args) {
         
         MenuPrincipal mp = new MenuPrincipal();
         mp.setVisible(true);
         mp.setLocationRelativeTo(null);        
//
//         
         
         
 //GUARDA ALUMNO    
//Alumno alumno1 = new Alumno(12333, "Lopes", "Laura", LocalDate.of(2000, 10, 15), true);
//AlumnoData ald = new AlumnoData();//Guarda en la base
//ald.guardarAlumno(alumno1); 

//BUSCAR POR ID
//AlumnoData ald = new AlumnoData();//Guarda en la base
//Alumno alumnoEncontrado= ald.buscarAlumno(4); 
// if(alumnoEncontrado != null){
//System.out.println("DNI "+ alumnoEncontrado.getDni());
//System.out.println("Apellido "+ alumnoEncontrado.getApellido());
//System.out.println("Nombre "+ alumnoEncontrado.getNombre());
//}

//BUSCAR POR DNI     
//AlumnoData ald = new AlumnoData();//Guarda en la base
//Alumno alumnoEncontrado= ald.buscarAlumnoPorDni(45852158); 
// if(alumnoEncontrado != null){
//System.out.println("DNI "+ alumnoEncontrado.getDni());
//System.out.println("Apellido "+ alumnoEncontrado.getApellido());
//System.out.println("Nombre "+ alumnoEncontrado.getNombre());
//}

//LISTAR ALUMNOS
//AlumnoData ald = new AlumnoData();//Guarda en la base
//for(Alumno alumno:ald.listarAlumnos()){ 
////    System.out.println(alumno.getDni());
////    System.out.println(alumno.getApellido());
////    System.out.println(alumno.getNombre());
//    System.out.println(alumno.toString());
//}

// MODIFICA ALUMNO
//Alumno alumno1 = new Alumno(4,12333, "Lopes", "Ana Laura", LocalDate.of(2000, 10, 15), true);
//AlumnoData ald = new AlumnoData();//Guarda en la base
//ald.modificarAlumno(alumno1); 

//ELIMINA ALUMNO
//Alumno alumno1 = new Alumno(12333, "Lopes", "Laura", LocalDate.of(2000, 10, 15), true);
//AlumnoData ald = new AlumnoData();//Guarda en la base
//ald.eliminarAlumno(4); 

//--------------------------------------------------------------------

 //GUARDA MATERIA    
//Materia materia = new Materia("Biologia", 5, true);
//MateriaData madata = new MateriaData();//Guarda en la base
//madata.guardarMateria(materia);

//BUSCAR MATERIA POR ID
//MateriaData madata = new MateriaData();//Guarda en la base
//Materia materiaEncontrado= madata.buscarMateria(3); 
// if(materiaEncontrado != null){
//System.out.println("Materia "+ materiaEncontrado.getNombre());
//System.out.println("Año "+ materiaEncontrado.getAnioMateria());
//System.out.println("Estado "+ materiaEncontrado.isEstado());
//}

// MODIFICA MATERIA
//Materia materia = new Materia(1,"Matematica 2",1 , true);;
//MateriaData madata = new MateriaData();//Guarda en la base;
//madata.modificarMateria(materia);

//ELIMINA MATERIA
//Materia materia = new Materia();
//         MateriaData madata = new MateriaData();
//         madata.eliminarMateria(6);


//LISTAR MATERIAS
//MateriaData madata = new MateriaData();//Guarda en la base
//for(Materia mat:madata.listarMaterias()){
//    System.out.println("ID: "+mat.getIdMateria());
//    System.out.println("Materia: "+mat.getNombre());
//    System.out.println("Año: "+mat.getAnioMateria());
//    
//}

//--------------------------------------------------------------------
// //GUARDAR INSCRIPCION
// AlumnoData ald = new AlumnoData();
// MateriaData mD1 = new MateriaData();
// InscripcionData inData = new InscripcionData();
// Alumno aluTazo = ald.buscarAlumno(1);//tazo
//// Materia matemat = mD1.buscarMateria(1); //MATEMATICA
// Materia liter = mD1.buscarMateria(2); //LITERATURA
//// Inscripcion insc = new Inscripcion(aluTazo,matemat,9);
// Inscripcion insc = new Inscripcion(aluTazo,liter,4);
// inData.guardarInscripcion(insc);

//OBTENER INSCRIPCIONES
//InscripcionData inData = new InscripcionData();
//Inscripcion inscripcion = new Inscripcion();
//     for(Inscripcion inscrip : inData.obtenerInscripciones()){
//      System.out.println("id " + inscrip.getIdInscripcion());
//      System.out.println("apellido "+ inscrip.getAlumno().getApellido());
//      System.out.println("Materia "+ inscrip.getMateria().getNombre());
////         System.out.println("Nota "+inscrip.getNota());
//}


////OBTENER INSCRIPCIONES POR ALUMNO
//InscripcionData inData = new InscripcionData();
//Inscripcion inscripcion = new Inscripcion();
//     for(Inscripcion inscrip : inData.obtenerInscripcionesPorAlumno(6)){
//      System.out.println("id " + inscrip.getIdInscripcion());
//      System.out.println("apellido "+ inscrip.getAlumno().getApellido());
//      System.out.println("Materia "+ inscrip.getMateria().getNombre());
//}

//OBTENER MATERIAS CURSADAS
//InscripcionData inData = new InscripcionData();
//Inscripcion inscripcion = new Inscripcion();
//for(Materia mate:inData.obtenerMateriasCursadas(1)){
//System.out.println("Nombre "+mate.getNombre());
//}

//OBTENER MATERIA NO CURSADAS
//InscripcionData inData = new InscripcionData();
//Inscripcion inscripcion = new Inscripcion();
//for(Materia mate:inData.obtenerMateriasNOCursadas(1)){
//System.out.println("Nombre "+mate.getNombre());
//
//}

//BORRAR ALUMNO
// AlumnoData ald = new AlumnoData();
// MateriaData mD1 = new MateriaData();
// InscripcionData inData = new InscripcionData();
// Alumno aluTazo = ald.buscarAlumno(1);//tazo
// Materia matemat = mD1.buscarMateria(1); //MATEMATICA
// Materia liter = mD1.buscarMateria(2); //LITERATURA
//// Inscripcion insc = new Inscripcion(aluTazo,matemat,9);
//inData.borrarInscripcionMateriaAlumno(1, 1);

//ACTUALIZAR NOTA
// AlumnoData ald = new AlumnoData();
// MateriaData mD1 = new MateriaData();
// InscripcionData inData = new InscripcionData();
// 
// Alumno aluTazo = ald.buscarAlumno(1);//tazo
// Materia liter = mD1.buscarMateria(2); //LITERATURA
// Inscripcion insc = new Inscripcion(aluTazo,liter,4);
// inData.actualizarNota(1, 2, 10);

//OBTENER ALUMNOS POR MATERIA





























    }
        
}
