/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escuela.Entidades;

/**
 *
 * @author Marcos Baró
 */
public class Alumno {
    
    private Integer dniAlumno;
    private String nombreAlumno;
    private String apellidoAlumno;
    private String telefonoAlumno;
    private String mailAlumno;
    private Integer idCarrera;
    
    //Constructores
    public Alumno() {
        
    }

    public Alumno(Integer dniAlumno, String nombreAlumno, String apellidoAlumno, String telefonoAlumno, String mailAlumno, Integer idCarrera) {
        this.dniAlumno = dniAlumno;
        this.nombreAlumno = nombreAlumno;
        this.apellidoAlumno = apellidoAlumno;
        this.telefonoAlumno = telefonoAlumno;
        this.mailAlumno = mailAlumno;
        this.idCarrera = idCarrera;
    }

    public Integer getDniAlumno() {
        return dniAlumno;
    }

    public void setDniAlumno(Integer dniAlumno) {
        this.dniAlumno = dniAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }
    
    public String getApellidoAlumno() {
        return apellidoAlumno;
    }

    public void setApellidoAlumno(String apellidoAlumno) {
        this.apellidoAlumno = apellidoAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getTelefonoAlumno() {
        return telefonoAlumno;
    }

    public void setTelefonoAlumno(String telefonoAlumno) {
        this.telefonoAlumno = telefonoAlumno;
    }

    public String getMailAlumno() {
        return mailAlumno;
    }

    public void setMailAlumno(String mailAlumno) {
        this.mailAlumno = mailAlumno;
    }

    public Integer getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }
      
}
