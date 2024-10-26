/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.escuela.Formularios;

import com.escuela.DAOs.DaoCarrera;
import com.escuela.DAOs.DaoMateria;
import com.escuela.Entidades.Materia;
import com.escuela.Utilidades.Conexion;
import com.escuela.Utilidades.Utilidades;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Marcos Baró
 */
public class FrmSituacionAlumno extends javax.swing.JFrame {
    
    DaoCarrera daoCarrera;
    DaoMateria daoMateria;
    
    DefaultComboBoxModel<String> modeloComboBoxCarrera = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> modeloComboBoxMateria = new DefaultComboBoxModel<>();

    /**
     * Creates new form FrmSituacionAlumno
     */
    public FrmSituacionAlumno() {
        initComponents();
        this.setTitle("Situación Alumno");
        //this.setExtendedState(MAXIMIZED_BOTH);
        comboBoxCarrera.setModel(modeloComboBoxCarrera);
        comboBoxMateria.setModel(modeloComboBoxMateria);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
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

        lblCarrera = new javax.swing.JLabel();
        comboBoxCarrera = new javax.swing.JComboBox<>();
        lblDNI = new javax.swing.JLabel();
        txtDNIalumno = new javax.swing.JTextField();
        txtIDcarrera = new javax.swing.JTextField();
        btnEstadoMaterias = new javax.swing.JButton();
        btnComoRindeFinal = new javax.swing.JButton();
        btnCursaMateria = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblMateria = new javax.swing.JLabel();
        comboBoxMateria = new javax.swing.JComboBox<>();
        txtIdMateria = new javax.swing.JTextField();
        menuBarFrmPrincipal = new javax.swing.JMenuBar();
        menuABMs = new javax.swing.JMenu();
        menuItemABMalumno = new javax.swing.JMenuItem();
        menuItemABMcarrera = new javax.swing.JMenuItem();
        menuItemABMmateria = new javax.swing.JMenuItem();
        menuItemABMcorrelatividad = new javax.swing.JMenuItem();
        menuItemABMsituacionAlumno = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuItemSalir = new javax.swing.JMenuItem();
        menuInfo = new javax.swing.JMenu();
        menuItemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblCarrera.setText("Carrera:");

        comboBoxCarrera.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxCarreraItemStateChanged(evt);
            }
        });

        lblDNI.setText("DNI:");

        btnEstadoMaterias.setText("Estado Materias");
        btnEstadoMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoMateriasActionPerformed(evt);
            }
        });

        btnComoRindeFinal.setText("Cómo rinde el final");
        btnComoRindeFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComoRindeFinalActionPerformed(evt);
            }
        });

        btnCursaMateria.setText("Puede cursar la Materia");
        btnCursaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCursaMateriaActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblMateria.setText("Materia:");

        comboBoxMateria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxMateriaItemStateChanged(evt);
            }
        });

        menuABMs.setText("ABMs");

        menuItemABMalumno.setText("Alumno");
        menuItemABMalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemABMalumnoActionPerformed(evt);
            }
        });
        menuABMs.add(menuItemABMalumno);

        menuItemABMcarrera.setText("Carrera");
        menuItemABMcarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemABMcarreraActionPerformed(evt);
            }
        });
        menuABMs.add(menuItemABMcarrera);

        menuItemABMmateria.setText("Materia");
        menuItemABMmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemABMmateriaActionPerformed(evt);
            }
        });
        menuABMs.add(menuItemABMmateria);

        menuItemABMcorrelatividad.setText("Correlativas");
        menuItemABMcorrelatividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemABMcorrelatividadActionPerformed(evt);
            }
        });
        menuABMs.add(menuItemABMcorrelatividad);

        menuItemABMsituacionAlumno.setText("Situación Alumno");
        menuItemABMsituacionAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemABMsituacionAlumnoActionPerformed(evt);
            }
        });
        menuABMs.add(menuItemABMsituacionAlumno);
        menuABMs.add(jSeparator1);

        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menuABMs.add(menuItemSalir);

        menuBarFrmPrincipal.add(menuABMs);

        menuInfo.setText("Info");
        menuInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInfoActionPerformed(evt);
            }
        });

        menuItemAcercaDe.setText("Acerca de...");
        menuInfo.add(menuItemAcercaDe);

        menuBarFrmPrincipal.add(menuInfo);

        setJMenuBar(menuBarFrmPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDcarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(154, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEstadoMaterias)
                                .addGap(29, 29, 29)
                                .addComponent(btnComoRindeFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(btnCursaMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(txtDNIalumno, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(158, 158, 158)
                                .addComponent(btnLimpiar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnComoRindeFinal, btnCursaMateria, btnEstadoMaterias});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtIDcarrera, txtIdMateria});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarrera)
                    .addComponent(comboBoxCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDcarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMateria)
                    .addComponent(txtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDNI)
                    .addComponent(txtDNIalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEstadoMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComoRindeFinal)
                    .addComponent(btnCursaMateria))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnComoRindeFinal, btnCursaMateria, btnEstadoMaterias});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemABMalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemABMalumnoActionPerformed
        
        FrmABMalumno abmAlumno = new FrmABMalumno();
        abmAlumno.setVisible(true);
        abmAlumno.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_menuItemABMalumnoActionPerformed

    private void menuItemABMcarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemABMcarreraActionPerformed
        
        FrmABMcarrera abmCarrera = new FrmABMcarrera();
        abmCarrera.setVisible(true);
        abmCarrera.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_menuItemABMcarreraActionPerformed

    private void menuItemABMmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemABMmateriaActionPerformed
        
        FrmABMmateria abmMateria = new FrmABMmateria();
        abmMateria.setVisible(true);
        abmMateria.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_menuItemABMmateriaActionPerformed

    private void menuItemABMcorrelatividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemABMcorrelatividadActionPerformed
        
        FrmABMcorrelatividadMateria abmCorrelatividadMateria = new FrmABMcorrelatividadMateria();
        abmCorrelatividadMateria.setVisible(true);
        abmCorrelatividadMateria.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_menuItemABMcorrelatividadActionPerformed

    private void menuItemABMsituacionAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemABMsituacionAlumnoActionPerformed
        
        FrmABMcondicionAlumnoMateria abmCondicionAlumnoMateria = new FrmABMcondicionAlumnoMateria();
        abmCondicionAlumnoMateria.setVisible(true);
        abmCondicionAlumnoMateria.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_menuItemABMsituacionAlumnoActionPerformed

    private void menuInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInfoActionPerformed
        
        FrmAcercaDe info = new FrmAcercaDe(this, true);
        info.setVisible(true);
        info.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_menuInfoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        txtDNIalumno.setText("");
        txtIDcarrera.setText("");
        txtIdMateria.setText("");
        
        if (modeloComboBoxCarrera.getSize() > 0) {
           comboBoxCarrera.setSelectedIndex(0);
        }
        
        if (modeloComboBoxMateria.getSize() > 0) {
           comboBoxMateria.setSelectedIndex(0);
        }
       
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEstadoMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoMateriasActionPerformed
        
        Integer idMateria = null;

        try {
            
            if (comboBoxCarrera.getSelectedItem().toString().equals("--") || txtIDcarrera.getText().equals("")) {
                Utilidades.msg(this, "Debe elegir una Carrera para el Alumno");
                comboBoxCarrera.requestFocus();
                return;
            }

            if (txtDNIalumno.getText().equals("")) {
                Utilidades.msg(this, "El DNI no puede estar vacío");
                txtDNIalumno.requestFocus();
                return;
            }
            
            if (!comboBoxMateria.getSelectedItem().toString().equals("--") || !txtIdMateria.getText().equals("")) {
                idMateria = Integer.valueOf(txtIdMateria.getText());
            }
            
            FrmReporteEstadoMaterias reporte = new FrmReporteEstadoMaterias(Integer.valueOf(txtIDcarrera.getText()), Integer.valueOf(txtDNIalumno.getText()), idMateria);
                                    
        } catch (NumberFormatException e) {

            Utilidades.msg(this, "Error: no se pudo generar el reporte, intente nuevamente");
            
        }
        
    }//GEN-LAST:event_btnEstadoMateriasActionPerformed

    private void btnComoRindeFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComoRindeFinalActionPerformed
        
        try {
            
            if (comboBoxCarrera.getSelectedItem().toString().equals("--") || txtIDcarrera.getText().equals("")) {
                Utilidades.msg(this, "Debe elegir una Carrera para el Alumno");
                comboBoxCarrera.requestFocus();
                return;
            }
            
            if (comboBoxMateria.getSelectedItem().toString().equals("--") || txtIdMateria.getText().equals("")) {
                Utilidades.msg(this, "Debe elegir una Materia para el Alumno");
                comboBoxMateria.requestFocus();
                return;
            }

            if (txtDNIalumno.getText().equals("")) {
                Utilidades.msg(this, "El DNI no puede estar vacío");
                txtDNIalumno.requestFocus();
                return;
            }
                        
            FrmReporteComoRinde reporte = new FrmReporteComoRinde(Integer.valueOf(txtIDcarrera.getText()), Integer.valueOf(txtDNIalumno.getText()), Integer.valueOf(txtIdMateria.getText()));
                                   
        } catch (NumberFormatException e) {

            Utilidades.msg(this, "Error: no se pudo generar el reporte, intente nuevamente");
            
        }
        
    }//GEN-LAST:event_btnComoRindeFinalActionPerformed

    private void btnCursaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCursaMateriaActionPerformed
                
        try {
            
            if (comboBoxCarrera.getSelectedItem().toString().equals("--") || txtIDcarrera.getText().equals("")) {
                Utilidades.msg(this, "Debe elegir una Carrera para el Alumno");
                comboBoxCarrera.requestFocus();
                return;
            }
            
            if (comboBoxMateria.getSelectedItem().toString().equals("--") || txtIdMateria.getText().equals("")) {
                Utilidades.msg(this, "Debe elegir una Materia para el Alumno");
                comboBoxMateria.requestFocus();
                return;
            }

            if (txtDNIalumno.getText().equals("")) {
                Utilidades.msg(this, "El DNI no puede estar vacío");
                txtDNIalumno.requestFocus();
                return;
            }
                        
            FrmReporteComoCursa reporte = new FrmReporteComoCursa(Integer.valueOf(txtIDcarrera.getText()), Integer.valueOf(txtDNIalumno.getText()), Integer.valueOf(txtIdMateria.getText()));
                                   
        } catch (NumberFormatException e) {

            Utilidades.msg(this, "Error: no se pudo generar el reporte, intente nuevamente");
            
        }
        
    }//GEN-LAST:event_btnCursaMateriaActionPerformed

    private void comboBoxCarreraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxCarreraItemStateChanged
        
        Conexion con = new Conexion();
        
        txtIDcarrera.setText("");
        
        try {
            
            String carrera = comboBoxCarrera.getSelectedItem() != null ? comboBoxCarrera.getSelectedItem().toString() : null;
            
            if (carrera == null || carrera.equals("--")) {
                
                txtIDcarrera.setText("");
                
                if (modeloComboBoxMateria.getSize() > 0) {
                    comboBoxMateria.setSelectedIndex(0);
                }
                
                comboBoxMateria.setEnabled(false);
                txtIdMateria.setText("");
                
                
            } else {
                
               Integer idCarreraSeleccionada = daoCarrera.obtenerIdCarreraSeleccionada(carrera, con.getConexion());
            
               if (idCarreraSeleccionada != null) {
                   
                   txtIDcarrera.setText(String.valueOf(idCarreraSeleccionada));

                   daoMateria.llenarComboBoxMateriasCarrera(modeloComboBoxMateria, idCarreraSeleccionada, con.getConexion());
                   
                   txtIdMateria.setText("");
                   
                   if (modeloComboBoxMateria.getSize() > 0) {
                        comboBoxMateria.setSelectedIndex(0);
                    }
                   
                   
                   comboBoxMateria.setEnabled(true);
                    
               } else {
                   
                   txtIDcarrera.setText("");
                   
                   if (modeloComboBoxCarrera.getSize() > 0) {
                        comboBoxCarrera.setSelectedIndex(0);
                   }
                   
                   txtIdMateria.setText("");
                   
                   if (modeloComboBoxMateria.getSize() > 0) {
                        comboBoxMateria.setSelectedIndex(0);
                   }
                                     
                   comboBoxMateria.setEnabled(false);
                   
               }          
                
            }
           
        } catch (SQLException e) {
            
            Utilidades.msg(this, "Se produjo un error en la selección del combo, ingrese nuevamente");
            System.exit(0);
            
        } finally {
            
            try {
                
                con.cerrarConexion();  
               
            } catch (SQLException ex) {
                
                Utilidades.msg(this, "Se produjo un error al cerrar la conexión, ingrese nuevamente");
                System.exit(0);
                
            }
            
        }
        
    }//GEN-LAST:event_comboBoxCarreraItemStateChanged

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
                    
                    txtIdMateria.setText("");
                    
                    if (modeloComboBoxMateria.getSize() > 0) {
                        comboBoxMateria.setSelectedIndex(0);
                    }

                }

            }

        } catch (Exception e) {

            Utilidades.msg(this, "Se produjo un error en la selección del combo, ingrese nuevamente");
            System.exit(0);

        } finally {

            try {

                con.cerrarConexion();

            } catch (SQLException ex) {

                Utilidades.msg(this, "Se produjo un error al cerrar la conexión, ingrese nuevamente");
                System.exit(0);

            }

        }

    }//GEN-LAST:event_comboBoxMateriaItemStateChanged

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_menuItemSalirActionPerformed

    private void inicializar() {
        
        Conexion con = new Conexion();
        
        daoCarrera = new DaoCarrera();
        daoMateria = new DaoMateria();
        
        try {
            
            txtDNIalumno.setText("");
            
            txtIDcarrera.setText("");
            daoCarrera.llenarComboBoxCarrera(modeloComboBoxCarrera, con.getConexion());
           
            if (modeloComboBoxCarrera.getSize() > 0) {
                comboBoxCarrera.setSelectedIndex(0);
            }
            
            txtIDcarrera.setEditable(false);
            txtIDcarrera.setVisible(false);
            
            txtIdMateria.setText("");
            daoMateria.llenarComboBoxMateriaIni(modeloComboBoxMateria, con.getConexion());
            
            if (modeloComboBoxMateria.getSize() > 0) {
                comboBoxMateria.setSelectedIndex(0);
            }
            
            txtIdMateria.setEditable(false);
            txtIdMateria.setVisible(false);
            comboBoxMateria.setEnabled(false);
            
        } catch (SQLException ex) {
            
            Utilidades.msg(this, "Se produjo un error al inicializar la ventana, ingrese nuevamente");
            System.exit(0);
            
        } finally {
            
            try {
                
                con.cerrarConexion();  
               
            } catch (SQLException ex) {
                
                Utilidades.msg(this, "Se produjo un error al cerrar la conexión, ingrese nuevamente");
                System.exit(0);
                
            }
            
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(FrmSituacionAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSituacionAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSituacionAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSituacionAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSituacionAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComoRindeFinal;
    private javax.swing.JButton btnCursaMateria;
    private javax.swing.JButton btnEstadoMaterias;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> comboBoxCarrera;
    private javax.swing.JComboBox<String> comboBoxMateria;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JMenu menuABMs;
    private javax.swing.JMenuBar menuBarFrmPrincipal;
    private javax.swing.JMenu menuInfo;
    private javax.swing.JMenuItem menuItemABMalumno;
    private javax.swing.JMenuItem menuItemABMcarrera;
    private javax.swing.JMenuItem menuItemABMcorrelatividad;
    private javax.swing.JMenuItem menuItemABMmateria;
    private javax.swing.JMenuItem menuItemABMsituacionAlumno;
    private javax.swing.JMenuItem menuItemAcercaDe;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JTextField txtDNIalumno;
    private javax.swing.JTextField txtIDcarrera;
    private javax.swing.JTextField txtIdMateria;
    // End of variables declaration//GEN-END:variables
}