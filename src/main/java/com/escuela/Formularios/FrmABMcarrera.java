/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.escuela.Formularios;

import com.escuela.DAOs.DaoCarrera;
import com.escuela.Entidades.Carrera;
import com.escuela.Utilidades.Conexion;
import com.escuela.Utilidades.Utilidades;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Marcos Baró
 */
public class FrmABMcarrera extends javax.swing.JFrame {
    
    DaoCarrera daoCarrera;
    
    DefaultComboBoxModel<String> modeloComboBoxCarrera = new DefaultComboBoxModel<>();

    /**
     * Creates new form FrmABMcarrera
     */
    public FrmABMcarrera() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        comboBoxCarrera.setModel(modeloComboBoxCarrera);
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

        lblNombreCarrera = new javax.swing.JLabel();
        txtNombreCarrera = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanelModificarEliminar = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtIdCarrera = new javax.swing.JTextField();
        comboBoxCarrera = new javax.swing.JComboBox<>();
        lblCarreraModifElim = new javax.swing.JLabel();
        txtCarreraAModificar = new javax.swing.JTextField();
        lblModif = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ABM - Carrera");

        lblNombreCarrera.setText("Carrera:");

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

        jPanelModificarEliminar.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar/Eliminar Carrera"));

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

        comboBoxCarrera.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxCarreraItemStateChanged(evt);
            }
        });

        lblCarreraModifElim.setText("Carrera:");

        lblModif.setText("Modificar por:");

        javax.swing.GroupLayout jPanelModificarEliminarLayout = new javax.swing.GroupLayout(jPanelModificarEliminar);
        jPanelModificarEliminar.setLayout(jPanelModificarEliminarLayout);
        jPanelModificarEliminarLayout.setHorizontalGroup(
            jPanelModificarEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificarEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelModificarEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModificarEliminarLayout.createSequentialGroup()
                        .addGap(0, 232, Short.MAX_VALUE)
                        .addComponent(btnModificar)
                        .addGap(163, 163, 163)
                        .addComponent(btnEliminar))
                    .addGroup(jPanelModificarEliminarLayout.createSequentialGroup()
                        .addGroup(jPanelModificarEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblModif, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(lblCarreraModifElim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelModificarEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCarreraAModificar)
                            .addComponent(comboBoxCarrera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelModificarEliminarLayout.setVerticalGroup(
            jPanelModificarEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModificarEliminarLayout.createSequentialGroup()
                .addGroup(jPanelModificarEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelModificarEliminarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelModificarEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCarreraModifElim))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelModificarEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCarreraAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModif))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanelModificarEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(225, 225, 225))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelModificarEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(32, 32, 32)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreCarrera)
                    .addComponent(txtNombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addGap(17, 17, 17)
                .addComponent(jPanelModificarEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

            if (txtNombreCarrera.getText().equals("")) {
                Utilidades.msg(this, "El nombre de la carrera no puede estar vacío");
                txtNombreCarrera.requestFocus();
                return;
            }

            if (Utilidades.existe(con.getConexion(), "SELECT (1) FROM CARRERA WHERE NOMBRE = '" + txtNombreCarrera.getText() + "' ")) {

                Utilidades.msg(this, "No se puede ingresar porque la Carrera ya existe");

            } else {

                Carrera carrera = new Carrera(txtNombreCarrera.getText());

                daoCarrera.ingresarCarrera(carrera, con.getConexion());

                Utilidades.msg(this, "Carrera ingresada correctamente");

                txtNombreCarrera.setText("");
                        
                daoCarrera.llenarComboBoxCarrera(modeloComboBoxCarrera, con.getConexion());
                
                if (modeloComboBoxCarrera.getSize() > 0) {
                    comboBoxCarrera.setSelectedIndex(0);
                }  
                
                txtIdCarrera.setText("");
                txtCarreraAModificar.setText("");
            
            }

        } catch (NumberFormatException | SQLException e) {

            Utilidades.msg(this, "Error al ingresar la Carrera, ingrese nuevamente");
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
                Utilidades.msg(this, "Debe elegir una Carrera para modificar");
                comboBoxCarrera.requestFocus();
                return;
            }
            
            Carrera carrera = daoCarrera.obtenerDatosCarrera(comboBoxCarrera.getSelectedItem().toString(), con.getConexion());
            
            if (carrera != null) {
                
                txtIdCarrera.setText(String.valueOf(carrera.getIdCarrera()));
                                
                Carrera carreraModificada = new Carrera(
                Integer.valueOf(txtIdCarrera.getText()),
                txtCarreraAModificar.getText());

                daoCarrera.actualizaCarrera(carreraModificada, con.getConexion());

                Utilidades.msg(this, "Se actualizó correctamente la Carrera");
            
                txtNombreCarrera.setText("");
                        
                daoCarrera.llenarComboBoxCarrera(modeloComboBoxCarrera, con.getConexion());
                comboBoxCarrera.setSelectedIndex(0);
                txtIdCarrera.setText("");
                txtCarreraAModificar.setText("");
           
                
            } else {
                
                Utilidades.msg(this, "La carrera a modificar no puede ser vacía u ocurrió un error, "
                        + "selecione o ingrese un valor nuevamente");
                comboBoxCarrera.setSelectedIndex(0);
                txtIdCarrera.setText("");
                txtCarreraAModificar.setText("");
                txtNombreCarrera.setText("");
                
            }

        } catch (NumberFormatException | SQLException e) {

            Utilidades.msg(this, "Error: no se pudo actualizar la Carrera, ingrese nuevamente");
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
                Utilidades.msg(this, "Debe elegir una Carrera para eliminar");
                comboBoxCarrera.requestFocus();
                return;
            }
            
            Carrera carrera = daoCarrera.obtenerDatosCarrera(comboBoxCarrera.getSelectedItem().toString(), con.getConexion());

            if (carrera != null) {
                
                txtCarreraAModificar.setText(carrera.getNombreCarrera());
                txtIdCarrera.setText(String.valueOf(carrera.getIdCarrera()));
                
                daoCarrera.eliminarCarrera(carrera.getIdCarrera(), con.getConexion());

                Utilidades.msg(this, "Se eliminó la Carrera correctamente");
            
                txtNombreCarrera.setText("");
                        
                daoCarrera.llenarComboBoxCarrera(modeloComboBoxCarrera, con.getConexion());
                
                if (modeloComboBoxCarrera.getSize() > 0) {
                    comboBoxCarrera.setSelectedIndex(0);
                }
                
                txtIdCarrera.setText("");
                txtCarreraAModificar.setText("");
                
            } else {
                
                Utilidades.msg(this, "La carrera a eliminar no puede ser vacía u ocurrió un error, "
                        + "selecione o ingrese un valor nuevamente");
                
                if (modeloComboBoxCarrera.getSize() > 0) {
                    comboBoxCarrera.setSelectedIndex(0);
                }
                
                txtIdCarrera.setText("");
                txtCarreraAModificar.setText("");
                txtNombreCarrera.setText("");
                
            }

        } catch (NumberFormatException | SQLException e) {

            Utilidades.msg(this, "Error: no se pudo eliminar la Carrera, ingrese nuevamente");
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

        txtNombreCarrera.setText("");
                      
        if (modeloComboBoxCarrera.getSize() > 0) {
            comboBoxCarrera.setSelectedIndex(0);
        }
        txtIdCarrera.setText("");
        txtCarreraAModificar.setText("");

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void comboBoxCarreraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxCarreraItemStateChanged
        
        Conexion con = new Conexion();
        
        txtIdCarrera.setText("");
        txtCarreraAModificar.setText("");
        
        try {
            
            String carrera = comboBoxCarrera.getSelectedItem() != null ? comboBoxCarrera.getSelectedItem().toString() : null;
            
            if (carrera == null || carrera.equals("--")) {
                
                txtIdCarrera.setText("");
                txtCarreraAModificar.setText("");
                                
            } else {
                
               Carrera carreraSeleccionada = daoCarrera.obtenerDatosCarrera(carrera, con.getConexion());
            
               if (carreraSeleccionada != null) {
                   
                   txtIdCarrera.setText(String.valueOf(carreraSeleccionada.getIdCarrera()));
                   txtCarreraAModificar.setText(carreraSeleccionada.getNombreCarrera());
                   
               } else {
                   
                   txtIdCarrera.setText("");
                   
                   if (modeloComboBoxCarrera.getSize() > 0) {
                        comboBoxCarrera.setSelectedIndex(0);
                   }
                   
                   txtCarreraAModificar.setText("");
                   
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
        
    }//GEN-LAST:event_comboBoxCarreraItemStateChanged

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
            java.util.logging.Logger.getLogger(FrmABMcarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmABMcarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmABMcarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmABMcarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmABMcarrera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboBoxCarrera;
    private javax.swing.JPanel jPanelModificarEliminar;
    private javax.swing.JLabel lblCarreraModifElim;
    private javax.swing.JLabel lblModif;
    private javax.swing.JLabel lblNombreCarrera;
    private javax.swing.JTextField txtCarreraAModificar;
    private javax.swing.JTextField txtIdCarrera;
    private javax.swing.JTextField txtNombreCarrera;
    // End of variables declaration//GEN-END:variables

    private void inicializar() {
        
        Conexion con = new Conexion();
        
        daoCarrera = new DaoCarrera();
        
        try {
            
          txtNombreCarrera.setText("");
          
          txtCarreraAModificar.setText("");
                   
          daoCarrera.llenarComboBoxCarrera(modeloComboBoxCarrera, con.getConexion());
          
          if (modeloComboBoxCarrera.getSize() > 0) {
            comboBoxCarrera.setSelectedIndex(0);
          }
          
          txtIdCarrera.setText("");
          txtIdCarrera.setEditable(false);
          txtIdCarrera.setVisible(false);
         
        } catch (SQLException e) {
            
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

}
