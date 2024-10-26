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
public class FrmABMmateria extends javax.swing.JFrame {
    
    DaoMateria daoMateria;
    DaoCarrera daoCarrera;
    
    DefaultComboBoxModel<String> modeloComboBoxCarrera = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> modeloComboBoxMateria = new DefaultComboBoxModel<>();

    /**
     * Creates new form FrmABMmateria
     */
    public FrmABMmateria() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        comboBoxCarrera.setModel(modeloComboBoxCarrera);
        comboBoxMateria.setModel(modeloComboBoxMateria);
        this.setResizable(false);
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
        lblNombreMateria = new javax.swing.JLabel();
        txtNombreMateria = new javax.swing.JTextField();
        txtIdCarrera = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblTipo = new javax.swing.JLabel();
        comboBoxTipoMateria = new javax.swing.JComboBox<>();
        panelModificarEliminarMateria = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblMateria = new javax.swing.JLabel();
        comboBoxMateria = new javax.swing.JComboBox<>();
        lblModificar = new javax.swing.JLabel();
        txtMateriaAModificar = new javax.swing.JTextField();
        txtIdMateria = new javax.swing.JTextField();
        lblTipoModificar = new javax.swing.JLabel();
        comboBoxTipoAModificar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ABM - Materia");

        lblCarrera.setText("Carrera:");

        comboBoxCarrera.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxCarreraItemStateChanged(evt);
            }
        });

        lblNombreMateria.setText("Materia:");

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

        lblTipo.setText("Tipo:");

        comboBoxTipoMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "ANUAL", "CUATRIMESTRAL" }));

        panelModificarEliminarMateria.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar/Eliminar Materia"));

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

        lblMateria.setText("Materia:");

        comboBoxMateria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxMateriaItemStateChanged(evt);
            }
        });

        lblModificar.setText("Modificar por:");

        lblTipoModificar.setText("Tipo:");

        comboBoxTipoAModificar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "ANUAL", "CUATRIMESTRAL" }));

        javax.swing.GroupLayout panelModificarEliminarMateriaLayout = new javax.swing.GroupLayout(panelModificarEliminarMateria);
        panelModificarEliminarMateria.setLayout(panelModificarEliminarMateriaLayout);
        panelModificarEliminarMateriaLayout.setHorizontalGroup(
            panelModificarEliminarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModificarEliminarMateriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelModificarEliminarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModificarEliminarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelModificarEliminarMateriaLayout.createSequentialGroup()
                            .addComponent(lblTipoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModificarEliminarMateriaLayout.createSequentialGroup()
                            .addComponent(lblModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                    .addGroup(panelModificarEliminarMateriaLayout.createSequentialGroup()
                        .addComponent(lblMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelModificarEliminarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModificarEliminarMateriaLayout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addGap(144, 144, 144)
                        .addComponent(btnEliminar))
                    .addComponent(comboBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelModificarEliminarMateriaLayout.createSequentialGroup()
                        .addComponent(comboBoxTipoAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMateriaAModificar))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelModificarEliminarMateriaLayout.setVerticalGroup(
            panelModificarEliminarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModificarEliminarMateriaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelModificarEliminarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMateria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelModificarEliminarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMateriaAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModificar))
                .addGroup(panelModificarEliminarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModificarEliminarMateriaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelModificarEliminarMateriaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panelModificarEliminarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxTipoAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipoModificar))))
                .addGap(29, 29, 29)
                .addGroup(panelModificarEliminarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIdCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addGap(231, 231, 231))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxTipoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboBoxCarrera, 0, 475, Short.MAX_VALUE)
                                .addComponent(txtNombreMateria)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(48, 48, 48)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(panelModificarEliminarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarrera)
                    .addComponent(comboBoxCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreMateria)
                    .addComponent(txtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(comboBoxTipoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(panelModificarEliminarMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnCancelar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        Conexion con = new Conexion();
        
        try {
            
            if (comboBoxCarrera.getSelectedItem().toString().equals("--") || txtIdCarrera.getText().equals("")) {
                Utilidades.msg(this, "Debe elegir una Carrera para la Materia");
                comboBoxCarrera.requestFocus();
                return;
            }
            
            if (txtNombreMateria.getText().equals("")) {
                Utilidades.msg(this, "La Materia no puede estar vacía");
                txtNombreMateria.requestFocus();
                return;
            }
            
            if (comboBoxTipoMateria.getSelectedItem().toString().equals("--")) {
                Utilidades.msg(this, "Debe elegir un Tipo para la Materia");
                comboBoxTipoMateria.requestFocus();
                return;
            }
        
            if (Utilidades.existe(con.getConexion(), "SELECT (1) FROM MATERIA WHERE NOMBRE = '" + txtNombreMateria.getText() + "' ")) {
                
                Utilidades.msg(this, "No se puede ingresar porque la Materia ya existe");
                
            } else {
                
                Materia materia = new Materia(
                    txtNombreMateria.getText(), 
                    Integer.valueOf(txtIdCarrera.getText()),
                    comboBoxTipoMateria.getSelectedItem().toString()
                );
                
                daoMateria.ingresarMateria(materia, con.getConexion());
                
                Utilidades.msg(this, "Materia ingresada correctamente");
                
                txtNombreMateria.setText("");
                               
                comboBoxCarrera.setSelectedIndex(0);
                txtIdCarrera.setText("");
            
                comboBoxTipoMateria.setSelectedIndex(0);
            
                txtMateriaAModificar.setText("");
                            
                comboBoxTipoAModificar.setSelectedIndex(0);
            
                txtIdMateria.setText("");
                daoMateria.llenarComboBoxMateriaIni(modeloComboBoxMateria, con.getConexion());
                
                if (modeloComboBoxMateria.getSize() > 0) {
                        comboBoxMateria.setSelectedIndex(0);
                }
                               
            }
            
        } catch (NumberFormatException | SQLException e) {
            
            Utilidades.msg(this, "Error al ingresar la Materia, ingrese nuevamente");
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

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        Conexion con = new Conexion();
        
        try {
                       
            if (comboBoxCarrera.getSelectedItem().toString().equals("--") || txtIdCarrera.getText().equals("")) {
                Utilidades.msg(this, "Debe elegir una Carrera para la Materia a modificar");
                comboBoxCarrera.requestFocus();
                return;
            }
            
            if (comboBoxMateria.getSelectedItem().toString().equals("--") || txtIdMateria.getText().equals("")) {
                Utilidades.msg(this, "Debe elegir una Materia para modificar");
                comboBoxMateria.requestFocus();
                return;
            }
            
            if (txtMateriaAModificar.getText().equals("")) {
                Utilidades.msg(this, "La Materia modificada no puede ser vacía");
                txtMateriaAModificar.requestFocus();
                return;
            }
            
            if (comboBoxTipoAModificar.getSelectedItem().toString().equals("--")) {
                Utilidades.msg(this, "Debe elegir un Tipo para la Materia a modificar");
                comboBoxTipoAModificar.requestFocus();
                return;
            }
        
            Materia materia = new Materia(
                    Integer.valueOf(txtIdMateria.getText()), 
                    txtMateriaAModificar.getText(), 
                    Integer.valueOf(txtIdCarrera.getText()),
                    comboBoxTipoAModificar.getSelectedItem().toString()
            );
            
            daoMateria.actualizaMateria(materia, con.getConexion());
                
            Utilidades.msg(this, "Se actualizaron los datos correctamente");
            
            txtNombreMateria.setText("");
                               
            comboBoxCarrera.setSelectedIndex(0);
            txtIdCarrera.setText("");
            
            comboBoxTipoMateria.setSelectedIndex(0);
            
            txtMateriaAModificar.setText("");
                            
            comboBoxTipoAModificar.setSelectedIndex(0);
            
            txtIdMateria.setText("");
            daoMateria.llenarComboBoxMateriaIni(modeloComboBoxMateria, con.getConexion());
            comboBoxMateria.setSelectedIndex(0);
                       
        } catch (NumberFormatException | SQLException e) {

            Utilidades.msg(this, "Error: no se pudo actualizar la Materia, ingrese nuevamente");
            this.dispose();

        } finally {
           
            try {
                
                con.cerrarConexion();  
               
            } catch (SQLException ex) {
                
                Utilidades.msg(this, "Se produjo un error al cerrar la conexión, ingrese nuevamente");
                this.dispose();
                
            }
            
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        Conexion con = new Conexion();
        
        try {
            
            if (comboBoxCarrera.getSelectedItem().toString().equals("--") || txtIdCarrera.getText().equals("")) {
                Utilidades.msg(this, "Debe elegir una Carrera para la Materia a eliminar");
                comboBoxCarrera.requestFocus();
                return;
            }
            
            if (comboBoxMateria.getSelectedItem().toString().equals("--") || txtIdMateria.getText().equals("")) {
                Utilidades.msg(this, "Debe elegir una Materia para eliminar");
                comboBoxMateria.requestFocus();
                return;
            }
            
            daoMateria.eliminarMateria(Integer.valueOf(txtIdMateria.getText()), con.getConexion());
            
            Utilidades.msg(this, "Se eliminó la Materia correctamente");
            
            txtNombreMateria.setText("");
                               
            comboBoxCarrera.setSelectedIndex(0);
            txtIdCarrera.setText("");
            
            comboBoxTipoMateria.setSelectedIndex(0);
            
            txtMateriaAModificar.setText("");
                            
            comboBoxTipoAModificar.setSelectedIndex(0);
            
            txtIdMateria.setText("");
            daoMateria.llenarComboBoxMateriaIni(modeloComboBoxMateria, con.getConexion());
            
            if (modeloComboBoxMateria.getSize() > 0) {
                comboBoxMateria.setSelectedIndex(0);
            }            
            
        } catch (NumberFormatException | SQLException e) {
            
            Utilidades.msg(this, "Error: no se pudo eliminar la Materia, ingrese nuevamente");
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

        txtNombreMateria.setText("");
                               
        if (modeloComboBoxCarrera.getSize() > 0) {
            comboBoxCarrera.setSelectedIndex(0);
        }
        txtIdCarrera.setText("");
            
        comboBoxTipoMateria.setSelectedIndex(0);
            
        txtMateriaAModificar.setText("");
                            
        comboBoxTipoAModificar.setSelectedIndex(0);
            
        txtIdMateria.setText("");
        
        if (modeloComboBoxMateria.getSize() > 0) {
            comboBoxMateria.setSelectedIndex(0);
        }
                          
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
                                
            } else {
                
               Integer idCarreraSeleccionada = daoCarrera.obtenerIdCarreraSeleccionada(carrera, con.getConexion());
            
               if (idCarreraSeleccionada != null) {
                   
                   txtIdCarrera.setText(String.valueOf(idCarreraSeleccionada));
                   
                   daoMateria.llenarComboBoxMateriasCarrera(modeloComboBoxMateria, idCarreraSeleccionada, con.getConexion());
                   
                   txtIdMateria.setText("");
                   
                   if (modeloComboBoxMateria.getSize() > 0) {
                        comboBoxMateria.setSelectedIndex(0);
                   }
                                      
               } else {
                   
                   txtIdCarrera.setText("");
                   
                   if (modeloComboBoxCarrera.getSize() > 0) {
                        comboBoxCarrera.setSelectedIndex(0);
                   }
                   
                   txtIdMateria.setText("");
                   
                   if (modeloComboBoxMateria.getSize() > 0) {
                        comboBoxMateria.setSelectedIndex(0);
                   }
                   
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
        txtMateriaAModificar.setText("");
        comboBoxTipoAModificar.setSelectedIndex(0);
        
        try {
                        
            String materia = comboBoxMateria.getSelectedItem() != null ? comboBoxMateria.getSelectedItem().toString() : null;
            
            if (materia == null || materia.equals("--")) {
                
                txtIdMateria.setText("");
                txtMateriaAModificar.setText("");
                comboBoxTipoAModificar.setSelectedIndex(0);
                                
            } else {
                
               Materia materiaSeleccionada = daoMateria.obtenerDatosMateria(materia, con.getConexion());
            
               if (materiaSeleccionada != null) {
                   
                   txtIdMateria.setText(String.valueOf(materiaSeleccionada.getIdMateria()));
                   txtMateriaAModificar.setText(materiaSeleccionada.getNombreMateria());
                   comboBoxTipoAModificar.setSelectedItem(materiaSeleccionada.getTipo());
                   
               } else {
                   
                   if (modeloComboBoxMateria.getSize() > 0) {
                        comboBoxMateria.setSelectedIndex(0);
                   }
                                      
                   txtIdMateria.setText("");
                   txtMateriaAModificar.setText("");
                   comboBoxTipoAModificar.setSelectedIndex(0);
                   
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
            java.util.logging.Logger.getLogger(FrmABMmateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmABMmateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmABMmateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmABMmateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmABMmateria().setVisible(true);
            }
        });
    }
    
    private void inicializar() {
        
        Conexion con = new Conexion();
        
        daoMateria = new DaoMateria();
        daoCarrera = new DaoCarrera();
        
        try {
           
            txtNombreMateria.setText("");
                                       
            daoCarrera.llenarComboBoxCarrera(modeloComboBoxCarrera, con.getConexion());
            
            txtIdCarrera.setText("");
            
            if (modeloComboBoxCarrera.getSize() > 0) {
                comboBoxCarrera.setSelectedIndex(0);
            }
                        
            comboBoxTipoMateria.setSelectedIndex(0);
            
            txtMateriaAModificar.setText("");
            txtIdMateria.setText("");
            
            comboBoxTipoAModificar.setSelectedIndex(0);
            
            daoMateria.llenarComboBoxMateriaIni(modeloComboBoxMateria, con.getConexion());
            
            if (modeloComboBoxMateria.getSize() > 0) {
                comboBoxMateria.setSelectedIndex(0);
            }
                               
            txtIdCarrera.setEditable(false);
            txtIdCarrera.setVisible(false);
            
            txtIdMateria.setEditable(false);
            txtIdMateria.setVisible(false);
           
        } catch (SQLException ex) {
            
            Utilidades.msg(this, "Se produjo un error al inicializar la ventana, ingrese nuevamente");
            this.dispose();
            
        } finally {
            
            try {
                
                con.cerrarConexion();  
               
            } catch (SQLException ex) {
                
                Utilidades.msg(this, "Se produjo un error al cerrar la conexión");
                this.dispose();
                
            }
            
        }
           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboBoxCarrera;
    private javax.swing.JComboBox<String> comboBoxMateria;
    private javax.swing.JComboBox<String> comboBoxTipoAModificar;
    private javax.swing.JComboBox<String> comboBoxTipoMateria;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JLabel lblModificar;
    private javax.swing.JLabel lblNombreMateria;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTipoModificar;
    private javax.swing.JPanel panelModificarEliminarMateria;
    private javax.swing.JTextField txtIdCarrera;
    private javax.swing.JTextField txtIdMateria;
    private javax.swing.JTextField txtMateriaAModificar;
    private javax.swing.JTextField txtNombreMateria;
    // End of variables declaration//GEN-END:variables
}
