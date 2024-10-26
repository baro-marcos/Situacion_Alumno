/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escuela.DAOs;

import com.escuela.DTOs.DTOcondicionAlumnoMateria;
import com.escuela.Entidades.MateriaCorrelatividad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcos Baró
 */
public class DaoCorrelatividadMateria {
    
    public void ingresarCorrelativa(MateriaCorrelatividad materiaCorrelatividad, Connection con) throws SQLException {
        
        String sqlInsert = " INSERT INTO MATERIA_CORRELATIVIDAD ( ID_CARRERA, ID_MATERIA, ID_MATERIA_CORRELATIVA ) "
                        + " VALUES ( ?, ?, ? ) ";

        PreparedStatement psNuevo = null;
        
        try {
            
            psNuevo = con.prepareStatement(sqlInsert);
        
            psNuevo.setInt(1, materiaCorrelatividad.getIdCarrerra());
            psNuevo.setInt(2, materiaCorrelatividad.getIdMateria());
            psNuevo.setInt(3, materiaCorrelatividad.getIdMateriaCorrelativa());
                   
            psNuevo.executeUpdate();
            
        } finally {
            
            if (psNuevo != null) {
               
                psNuevo.close();
               
            }
            
        }
       
    }
    
    public void eliminarCorrelatividad(Integer idMateriaCorrelatividad, 
            Connection con) throws SQLException {
        
        String consultaElim = " DELETE FROM MATERIA_CORRELATIVIDAD WHERE ID_CORRELATIVIDAD_MATERIA = ?";

        PreparedStatement psElim = null;
        
        try {
            
            psElim = con.prepareStatement(consultaElim);
            
            psElim.setInt(1, idMateriaCorrelatividad);
                        
            psElim.executeUpdate();
            
        } finally {
            
            if (psElim != null) {
               
                psElim.close();
               
            }
            
        }
       
    }
    
    public List<DTOcondicionAlumnoMateria> obtenerMateriasCorrelativas(Connection con, Integer idCarrera, 
            Integer idMateria, Integer dni) {
        
        List<DTOcondicionAlumnoMateria> datosMaterias = new ArrayList<DTOcondicionAlumnoMateria>();
        
        String consultaBusq = " SELECT COR.ID_MATERIA_CORRELATIVA, M.NOMBRE AS MATERIA, "
                + " CAM.SITUACION "
                + " FROM MATERIA_CORRELATIVIDAD COR "
                + " INNER JOIN CONDICION_ALUMNO_MATERIA CAM ON (CAM.ID_MATERIA = COR.ID_MATERIA_CORRELATIVA) "
                + " INNER JOIN MATERIA M ON (M.ID_MATERIA = COR.ID_MATERIA_CORRELATIVA)"
                + " WHERE CAM.DNI =  " + dni
                + " AND COR.ID_CARRERA = " + idCarrera
                + " AND COR.ID_MATERIA = " + idMateria;
                
        
        Statement stBusq = null;
        ResultSet rsBusq = null;
        
        try {
            
            stBusq = con.createStatement();
            rsBusq = stBusq.executeQuery(consultaBusq);
        
            while (rsBusq.next()) {
                
                DTOcondicionAlumnoMateria dato = new DTOcondicionAlumnoMateria();
            
                dato.setIdMateriaCorrelativa(rsBusq.getInt("ID_MATERIA_CORRELATIVA"));
                dato.setNombreMateriaCorrelativa(rsBusq.getString("MATERIA"));
                dato.setSituacionAlumnoMateria(rsBusq.getString("SITUACION"));
                
                datosMaterias.add(dato);
                           
            }
            
        } catch (SQLException e) {
            
            datosMaterias = null;
            
        } finally {
            
           try {
               
               if (rsBusq != null) {
                   
                   rsBusq.close();
                   
               }
               
               if (stBusq != null) {
               
                   stBusq.close();
               
                }
               
            } catch (SQLException ex) {
                
               datosMaterias = null;               
                 
            }
               
        }
           
        return datosMaterias;
       
    }
  
}
