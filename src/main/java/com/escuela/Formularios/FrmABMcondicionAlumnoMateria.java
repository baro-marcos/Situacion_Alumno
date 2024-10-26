/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.escuela.Formularios;

import com.escuela.DAOs.DaoCarrera;
import com.escuela.DAOs.DaoCondicionAlumnoMateria;
import com.escuela.DAOs.DaoMateria;
import com.escuela.Entidades.CondicionAlumnoMateria;
import com.escuela.Entidades.Materia;
import com.escuela.Utilidades.Conexion;
import com.escuela.Utilidades.Utilidades;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcos Baró
 */
public class FrmABMcondicionAlumnoMateria extends javax.swing.JFrame {
    
    DaoMateria daoMateria;
    DaoCarrera daoCarrera;
    DaoCondicionAlumnoMateria daoCondicionAlumnoMateria;
    
    DefaultComboBoxModel<String> modeloComboBoxCarrera = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> modeloComboBoxMateria = new DefaultComboBoxModel<>();
    
    private DefaultTableModel modelSituaciones = new DefaultTableModel();

    /**
     * Creates new form FrmABMcondicionAlumnoMateria
     */
    public FrmABMcondicionAlumnoMateria() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        comboBoxCarrera.setModel(modeloComboBoxCarrera);
        comboBoxMateria.setModel(modeloComboBoxMateria);
        this.setResizable(false);
        crearModeloTabla();
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
        lblCarrera = new javax.swing.JLabel();
        comboBoxCarrera = new javax.swing.JComboBox<>();
        lblMateria = new javax.swing.JLabel();
        comboBoxMateria = new javax.swing.JComboBox<>();
        txtIdCarrera = new javax.swing.JTextField();
        txtIdMateria = new javax.swing.JTextField();
        lblSituacion = new javax.swing.JLabel();
        comboBoxSituacion = new javax.swing.JComboBox<>();
        panelModificarEliminar = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSituaciones = new javax.swing.JTable();
        txtIdCondicionAlumnoMateria = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ABM - Condición Alumno Materia");

        lblDNI.setText("DNI:");

        lblCarrera.setText("Carrera:");

        comboBoxCarrera.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxCarreraItemStateChanged(evt);
            }
        });

        lblMateria.setText("Materia:");

        comboBoxMateria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxMateriaItemStateChanged(evt);
            }
        });

        lblSituacion.setText("Situación:");

        comboBoxSituacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "APROBADO", "LIBRE", "REGULAR", "NO CURSO" }));

        panelModificarEliminar.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar / Eliminar"));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jTableSituaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableSituaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableSituacionesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSituaciones);

        javax.swing.GroupLayout panelModificarEliminarLayout = new javax.swing.GroupLayout(panelModificarEliminar);
        panelModificarEliminar.setLayout(panelModificarEliminarLayout);
        panelModificarEliminarLayout.setHorizontalGroup(
            panelModificarEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModificarEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelModificarEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelModificarEliminarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addComponent(btnEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE))
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModificarEliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147)
                .addComponent(txtIdCondicionAlumnoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelModificarEliminarLayout.setVerticalGroup(
            panelModificarEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModificarEliminarLayout.createSequentialGroup()
                .addGroup(panelModificarEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdCondicionAlumnoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelModificarEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCancelar)
                                .addGap(32, 32, 32)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelModificarEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBoxSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {comboBoxCarrera, comboBoxMateria, txtDNI});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDNI)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarrera)
                    .addComponent(comboBoxCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMateria)
                    .addComponent(comboBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelModificarEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnCancelar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboBoxCarrera, comboBoxMateria, comboBoxSituacion, txtDNI});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxCarreraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxCarreraItemStateChanged

        Conexion con = new Conexion();

        txtIdCarrera.setText("");

        try {
            
            String carrera = comboBoxCarrera.getSelectedItem() != null ? comboBoxCarrera.getSelectedItem().toString() : null;

            if (carrera == null || carrera.equals("--")) {

                txtIdCarrera.setText("");
                
                if (modeloComboBoxMateria.getSize() > 0) {
                    comboBoxMateria.setSelectedIndex(0);
                }
                
                txtIdMateria.setText("");
                
                comboBoxMateria.setEnabled(false);
                
            } else {

                Integer idCarreraSeleccionada = daoCarrera.obtenerIdCarreraSeleccionada(carrera, con.getConexion());

                if (idCarreraSeleccionada != null) {

                    txtIdCarrera.setText(String.valueOf(idCarreraSeleccionada));

                    daoMateria.llenarComboBoxMateriasCarrera(modeloComboBoxMateria, idCarreraSeleccionada, con.getConexion());
                    
                    if (modeloComboBoxMateria.getSize() > 0) {
                        comboBoxMateria.setSelectedIndex(0);
                   }
                    
                    txtIdMateria.setText("");
                    comboBoxMateria.setEnabled(true);

                } else {

                    txtIdCarrera.setText("");
                    
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
            this.dispose();

        } finally {

            try {

                con.cerrarConexion();

            } catch (SQLException ex) {

                Utilidades.msg(this, "Se produjo un error al cerrar la conexión, ingrese nuevamente");
                this.dispose();

            }

        }

    }//GEN-LAST:event_comboBoxCarreraItemStateChanged

    private void comboBoxMateriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxMateriaItemStateChanged

        Conexion con = new Conexion();

        txtIdMateria.setText("");
        comboBoxSituacion.setSelectedIndex(0);
        
        try {

            String materia = comboBoxMateria.getSelectedItem() != null ? comboBoxMateria.getSelectedItem().toString() : null;

            if (materia == null || materia.equals("--")) {

                txtIdMateria.setText("");
                
                comboBoxSituacion.setSelectedIndex(0);
                
            } else {

                Materia materiaSeleccionada = daoMateria.obtenerDatosMateria(materia, con.getConexion());

                if (materiaSeleccionada != null) {

                    txtIdMateria.setText(String.valueOf(materiaSeleccionada.getIdMateria()));
                                       
                } else {

                    if (modeloComboBoxMateria.getSize() > 0) {
                        comboBoxMateria.setSelectedIndex(0);
                   }
                    
                    txtIdMateria.setText("");
                    
                    comboBoxSituacion.setSelectedIndex(0);
                    
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

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        Conexion con = new Conexion();

        try {

            if (txtDNI.getText().equals("")) {
                Utilidades.msg(this, "El DNI no puede estar vacío");
                txtDNI.requestFocus();
                return;
            }
            
            if (comboBoxCarrera.getSelectedItem().toString().equals("--") || txtIdCarrera.getText().equals("")) {
                Utilidades.msg(this, "Debe elegir una Carrera");
                comboBoxCarrera.requestFocus();
                return;
            }
            
            if (comboBoxMateria.getSelectedItem().toString().equals("--") || txtIdMateria.getText().equals("")) {
                Utilidades.msg(this, "Debe elegir una Materia");
                comboBoxMateria.requestFocus();
                return;
            }
            
            if (comboBoxSituacion.getSelectedItem().toString().equals("--")) {
                Utilidades.msg(this, "Debe elegir una Situación");
                comboBoxSituacion.requestFocus();
                return;
            }
            
            if (!Utilidades.isNumInt(txtDNI.getText())) {
                Utilidades.msg(this, "DNI incorrecto");
                txtDNI.setText("");
                txtDNI.requestFocus();
                return;
            }
            
            if (Utilidades.isNumInt(txtDNI.getText()) && !(Integer.parseInt(txtDNI.getText()) > 0)) {
                Utilidades.msg(this, "DNI incorrecto, debe ser mayor a 0");
                txtDNI.setText("");
                txtDNI.requestFocus();
                return;                
            }

            if (Utilidades.existe(con.getConexion(), "SELECT (1) FROM CONDICION_ALUMNO_MATERIA "
                    + " WHERE DNI = " + Integer.valueOf(txtDNI.getText())  
                    + " AND ID_CARRERA = " + Integer.valueOf(txtIdCarrera.getText()) 
                    + " AND ID_MATERIA = " + Integer.valueOf(txtIdMateria.getText())
                    + " AND SITUACION = '" + comboBoxSituacion.getSelectedItem().toString() + "' ")) {

                Utilidades.msg(this, "No se puede ingresar porque la condición ya existe");

            } else {

                CondicionAlumnoMateria condicionAlumnoMateria = new CondicionAlumnoMateria(Integer.valueOf(txtDNI.getText()),
                        Integer.valueOf(txtIdCarrera.getText()), 
                        Integer.valueOf(txtIdMateria.getText()),
                        comboBoxSituacion.getSelectedItem().toString());

                daoCondicionAlumnoMateria.ingresarCondicionAlumnoMateria(condicionAlumnoMateria, con.getConexion());

                Utilidades.msg(this, "Situación ingresada correctamente");

                //txtDNI.setText("");
                //comboBoxCarrera.setSelectedIndex(0);
                //txtIdCarrera.setText("");
                
                if (modeloComboBoxMateria.getSize() > 0) {
                        comboBoxMateria.setSelectedIndex(0);
                }
                                
                txtIdMateria.setText("");
                
                comboBoxSituacion.setSelectedIndex(0);
                
                txtIdCondicionAlumnoMateria.setText("");
                btnEliminar.setEnabled(false);
                btnModificar.setEnabled(false);

            }

        } catch (NumberFormatException | SQLException e) {

            Utilidades.msg(this, "Error al ingresar la Situación, ingrese nuevamente");
            this.dispose();

        } finally {

            try {

                con.cerrarConexion();

            } catch (SQLException ex) {

                Utilidades.msg(this, "Se produjo un error al cerrar la conexión, ingrese nuevamente");
                this.dispose();

            }

        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        Conexion con = new Conexion();

        try {

           if (txtIdCondicionAlumnoMateria.getText().equals("")) {
                Utilidades.msg(this, "Ocurrió un error, Seleccione nuevamente la Situación a borrar de la tabla");
                return;
            }

            daoCondicionAlumnoMateria.eliminarSituacion(Integer.valueOf(txtIdCondicionAlumnoMateria.getText()), con.getConexion());

            Utilidades.msg(this, "Se eliminó la Situación correctamente");

            txtIdCondicionAlumnoMateria.setText("");

            limpiarTabla();
            
            btnAgregar.setEnabled(true);
            btnEliminar.setEnabled(false);
            btnModificar.setEnabled(false);

        } catch (NumberFormatException | SQLException e) {

            Utilidades.msg(this, "Error: no se pudo eliminar la Situación, ingrese nuevamente");
            this.dispose();

        } finally {

            try {

                con.cerrarConexion();

            } catch (SQLException ex) {

                Utilidades.msg(this, "Se produjo un error al cerrar la conexión, ingrese nuevamente");
                this.dispose();

            }

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        txtDNI.setText("");
        
        if (modeloComboBoxCarrera.getSize() > 0) {
            comboBoxCarrera.setSelectedIndex(0);
        }
        
        txtIdCarrera.setText("");
                
        if (modeloComboBoxMateria.getSize() > 0) {
            comboBoxMateria.setSelectedIndex(0);
        }
                
        txtIdMateria.setText("");
        
        comboBoxSituacion.setSelectedIndex(0);
        
        txtIdCondicionAlumnoMateria.setText("");
        
        limpiarTabla();
        
        btnAgregar.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnBuscar.setEnabled(true);
       
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        Conexion con = new Conexion();

        String dato = JOptionPane.showInputDialog("DNI:");

        try {

            if (dato != null && !dato.equals("") && Utilidades.isNumInt(dato) && Integer.parseInt(dato) > 0) {

                Integer datoEntero = Integer.valueOf(dato);

                llenarTablaAlumno(datoEntero, con.getConexion());
                
                btnEliminar.setEnabled(true);
                btnModificar.setEnabled(true);
                btnAgregar.setEnabled(false);

            } else {

                Utilidades.msg(this, "Debe ingresar un Nº entero mayor a 0");

            }

        } catch (NumberFormatException e) {

            Utilidades.msg(this, "Se produjo un error, ingrese nuevamente");
            this.dispose();

        } finally {

            try {

                con.cerrarConexion();

            } catch (SQLException ex) {

                Utilidades.msg(this, "Se produjo un error al cerrar la conexión, ingrese nuevamente");
                this.dispose();

            }

        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        try {

            if (txtIdCondicionAlumnoMateria.getText().equals("")) {
                Utilidades.msg(this, "Ocurrió un error, Seleccione nuevamente la Situación a modificar de la tabla");
                return;
            }
            
            FrmModificacionCondicionAlumno modificacionSituacion = new FrmModificacionCondicionAlumno(Integer.valueOf(txtIdCondicionAlumnoMateria.getText()));
                             
            txtIdCondicionAlumnoMateria.setText("");
            
            limpiarTabla();
            
            btnEliminar.setEnabled(false);
            btnModificar.setEnabled(false);
            btnAgregar.setEnabled(true);
            btnBuscar.setEnabled(true);
            
        } catch (NumberFormatException e) {

            Utilidades.msg(this, "Error: no se pudo actualizar la Situación, ingrese nuevamente");
            this.dispose();

        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jTableSituacionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSituacionesMousePressed
        
        txtIdCondicionAlumnoMateria.setText("");
        seleccionarSituacion();
        btnAgregar.setEnabled(false);
        btnEliminar.setEnabled(true);
        btnModificar.setEnabled(true);
        
    }//GEN-LAST:event_jTableSituacionesMousePressed

    private void inicializar() {
        
        Conexion con = new Conexion();
        
        daoMateria = new DaoMateria();
        daoCarrera = new DaoCarrera();
        daoCondicionAlumnoMateria = new DaoCondicionAlumnoMateria();
        
        try {
           
            txtDNI.setText("");
                                       
            daoCarrera.llenarComboBoxCarrera(modeloComboBoxCarrera, con.getConexion());
            
            if (modeloComboBoxCarrera.getSize() > 0) {
                comboBoxCarrera.setSelectedIndex(0);
            }    
            
            txtIdCarrera.setText("");
                       
            daoMateria.llenarComboBoxMateriaIni(modeloComboBoxMateria, con.getConexion());
            
            if (modeloComboBoxMateria.getSize() > 0) {
                comboBoxMateria.setSelectedIndex(0);
            }            
            
            txtIdMateria.setText("");
            comboBoxMateria.setEnabled(false);
            
            txtIdCarrera.setEditable(false);
            txtIdCarrera.setVisible(false);
            
            txtIdMateria.setEditable(false);
            txtIdMateria.setVisible(false);
                   
           comboBoxSituacion.setSelectedIndex(0);
                      
           //--------------------------------------------
           
           txtIdCondicionAlumnoMateria.setText("");
           txtIdCondicionAlumnoMateria.setEditable(false);
           txtIdCondicionAlumnoMateria.setVisible(false);
                   
           btnEliminar.setEnabled(false);
           btnModificar.setEnabled(false);
           
           btnBuscar.setEnabled(true);
                      
           jTableSituaciones.setModel(modelSituaciones);
           jTableSituaciones.getTableHeader().setReorderingAllowed(false);
                     
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
    
    private void limpiarTabla() {
        for (int i = 0; i < jTableSituaciones.getRowCount(); i++) {
            modelSituaciones.removeRow(i);
            i -= 1;
        }
    }
    
    private void llenarTablaAlumno(Integer dni, Connection con) {
        
        String consulta = " SELECT CONCAT(A.APELLIDO, ' ', A.NOMBRE) AS ALUMNO, "
                + " C.NOMBRE AS CARRERA, M.NOMBRE AS MATERIA, CAM.SITUACION, CAM.ID_CONDICION_ALUMNO_MATERIA"
                + " FROM CONDICION_ALUMNO_MATERIA CAM "
                + " INNER JOIN CARRERA C ON (C.ID_CARRERA = CAM.ID_CARRERA) "
                + " INNER JOIN MATERIA M ON (M.ID_MATERIA = CAM.ID_MATERIA) "
                + " INNER JOIN ALUMNO A ON (A.DNI = CAM.DNI) "
                + " WHERE CAM.DNI = " + dni
                + " ORDER BY C.NOMBRE, M.NOMBRE ";
        
        int nroColumnas = 5;
        
        Statement st = null;
        ResultSet rs = null;
        
        try {
            
            st = con.createStatement();
            rs = st.executeQuery(consulta);

            while (rs.next()) {
                // Se crea un array que será una de las filas de la tabla
                Object[] fila = new Object[nroColumnas];
                // Se rellena cada posición del array con una de las columnas de la tabla en base de datos
                for (int i = 0; i < nroColumnas; i++) {
                    fila[i] = rs.getObject(i + 1); // El primer indice en rs es el 1, no el cero, por eso se suma 1
                }
                // Se añade al modelo la fila completa.
                modelSituaciones.addRow(fila);
            }
           
        } catch (SQLException ex) {
            
            Utilidades.msg(this, "ERROR al llenar la Tabla, ingrese nuevamente");
            this.dispose();
            
        } finally {
            
            try {
                
               if (rs != null) {
                   
                    rs.close();
                   
                }
               
                if (st != null) {
               
                    st.close();
               
                } 
                
            } catch (SQLException e) {
                
                Utilidades.msg(this, "ERROR al llenar la Tabla, ingrese nuevamente");
                this.dispose();
                
            }
           
        }
        
    }
    
    private void seleccionarSituacion() {
        
        if (jTableSituaciones.getSelectedRow() != -1) {
            txtIdCondicionAlumnoMateria.setText(jTableSituaciones.getValueAt(jTableSituaciones.getSelectedRow(), 4).toString());
        }
        
    }
    
    private void crearModeloTabla() {
        modelSituaciones = (new DefaultTableModel(null,
                //Títulos    
                new String[]{"Alumno", "Carrera", "Materia", "Situación", "ID"}) {

            //Celdas editables
            boolean[] canEdit = new boolean[]{false, false, false, false, false};

            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return canEdit[colIndex];
            }

        });
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
            java.util.logging.Logger.getLogger(FrmABMcondicionAlumnoMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmABMcondicionAlumnoMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmABMcondicionAlumnoMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmABMcondicionAlumnoMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmABMcondicionAlumnoMateria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboBoxCarrera;
    private javax.swing.JComboBox<String> comboBoxMateria;
    private javax.swing.JComboBox<String> comboBoxSituacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSituaciones;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JLabel lblSituacion;
    private javax.swing.JPanel panelModificarEliminar;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtIdCarrera;
    private javax.swing.JTextField txtIdCondicionAlumnoMateria;
    private javax.swing.JTextField txtIdMateria;
    // End of variables declaration//GEN-END:variables
}