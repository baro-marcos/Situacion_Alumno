/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.escuela.Formularios;

import com.escuela.Utilidades.Conexion;
import com.escuela.Utilidades.Utilidades;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcos Baró
 */
public class FrmReporteEstadoMaterias extends javax.swing.JDialog {
       
    private Integer idCarrera;
    private Integer DNIalumno;
    private Integer idMateria;
              
    private DefaultTableModel modelReporte = new DefaultTableModel();

    /**
     * Creates new form FrmReporte
     */
    public FrmReporteEstadoMaterias(java.awt.Frame parent, boolean modal) {
        super(parent, modal);        
    }
    
    public FrmReporteEstadoMaterias(Integer idCarrera, Integer DNIalumno, Integer idMateria) {
        
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.idCarrera = idCarrera;
        this.DNIalumno = DNIalumno;
        this.idMateria = idMateria;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
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

        panelReporte = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReporte = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte Alumno");

        panelReporte.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Reporte"));

        tblReporte.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblReporte);

        javax.swing.GroupLayout panelReporteLayout = new javax.swing.GroupLayout(panelReporte);
        panelReporte.setLayout(panelReporteLayout);
        panelReporteLayout.setHorizontalGroup(
            panelReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReporteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelReporteLayout.setVerticalGroup(
            panelReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReporteLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

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
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(panelReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmReporteEstadoMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReporteEstadoMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReporteEstadoMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReporteEstadoMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmReporteEstadoMaterias dialog = new FrmReporteEstadoMaterias(new javax.swing.JFrame(), true);
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
        
        try {
            
            tblReporte.setModel(modelReporte);
            tblReporte.getTableHeader().setReorderingAllowed(false);
            
            llenarTabla(con.getConexion()); 
            
        } catch (Exception ex) {
            
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
    
    private void crearModeloTabla() {
        
        modelReporte = (new DefaultTableModel(null,
                //Títulos    
                new String[]{"Alumno", "DNI", "Carrera", "Materia", "Tipo", "Estado"}) {

            //Celdas editables
            boolean[] canEdit = new boolean[]{false, false, false, false, false, false};

            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return canEdit[colIndex];
            }

        });
    }
    
    private void llenarTabla(Connection con) {
        
        String consulta = " SELECT CONCAT(A.APELLIDO, ' ', A.NOMBRE) AS NOM_ALU, A.DNI AS DNI_ALU, C.NOMBRE AS NOM_CARRERA, M.NOMBRE AS NOM_MATERIA, "
                + " S.SITUACION AS ESTADO, M.TIPO "
                + " FROM CONDICION_ALUMNO_MATERIA S "
                + " INNER JOIN ALUMNO A ON (A.DNI = S.DNI) "
                + " INNER JOIN CARRERA C ON (C.ID_CARRERA = S.ID_CARRERA) "
                + " INNER JOIN MATERIA M ON (M.ID_MATERIA = S.ID_MATERIA) "
                + " WHERE S.DNI = " + DNIalumno  
                + " AND S.ID_CARRERA = " + idCarrera ;
                
                if (idMateria != null) {
                   consulta +=  " AND S.ID_MATERIA = " + idMateria ; 
                }
                
                consulta += " ORDER BY C.NOMBRE, M.NOMBRE ";
        
        int nroColumnas = 6;
        
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
                modelReporte.addRow(fila);
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelReporte;
    private javax.swing.JTable tblReporte;
    // End of variables declaration//GEN-END:variables
}
