/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escuela.Entidades;

/**
 *
 * @author Marcos Baró
 */
public class CondicionAlumnoMateria {
    
    private Integer idCondicionAlumnoMateria;
    private Integer dniAlumno;
    private Integer idCarrrera;
    private Integer idMateria;
    private String situacionAlumnoMateria;
    
    //Constructores

    public CondicionAlumnoMateria() {
    }
    
    public CondicionAlumnoMateria(Integer dniAlumno, Integer idCarrrera, Integer idMateria, String situacionAlumnoMateria) {
        this.dniAlumno = dniAlumno;
        this.idCarrrera = idCarrrera;
        this.idMateria = idMateria;
        this.situacionAlumnoMateria = situacionAlumnoMateria;
    }

    public CondicionAlumnoMateria(Integer idCondicionAlumnoMateria, Integer dniAlumno, Integer idCarrrera, Integer idMateria, String situacionAlumnoMateria) {
        this.idCondicionAlumnoMateria = idCondicionAlumnoMateria;
        this.dniAlumno = dniAlumno;
        this.idCarrrera = idCarrrera;
        this.idMateria = idMateria;
        this.situacionAlumnoMateria = situacionAlumnoMateria;
    }

    public Integer getIdCondicionAlumnoMateria() {
        return idCondicionAlumnoMateria;
    }

    public void setIdCondicionAlumnoMateria(Integer idCondicionAlumnoMateria) {
        this.idCondicionAlumnoMateria = idCondicionAlumnoMateria;
    }

    public Integer getDniAlumno() {
        return dniAlumno;
    }

    public void setDniAlumno(Integer dniAlumno) {
        this.dniAlumno = dniAlumno;
    }

    public Integer getIdCarrrera() {
        return idCarrrera;
    }

    public void setIdCarrrera(Integer idCarrrera) {
        this.idCarrrera = idCarrrera;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public String getSituacionAlumnoMateria() {
        return situacionAlumnoMateria;
    }

    public void setSituacionAlumnoMateria(String situacionAlumnoMateria) {
        this.situacionAlumnoMateria = situacionAlumnoMateria;
    }
    
}
