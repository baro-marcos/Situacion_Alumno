/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escuela.DAOs;

import com.escuela.Entidades.Alumno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Marcos Baró
 */
public class DaoAlumno {
    
    public Alumno obtenerDatosAlumno(Integer dni, Connection con) {
                
        Alumno alumno = new Alumno();
        
        String consultaBusq = "SELECT AL.DNI, AL.NOMBRE, AL.APELLIDO, AL.TELEFONO, AL.MAIL, C.ID_CARRERA "
                + " FROM ALUMNO AL "
                + " INNER JOIN CARRERA C ON (AL.ID_CARRERA = C.ID_CARRERA) "
                + " WHERE DNI = " + dni;
        
        Statement stBusq = null;
        ResultSet rsBusq = null;
        
        try {
            
            stBusq = con.createStatement();
            rsBusq = stBusq.executeQuery(consultaBusq);
        
            if (rsBusq.next()) {
            
                alumno.setDniAlumno(rsBusq.getInt("DNI"));
                alumno.setNombreAlumno(rsBusq.getString("NOMBRE"));
                alumno.setApellidoAlumno(rsBusq.getString("APELLIDO"));
                alumno.setTelefonoAlumno(rsBusq.getString("TELEFONO"));
                alumno.setMailAlumno(rsBusq.getString("MAIL"));
                alumno.setIdCarrera(rsBusq.getInt("ID_CARRERA"));
            
            } else {
            
                alumno = null;
            
            }
            
        } catch (SQLException e) {
            
            alumno = null;
            
        } finally {
            
           try {
               
               if (rsBusq != null) {
                   
                   rsBusq.close();
                   
               }
               
               if (stBusq != null) {
               
                   stBusq.close();
               
                }
               
            } catch (SQLException ex) {
                
               alumno = null;               
                 
            }
               
        }
           
        return alumno;
                
    }
    
    public void ingresarAlumno(Alumno alumno, Connection con) throws SQLException {
        
        String sqlInsert = " INSERT INTO ALUMNO ( DNI, NOMBRE, APELLIDO, TELEFONO, MAIL, ID_CARRERA ) "
                        + " VALUES (?, ?, ?, ?, ?, ?) ";

        PreparedStatement psNuevo = null;
        
        try {
            
            psNuevo = con.prepareStatement(sqlInsert);
        
            psNuevo.setInt(1, alumno.getDniAlumno());
            psNuevo.setString(2, alumno.getNombreAlumno().toUpperCase());
            psNuevo.setString(3, alumno.getApellidoAlumno().toUpperCase());
            psNuevo.setString(4, alumno.getTelefonoAlumno());
            psNuevo.setString(5, alumno.getMailAlumno());
            psNuevo.setInt(6, alumno.getIdCarrera());
        
            psNuevo.executeUpdate();
            
        } finally {
            
            if (psNuevo != null) {
               
                psNuevo.close();
               
            }
            
        }
       
    }
    
    public void actualizaAlumno(Alumno alumno, Connection con) throws SQLException {
        
        String sqlupdate = " UPDATE ALUMNO SET NOMBRE = ?, "
                        + " APELLIDO = ?, TELEFONO = ?, MAIL = ?, ID_CARRERA = ? WHERE DNI = ? ";

        PreparedStatement psModif = null;
        
        try {
            
            psModif = con.prepareStatement(sqlupdate);
            
            psModif.setString(1, alumno.getNombreAlumno().toUpperCase());
            psModif.setString(2, alumno.getApellidoAlumno().toUpperCase());
            psModif.setString(3, alumno.getTelefonoAlumno());
            psModif.setString(4, alumno.getMailAlumno());
            psModif.setInt(5, alumno.getIdCarrera());
            psModif.setInt(6, alumno.getDniAlumno());
             
            psModif.executeUpdate();
            
        } finally {
            
            if (psModif != null) {
               
                psModif.close();
               
            }
            
        }
        
    }
    
    public void eliminarAlumno(Integer dni, Connection con) throws SQLException {
        
        String consultaElim = " DELETE FROM ALUMNO WHERE DNI = ? ";

        PreparedStatement psElim = null;
        
        try {
            
            psElim = con.prepareStatement(consultaElim);
            
            psElim.setInt(1, dni);
            
            psElim.executeUpdate();
            
        } finally {
            
            if (psElim != null) {
               
                psElim.close();
               
            }
            
        }
       
    }
    
}
