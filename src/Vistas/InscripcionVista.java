    
package Vistas;

import entidades.*;
import AccesoADatos.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class InscripcionVista extends javax.swing.JInternalFrame {
private DefaultTableModel modelo = new DefaultTableModel();
AccesoADatos.MateriaData matedata = new AccesoADatos.MateriaData();
AccesoADatos.InscripcionData indata = new AccesoADatos.InscripcionData();
AccesoADatos.AlumnoData aludata = new AccesoADatos.AlumnoData();


    /**
     * Creates new form Inscripcion
     */
    public InscripcionVista() {
        initComponents();
        llenarCombo();
        armarCabecera();
    }

       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcAlumnos = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        butonMateriasNO = new javax.swing.JRadioButton();
        butonMateriasSI = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        butonAnular = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        butonInscribir = new javax.swing.JButton();

        setTitle("Manejo de Inscripciones");

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel1.setText("Formulario de Inscripcion");

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel2.setText("Alumno:");

        jcAlumnos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione alumno" }));
        jcAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAlumnosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel3.setText("Listado de Materias");

        butonMateriasNO.setText("Materias no Inscriptas");
        butonMateriasNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonMateriasNOActionPerformed(evt);
            }
        });

        butonMateriasSI.setText("Materia Inscriptas");
        butonMateriasSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonMateriasSIActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 204)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        butonAnular.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        butonAnular.setText("Anular Inscripción");
        butonAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonAnularActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        butonInscribir.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        butonInscribir.setText("Inscribir");
        butonInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonInscribirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(butonMateriasSI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butonMateriasNO)
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(butonInscribir)
                        .addGap(18, 18, 18)
                        .addComponent(butonAnular)
                        .addGap(27, 27, 27)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butonMateriasSI)
                    .addComponent(butonMateriasNO))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butonInscribir)
                    .addComponent(butonAnular)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jcAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAlumnosActionPerformed
                        
    }//GEN-LAST:event_jcAlumnosActionPerformed

    private void butonMateriasNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonMateriasNOActionPerformed
       
        borrarFilas();
        butonMateriasSI.setSelected(false);
        butonMateriasNO.setSelected(true);
        butonAnular.setEnabled(false);
        butonInscribir.setEnabled(true);
        llenarTabla();

        
        
    }//GEN-LAST:event_butonMateriasNOActionPerformed

    private void butonMateriasSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonMateriasSIActionPerformed
        // TODO add your handling code here:
       
        borrarFilas();
        butonMateriasSI.setSelected(true);
        butonMateriasNO.setSelected(false);
        butonAnular.setEnabled(true);
        butonInscribir.setEnabled(false);
        llenarTabla();

        
    }//GEN-LAST:event_butonMateriasSIActionPerformed

    private void butonInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonInscribirActionPerformed
        
        Alumno alumnoSeleccionado = (Alumno)jcAlumnos.getSelectedItem();
        
        int filasSelec=jTable1.getSelectedRow();
        if(filasSelec != -1){
            int idMateria = (Integer)modelo.getValueAt(filasSelec, 0);//pongo un integer porque quiero pasarlo de Object a entero
//           
            Materia mat = new Materia();
            mat.setIdMateria(idMateria);
           
            Inscripcion insc = new Inscripcion(alumnoSeleccionado, mat,0);
            indata.guardarInscripcion(insc);
        }else{
           JOptionPane.showMessageDialog(this, "Por favor seleccione una materia");
           
           
//           int filasSelec=jTableMaterias.getSelectedRow();//fila selleccionada
//        if(filasSelec != -1){//verificar si selecciono algo
//            Alumno alumnoSeleccionado = (Alumno)SeleccioneAlumno.getSelectedItem();
//            
//            int idMateria = (Integer)modelo.getValueAt(filasSelec, 0);//el id de la materia lo recupero de la tabla. 1parametro fila2parametro columna
//        //pongo un integer porque quiero pasarlo de Object a entero
//           String inombreMateria= (String)modelo.getValueAt(filasSelec, 1);
//           int anio= (Integer)modelo.getValueAt(filasSelec, 2);
//           
//            Materia mat = new Materia();
//            mat.setIdMateria(idMateria);
//           
//            Inscripcion insc = new Inscripcion(alumnoSeleccionado, mat,0);
//            indata.guardarInscripcion(insc);
//        }else{
//           JOptionPane.showMessageDialog(this, "Por favor seleccione una materia");
//        }
        }
    }//GEN-LAST:event_butonInscribirActionPerformed

    private void butonAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonAnularActionPerformed
        // TODO add your handling code here:
        Alumno alumnoSeleccionado = (Alumno)jcAlumnos.getSelectedItem();
        int filasSelec=jTable1.getSelectedRow();
        if(filasSelec != -1){
            int idM = (Integer)modelo.getValueAt(filasSelec, 0);
            indata.borrarInscripcionMateriaAlumno(alumnoSeleccionado.getIdAlumno(), idM);
            
        }else{
           JOptionPane.showMessageDialog(this, "Por favor seleccione una materia");
        }
    }//GEN-LAST:event_butonAnularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butonAnular;
    private javax.swing.JButton butonInscribir;
    private javax.swing.JRadioButton butonMateriasNO;
    private javax.swing.JRadioButton butonMateriasSI;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox jcAlumnos;
    // End of variables declaration//GEN-END:variables

    
public void llenarCombo(){
//Guarda en la base
    for(Alumno alu:aludata.listarAlumnos()){ //LISTAR ALUMNOS
        jcAlumnos.addItem(alu);
    }
}

//public void llenarTabla(){
//
//  for (Materia mat:indata.obtenerMateriasNOCursadas(alu.getIdAlumno())) {
//                 modelo.addRow(new Object []{ //Agrega una fila pero coo una fila de objetos
//                 mat.getIdMateria(),
//                 mat.getNombre(),
//                 mat.getAnioMateria(),
//                 
//                 });
//            
//        }
//}
private void llenarTabla(){
//       Exception in thread "AWT-EventQueue-0" java.lang.ClassCastException: java.lang.String cannot be cast to entidades.Alumno
                Alumno alumnoSeleccionado = (Alumno)jcAlumnos.getSelectedItem();
                
        if(butonMateriasNO.isSelected()){
           
            List<Materia> materias= indata.obtenerMateriasNOCursadas(alumnoSeleccionado.getIdAlumno());
            for(Materia m:materias){
                modelo.addRow(new Object[]{m.getIdMateria(),m.getNombre(),m.getAnioMateria()});
            }
        }else{
             
            List<Materia> materias= indata.obtenerMateriasCursadas(alumnoSeleccionado.getIdAlumno());
            for(Materia m:materias){
                modelo.addRow(new Object[]{m.getIdMateria(),m.getNombre(),m.getAnioMateria()});
            }
        }
    }
private void armarCabecera(){
    ArrayList<Object>titulo = new ArrayList();
 titulo.add("ID");
 titulo.add("Nombre");
 titulo.add("Año");
 for(Object tit:titulo){
 modelo.addColumn(tit);
 }
 jTable1.setModel(modelo);
 
  }

private void borrarFilas(){
  int filas=jTable1.getRowCount()-1;
  for(;filas>=0;filas--){
  modelo.removeRow(filas);
  }
}
}




