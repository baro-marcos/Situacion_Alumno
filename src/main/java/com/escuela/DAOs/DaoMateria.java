/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escuela.DAOs;

import com.escuela.DTOs.DTOcondicionAlumnoMateria;
import com.escuela.Entidades.Materia;
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
public class DaoMateria {
    
    public void ingresarMateria(Materia materia, Connection con) throws SQLException {
        
        String sqlInsert = " INSERT INTO MATERIA ( NOMBRE, ID_CARRERA, TIPO ) "
                        + " VALUES ( ?, ?,? ) ";

        PreparedStatement psNuevo = null;
        
        try {
            
            psNuevo = con.prepareStatement(sqlInsert);
        
            psNuevo.setString(1, materia.getNombreMateria().toUpperCase());
            psNuevo.setInt(2, materia.getIdCarrera());
            psNuevo.setString(3, materia.getTipo());
                   
            psNuevo.executeUpdate();
            
        } finally {
            
            if (psNuevo != null) {
               
                psNuevo.close();
               
            }
            
        }
       
    }
    
    public void actualizaMateria(Materia materia, Connection con) throws SQLException {
        
        String sqlupdate = " UPDATE MATERIA SET NOMBRE = ?, ID_CARRERA = ?, TIPO = ? "
                        + "  WHERE ID_MATERIA = ? ";

        PreparedStatement psModif = null;
        
        try {
            
            psModif = con.prepareStatement(sqlupdate);
            
            psModif.setString(1, materia.getNombreMateria().toUpperCase());
            psModif.setInt(2, materia.getIdCarrera());
            psModif.setString(3, materia.getTipo());
            psModif.setInt(4, materia.getIdMateria());
                         
            psModif.executeUpdate();
            
        } finally {
            
            if (psModif != null) {
               
                psModif.close();
               
            }
            
        }
        
    }
    
    public void eliminarMateria(Integer id, Connection con) throws SQLException {
        
        String consultaElim = " DELETE FROM MATERIA WHERE ID_MATERIA = ? ";

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
    
    public Materia obtenerDatosMateria(String nomMateria, Connection con) {
                
        Materia materia = new Materia();
        
        String consultaBusq = "SELECT ID_MATERIA, NOMBRE, ID_CARRERA, TIPO "
                + " FROM MATERIA "
                + " WHERE NOMBRE = '" + nomMateria + "' ";
        
        Statement stBusq = null;
        ResultSet rsBusq = null;
        
        try {
            
            stBusq = con.createStatement();
            rsBusq = stBusq.executeQuery(consultaBusq);
        
            if (rsBusq.next()) {
            
                materia.setIdMateria(rsBusq.getInt("ID_MATERIA"));
                materia.setNombreMateria(rsBusq.getString("NOMBRE"));
                materia.setIdCarrera(rsBusq.getInt("ID_CARRERA"));
                materia.setTipo(rsBusq.getString("TIPO"));
           
            } else {
            
                materia = null;
            
            }
            
        } catch (SQLException e) {
            
            materia = null;
            
        } finally {
            
           try {
               
               if (rsBusq != null) {
                   
                   rsBusq.close();
                   
               }
               
               if (stBusq != null) {
               
                   stBusq.close();
               
                }
               
            } catch (SQLException ex) {
                
               materia = null;               
                 
            }
               
        }
           
        return materia;
                
    }
    
    public void llenarComboBoxMateriaIni(DefaultComboBoxModel modelo, Connection con) throws SQLException {
        
        String consulta = " SELECT NOMBRE FROM MATERIA ";
                
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
    
    public void llenarComboBoxMateriasCarrera(DefaultComboBoxModel modelo, Integer id, Connection con) throws SQLException {
        
        String consulta = " SELECT NOMBRE FROM MATERIA WHERE ID_CARRERA = " + id;
                
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
    
    public DTOcondicionAlumnoMateria obtenerDatosMateriaArendir(Connection con, Integer idCarrera, 
            Integer idMateria, Integer dni) {
                
        DTOcondicionAlumnoMateria datosMateria = new DTOcondicionAlumnoMateria();
        
        String consultaBusq = " SELECT CONCAT(A.APELLIDO, ' ', A.NOMBRE) AS NOM_ALUM, A.DNI AS DNI, "
                + " C.NOMBRE AS CARRERA, M.NOMBRE AS MATERIA, "
                + " CAM.SITUACION, M.TIPO "
                + " FROM CONDICION_ALUMNO_MATERIA CAM "
                + " INNER JOIN ALUMNO A ON (A.DNI = CAM.DNI) "
                + " INNER JOIN CARRERA C ON (C.ID_CARRERA = CAM.ID_CARRERA) "
                + " INNER JOIN MATERIA M ON (M.ID_MATERIA = CAM.ID_MATERIA)"
                + " WHERE A.DNI =  " + dni
                + " AND CAM.ID_CARRERA = " + idCarrera
                + " AND CAM.ID_MATERIA = " + idMateria;
                
        
        Statement stBusq = null;
        ResultSet rsBusq = null;
        
        try {
            
            stBusq = con.createStatement();
            rsBusq = stBusq.executeQuery(consultaBusq);
        
            if (rsBusq.next()) {
            
                datosMateria.setApellidoNombre(rsBusq.getString("NOM_ALUM"));
                datosMateria.setDniAlumno(rsBusq.getInt("DNI"));
                datosMateria.setNombreCarrera(rsBusq.getString("CARRERA"));
                datosMateria.setNombreMateria(rsBusq.getString("MATERIA"));
                datosMateria.setSituacionAlumnoMateria(rsBusq.getString("SITUACION"));
                datosMateria.setTipoMateria(rsBusq.getString("TIPO"));
           
            } else {
            
                datosMateria = null;
            
            }
            
        } catch (SQLException e) {
            
            datosMateria = null;
            
        } finally {
            
           try {
               
               if (rsBusq != null) {
                   
                   rsBusq.close();
                   
               }
               
               if (stBusq != null) {
               
                   stBusq.close();
               
                }
               
            } catch (SQLException ex) {
                
               datosMateria = null;               
                 
            }
               
        }
           
        return datosMateria;
                
    }
    
    public DTOcondicionAlumnoMateria obtenerDatosMateriaAcursar(Connection con, Integer idCarrera, 
            Integer idMateria, Integer dni) {
                
        DTOcondicionAlumnoMateria datosMateria = new DTOcondicionAlumnoMateria();
        
        String consultaBusq = " SELECT CONCAT(A.APELLIDO, ' ', A.NOMBRE) AS NOM_ALUM, A.DNI AS DNI, "
                + " C.NOMBRE AS CARRERA, M.NOMBRE AS MATERIA, "
                + " CAM.SITUACION, M.TIPO "
                + " FROM CONDICION_ALUMNO_MATERIA CAM "
                + " INNER JOIN ALUMNO A ON (A.DNI = CAM.DNI) "
                + " INNER JOIN CARRERA C ON (C.ID_CARRERA = CAM.ID_CARRERA) "
                + " INNER JOIN MATERIA M ON (M.ID_MATERIA = CAM.ID_MATERIA)"
                + " WHERE A.DNI =  " + dni
                + " AND C.ID_CARRERA = " + idCarrera
                + " AND M.ID_MATERIA = " + idMateria;
                
        
        Statement stBusq = null;
        ResultSet rsBusq = null;
        
        try {
            
            stBusq = con.createStatement();
            rsBusq = stBusq.executeQuery(consultaBusq);
        
            if (rsBusq.next()) {
            
                datosMateria.setApellidoNombre(rsBusq.getString("NOM_ALUM"));
                datosMateria.setDniAlumno(rsBusq.getInt("DNI"));
                datosMateria.setNombreCarrera(rsBusq.getString("CARRERA"));
                datosMateria.setNombreMateria(rsBusq.getString("MATERIA"));
                datosMateria.setSituacionAlumnoMateria(rsBusq.getString("SITUACION"));
                datosMateria.setTipoMateria(rsBusq.getString("TIPO"));
           
            } else {
            
                datosMateria = null;
            
            }
            
        } catch (SQLException e) {
            
            datosMateria = null;
            
        } finally {
            
           try {
               
               if (rsBusq != null) {
                   
                   rsBusq.close();
                   
               }
               
               if (stBusq != null) {
               
                   stBusq.close();
               
                }
               
            } catch (SQLException ex) {
                
               datosMateria = null;               
                 
            }
               
        }
           
        return datosMateria;
                
    }
    
}
