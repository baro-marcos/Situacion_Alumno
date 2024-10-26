/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escuela.DAOs;

import com.escuela.Entidades.Carrera;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Marcos Baró
 */
public class DaoCarrera {
    
    public void llenarComboBoxCarrera(DefaultComboBoxModel modelo, Connection con) throws SQLException {
        
        String consulta = " SELECT NOMBRE FROM CARRERA ";
                
        Statement st = null;
        ResultSet rs = null;
        
        try {
            
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            
            // Limpiar el modelo antes de llenarlo
            modelo.removeAllElements();
            
            modelo.addElement("--");
        
            while (rs.next()) {
            
                String nombre = rs.getString("NOMBRE");
                modelo.addElement(nombre);
            }
            
        } finally {
            
            if (rs != null) {
                   
                rs.close();
                   
            }
               
            if (st != null) {
               
                st.close();
               
            }
            
        }
               
    }
    
    public String obtenerItemComboBoxCarrera(Integer idCarrera, Connection con) {
        
        String itemComboBox = null;
        
        Statement st = null;
        ResultSet rs = null;
        
        try {
                        
            String consulta = " SELECT NOMBRE FROM CARRERA WHERE ID_CARRERA = " + idCarrera;
                       
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            
            if (rs.next()) {
                
                itemComboBox = rs.getString("NOMBRE");
                
            }
            
        } catch (SQLException ex) {
            
            itemComboBox = null;
            
        } finally {
            
            try {
               
               if (rs != null) {
                   
                   rs.close();
                   
               }
               
               if (st != null) {
               
                   st.close();
               
                }
               
            } catch (SQLException ex) {
                
               itemComboBox = null;              
                 
            }
            
        }
        
        return itemComboBox;
        
    }
    
    public Integer obtenerIdCarreraSeleccionada( String carrera, Connection con) {
        
        Integer idCarrera = null;
        
        Statement st = null;
        ResultSet rs = null;
        
        try {
            
            String consulta = " SELECT ID_CARRERA FROM CARRERA WHERE NOMBRE = '" + carrera + "' ";
                       
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            
            if (rs.next()) {
                
                idCarrera = rs.getInt("ID_CARRERA");
                
            }
            
        } catch (SQLException ex) {
            
            idCarrera = null;
            
        } finally {
            
            try {
               
               if (rs != null) {
                   
                   rs.close();
                   
               }
               
               if (st != null) {
               
                   st.close();
               
                }
               
            } catch (SQLException ex) {
                
               idCarrera = null;              
                 
            }
            
        }
        
        return idCarrera;
        
    }
    
    public void ingresarCarrera(Carrera carrera, Connection con) throws SQLException {
        
        String sqlInsert = " INSERT INTO CARRERA ( NOMBRE ) "
                        + " VALUES ( ? ) ";

        PreparedStatement psNuevo = null;
        
        try {
            
            psNuevo = con.prepareStatement(sqlInsert);
        
            psNuevo.setString(1, carrera.getNombreCarrera().toUpperCase());
                   
            psNuevo.executeUpdate();
            
        } finally {
            
            if (psNuevo != null) {
               
                psNuevo.close();
               
            }
            
        }
       
    }
    
    public void actualizaCarrera(Carrera carrera, Connection con) throws SQLException {
        
        String sqlupdate = " UPDATE CARRERA SET NOMBRE = ? "
                        + "  WHERE ID_CARRERA = ? ";

        PreparedStatement psModif = null;
        
        try {
            
            psModif = con.prepareStatement(sqlupdate);
            
            psModif.setString(1, carrera.getNombreCarrera().toUpperCase());
            psModif.setInt(2, carrera.getIdCarrera());
                         
            psModif.executeUpdate();
            
        } finally {
            
            if (psModif != null) {
               
                psModif.close();
               
            }
            
        }
        
    }
    
    public void eliminarCarrera(Integer id, Connection con) throws SQLException {
        
        String consultaElim = " DELETE FROM CARRERA WHERE ID_CARRERA = ? ";

        PreparedStatement psElim = null;
        
        try {
            
            psElim = con.prepareStatement(consultaElim);
            
            psElim.setInt(1, id);
            
            psElim.executeUpdate();
            
        } finally {
            
            if (psElim != null) {
               
                psElim.close();
               
            }
            
        }
       
    }
    
    public Carrera obtenerDatosCarrera(String nomCarrera, Connection con) {
                
        Carrera carrera = new Carrera();
        
        String consultaBusq = "SELECT ID_CARRERA, NOMBRE "
                + " FROM CARRERA "
                + " WHERE NOMBRE = '" + nomCarrera + "' ";
        
        Statement stBusq = null;
        ResultSet rsBusq = null;
        
        try {
            
            stBusq = con.createStatement();
            rsBusq = stBusq.executeQuery(consultaBusq);
        
            if (rsBusq.next()) {
            
                carrera.setIdCarrera(rsBusq.getInt("ID_CARRERA"));
                carrera.setNombreCarrera(rsBusq.getString("NOMBRE"));
           
            } else {
            
                carrera = null;
            
            }
            
        } catch (SQLException e) {
            
            carrera = null;
            
        } finally {
            
           try {
               
               if (rsBusq != null) {
                   
                   rsBusq.close();
                   
               }
               
               if (stBusq != null) {
               
                   stBusq.close();
               
                }
               
            } catch (SQLException ex) {
                
               carrera = null;               
                 
            }
               
        }
           
        return carrera;
                
    }
    
}
