/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escuela.DAOs;

import com.escuela.DTOs.DTOcondicionAlumnoMateria;
import com.escuela.Entidades.CondicionAlumnoMateria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Marcos Baró
 */
public class DaoCondicionAlumnoMateria {
    
    public void ingresarCondicionAlumnoMateria(CondicionAlumnoMateria condicionAlumnoMateria, Connection con) throws SQLException {
        
        String sqlInsert = " INSERT INTO CONDICION_ALUMNO_MATERIA ( DNI, ID_CARRERA, ID_MATERIA, SITUACION ) "
                        + " VALUES ( ?, ?, ?, ? ) ";

        PreparedStatement psNuevo = null;
        
        try {
            
            psNuevo = con.prepareStatement(sqlInsert);
        
            psNuevo.setInt(1, condicionAlumnoMateria.getDniAlumno());
            psNuevo.setInt(2, condicionAlumnoMateria.getIdCarrrera());
            psNuevo.setInt(3, condicionAlumnoMateria.getIdMateria());
            psNuevo.setString(4, condicionAlumnoMateria.getSituacionAlumnoMateria());
                   
            psNuevo.executeUpdate();
            
        } finally {
            
            if (psNuevo != null) {
               
                psNuevo.close();
               
            }
            
        }
       
    }
    
    public void actualizarCondicionAlumnoMateria(CondicionAlumnoMateria condicionAlumnoMateria, Connection con) throws SQLException {
        
        String sqlupdate = " UPDATE CONDICION_ALUMNO_MATERIA SET SITUACION = ?, ID_MATERIA = ? "
                        + "  WHERE ID_CONDICION_ALUMNO_MATERIA = ? ";

        PreparedStatement psModif = null;
        
        try {
            
             if (con == null || con.isClosed()) {
            throw new SQLException("La conexión está cerrada o es nula.");
            }
            
            psModif = con.prepareStatement(sqlupdate);
            
            psModif.setString(1, condicionAlumnoMateria.getSituacionAlumnoMateria());
            psModif.setInt(2, condicionAlumnoMateria.getIdMateria());
            psModif.setInt(3, condicionAlumnoMateria.getIdCondicionAlumnoMateria());
                                     
            psModif.executeUpdate();
            
        } finally {
            
            if (psModif != null) {
               
                psModif.close();
               
            }
            
        }
        
    }
    
    public void eliminarSituacion(Integer idCondicionAlumnoMateria, 
            Connection con) throws SQLException {
        
        String consultaElim = " DELETE FROM CONDICION_ALUMNO_MATERIA WHERE ID_CONDICION_ALUMNO_MATERIA = ? ";

        PreparedStatement psElim = null;
        
        try {
            
            psElim = con.prepareStatement(consultaElim);
            
            psElim.setInt(1, idCondicionAlumnoMateria);
                        
            psElim.executeUpdate();
            
        } finally {
            
            if (psElim != null) {
               
                psElim.close();
               
            }
            
        }
       
    }
    
    public DTOcondicionAlumnoMateria obtenerInfoSituacion(Integer idCondicionAlumnoMateria, Connection con) throws SQLException {
        
        DTOcondicionAlumnoMateria condicion = new DTOcondicionAlumnoMateria();
        
        String consultaBusq = "SELECT CAM.DNI AS ALUMNO, CAM.ID_CONDICION_ALUMNO_MATERIA, "
                + " C.NOMBRE AS CARRERA, C.ID_CARRERA, M.NOMBRE AS MATERIA, M.ID_MATERIA, "
                + " CAM.SITUACION "
                + " FROM CONDICION_ALUMNO_MATERIA CAM "
                + " INNER JOIN CARRERA C ON (C.ID_CARRERA = CAM.ID_CARRERA) "
                + " INNER JOIN MATERIA M ON (M.ID_MATERIA = CAM.ID_MATERIA)"
                + " WHERE CAM.ID_CONDICION_ALUMNO_MATERIA = " + idCondicionAlumnoMateria;
                        
        Statement stBusq = null;
        ResultSet rsBusq = null;
        
        try {
            
            stBusq = con.createStatement();
            rsBusq = stBusq.executeQuery(consultaBusq);
        
            if (rsBusq.next()) {
            
                condicion.setDniAlumno(rsBusq.getInt("ALUMNO"));
                condicion.setIdCondicionAlumnoMateria(rsBusq.getInt("ID_CONDICION_ALUMNO_MATERIA"));
                condicion.setNombreCarrera(rsBusq.getString("CARRERA"));
                condicion.setIdCarrera(rsBusq.getInt("ID_CARRERA"));
                condicion.setNombreMateria(rsBusq.getString("MATERIA"));
                condicion.setIdMateria(rsBusq.getInt("ID_MATERIA"));
                condicion.setSituacionAlumnoMateria(rsBusq.getString("SITUACION"));
      
            }
            
        } finally {
            
            if (rsBusq != null) {
                   
                rsBusq.close();
                   
            }
               
            if (stBusq != null) {
               
                stBusq.close();
               
            }
            
        }
           
        return condicion;
        
    }
    
}
