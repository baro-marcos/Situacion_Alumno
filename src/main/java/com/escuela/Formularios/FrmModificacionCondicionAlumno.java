/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.escuela.Formularios;

import com.escuela.DAOs.DaoCondicionAlumnoMateria;
import com.escuela.DAOs.DaoMateria;
import com.escuela.DTOs.DTOcondicionAlumnoMateria;
import com.escuela.Entidades.CondicionAlumnoMateria;
import com.escuela.Entidades.Materia;
import com.escuela.Utilidades.Conexion;
import com.escuela.Utilidades.Utilidades;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Marcos Baró
 */
public class FrmModificacionCondicionAlumno extends javax.swing.JDialog {
    
    private Integer idCondicionAlumnoMateria;
    
    DaoCondicionAlumnoMateria daoCondicionAlumnoMateria;
    DaoMateria daoMateria;
    
    DefaultComboBoxModel<String> modeloComboBoxMateria = new DefaultComboBoxModel<>();

    /**
     * Creates new form FrmModificacionCondicionAlumno
     */
    public FrmModificacionCondicionAlumno(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
    }

    FrmModificacionCondicionAlumno(Integer idCondicionAlumnoMateria) {
        
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        comboBoxMateria.setModel(modeloComboBoxMateria);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.idCondicionAlumnoMateria = idCondicionAlumnoMateria;
        inicializar();
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDNI = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        lblMateria = new javax.swing.JLabel();
        comboBoxMateria = new javax.swing.JComboBox<>();
        txtIdCarrera = new javax.swing.JTextField();
        txtIdMateria = new javax.swing.JTextField();
        lblSituacion = new javax.swing.JLabel();
        comboBoxSituacion = new javax.swing.JComboBox<>();
        txtIdCondicionAlumnoMateria = new javax.swing.JTextField();
        lblCarrera = new javax.swing.JLabel();
        txtNombreCarrera = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificación Situación Alumno Materia");

        lblDNI.setText("DNI:");

        lblMateria.setText("Materia:");

        comboBoxMateria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxMateriaItemStateChanged(evt);
            }
        });

        lblSituacion.setText("Situación:");

        comboBoxSituacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "APROBADO", "LIBRE", "REGULAR", "NO CURSO" }));

        lblCarrera.setText("Carrera:");

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblMateria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                        .addComponent(lblCarrera, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtIdCondicionAlumnoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtNombreCarrera)
                                        .addComponent(comboBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboBoxSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDNI)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdCondicionAlumnoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarrera)
                    .addComponent(txtNombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMateria)
                    .addComponent(comboBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxMateriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxMateriaItemStateChanged

        Conexion con = new Conexion();
        
        txtIdMateria.setText("");

        try {

            String materia = comboBoxMateria.getSelectedItem() != null ? comboBoxMateria.getSelectedItem().toString() : null;

            if (materia == null || materia.equals("--")) {

                txtIdMateria.setText("");

            } else {

                Materia materiaSeleccionada = daoMateria.obtenerDatosMateria(materia, con.getConexion());

                if (materiaSeleccionada != null) {

                    txtIdMateria.setText(String.valueOf(materiaSeleccionada.getIdMateria()));

                } else {

                    if (modeloComboBoxMateria.getSize() > 0) {
                        comboBoxMateria.setSelectedIndex(0);
                   }
                    
                    txtIdMateria.setText("");

                }

            }

        } catch (Exception e) {

            Utilidades.msg(this, "Se produjo un error en la selección del combo, ingrese nuevamente");
            this.dispose();

        } finally {

            try {

                con.cerrarConexion();

            } catch (SQLException ex) {

                Utilidades.msg(this, "Se produjo un error al cerrar la conexión, ingrese nuevamente");
                this.dispose();

            }

        }
    
    }//GEN-LAST:event_comboBoxMateriaItemStateChanged

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        Conexion con = new Conexion();
        
        try {
            
            if (comboBoxMateria.getSelectedItem().toString().equals("--") || txtIdMateria.getText().equals("")) {
                Utilidades.msg(this, "Debe elegir una Materia para actualizar");
                comboBoxMateria.requestFocus();
                return;
            }
            
            if (comboBoxSituacion.getSelectedItem().toString().equals("--")) {
                Utilidades.msg(this, "Debe elegir una Situacion para actualizar");
                comboBoxMateria.requestFocus();
                return;
            }
                      
            if (Utilidades.existe(con.getConexion(), "SELECT (1) FROM CONDICION_ALUMNO_MATERIA "
                + " WHERE DNI = " + Integer.valueOf(txtDNI.getText())
                + " AND ID_CARRERA = " + Integer.valueOf(txtIdCarrera.getText())
                + " AND ID_MATERIA = " + + Integer.valueOf(txtIdMateria.getText())
                + " AND SITUACION = '" + comboBoxSituacion.getSelectedItem().toString() + "' ")) {
            
                Utilidades.msg(this, "No se pudo modificar porque la Situación ya existe");
            
            } else {
            
                CondicionAlumnoMateria condicionAmodificar = new CondicionAlumnoMateria(
                    Integer.valueOf(txtIdCondicionAlumnoMateria.getText()),    
                    Integer.valueOf(txtDNI.getText()),
                    Integer.valueOf(txtIdCarrera.getText()),
                    Integer.valueOf(txtIdMateria.getText()),
                    comboBoxSituacion.getSelectedItem().toString()
                );
            
                daoCondicionAlumnoMateria.actualizarCondicionAlumnoMateria(condicionAmodificar, con.getConexion());
            
                Utilidades.msg(this, "Situación actualizada correctamente");
                
                this.dispose();
                            
            }
        
        } catch (NumberFormatException | SQLException e) {
            
            Utilidades.msg(this, "Se produjo un error al actualizar la Situación, ingrese nuevamente");
            this.dispose();
            
        } finally {

            try {

                con.cerrarConexion();

            } catch (SQLException ex) {

                Utilidades.msg(this, "Se produjo un error al cerrar la conexión, ingrese nuevamente");
                this.dispose();

            }
            
        }
      
    }//GEN-LAST:event_btnActualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmModificacionCondicionAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmModificacionCondicionAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmModificacionCondicionAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmModificacionCondicionAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmModificacionCondicionAlumno dialog = new FrmModificacionCondicionAlumno(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    private void inicializar() {
        
        Conexion con = new Conexion();
        
        daoCondicionAlumnoMateria = new DaoCondicionAlumnoMateria();
        daoMateria = new DaoMateria();
        
        txtIdCondicionAlumnoMateria.setText(String.valueOf(idCondicionAlumnoMateria));
        txtIdCondicionAlumnoMateria.setEditable(false);
        
        try {
                       
            DTOcondicionAlumnoMateria condicionAlumno = daoCondicionAlumnoMateria.obtenerInfoSituacion(idCondicionAlumnoMateria, con.getConexion());
            
            txtDNI.setText(String.valueOf(condicionAlumno.getDniAlumno()));
            txtNombreCarrera.setText(condicionAlumno.getNombreCarrera());
            comboBoxSituacion.setSelectedItem(condicionAlumno.getSituacionAlumnoMateria());
                        
            daoMateria.llenarComboBoxMateriasCarrera(modeloComboBoxMateria, condicionAlumno.getIdCarrera(), con.getConexion());
            
            txtIdCarrera.setText(String.valueOf(condicionAlumno.getIdCarrera()));
            txtIdMateria.setText(String.valueOf(condicionAlumno.getIdMateria()));
            
            comboBoxMateria.setSelectedItem(condicionAlumno.getNombreMateria());
                       
            txtIdCarrera.setEditable(false);
            txtIdCarrera.setVisible(false);
            
            txtIdMateria.setEditable(false);
            txtIdMateria.setVisible(false);
            
            txtIdCondicionAlumnoMateria.setEditable(false);
            txtIdCondicionAlumnoMateria.setVisible(false);
            
            txtDNI.setEditable(false);
            txtNombreCarrera.setEditable(false);
                        
        } catch (SQLException ex) {
            
            Utilidades.msg(this, "Se produjo un error al inicializar la ventana, ingrese nuevamente");
            this.dispose();
            
        } finally {
            
            try {
                
                con.cerrarConexion();  
               
            } catch (SQLException ex) {
                
                Utilidades.msg(this, "Se produjo un error al cerrar la conexión, ingrese nuevamente");
                this.dispose();
                
            }
            
        }
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboBoxMateria;
    private javax.swing.JComboBox<String> comboBoxSituacion;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JLabel lblSituacion;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtIdCarrera;
    private javax.swing.JTextField txtIdCondicionAlumnoMateria;
    private javax.swing.JTextField txtIdMateria;
    private javax.swing.JTextField txtNombreCarrera;
    // End of variables declaration//GEN-END:variables
}
