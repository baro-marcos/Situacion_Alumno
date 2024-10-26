/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escuela.DTOs;

/**
 *
 * @author Marcos Baró
 */
public class DTOcondicionAlumnoMateria {
    
    private Integer idCondicionAlumnoMateria;
    private Integer dniAlumno;
    private Integer idCarrera;
    private String nombreCarrera;
    private Integer idMateria;
    private String nombreMateria;
    private String situacionAlumnoMateria;
    private Integer idMateriaCorrelativa;
    private String nombreMateriaCorrelativa;
    private String apellidoNombre;
    private String tipoMateria;

    public DTOcondicionAlumnoMateria() {
    }

    public DTOcondicionAlumnoMateria(Integer idCondicionAlumnoMateria, Integer dniAlumno, Integer idCarrera, String nombreCarrera, Integer idMateria, String nombreMateria, String situacionAlumnoMateria, Integer idMateriaCorrelativa, String nombreMateriaCorrelativa, String apellidoNombre, String tipoMateria) {
        this.idCondicionAlumnoMateria = idCondicionAlumnoMateria;
        this.dniAlumno = dniAlumno;
        this.idCarrera = idCarrera;
        this.nombreCarrera = nombreCarrera;
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
        this.situacionAlumnoMateria = situacionAlumnoMateria;
        this.idMateriaCorrelativa = idMateriaCorrelativa;
        this.nombreMateriaCorrelativa = nombreMateriaCorrelativa;
        this.apellidoNombre = apellidoNombre;
        this.tipoMateria = tipoMateria;
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

    public Integer getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getSituacionAlumnoMateria() {
        return situacionAlumnoMateria;
    }

    public void setSituacionAlumnoMateria(String situacionAlumnoMateria) {
        this.situacionAlumnoMateria = situacionAlumnoMateria;
    }

    public Integer getIdMateriaCorrelativa() {
        return idMateriaCorrelativa;
    }

    public void setIdMateriaCorrelativa(Integer idMateriaCorrelativa) {
        this.idMateriaCorrelativa = idMateriaCorrelativa;
    }

    public String getNombreMateriaCorrelativa() {
        return nombreMateriaCorrelativa;
    }

    public void setNombreMateriaCorrelativa(String nombreMateriaCorrelativa) {
        this.nombreMateriaCorrelativa = nombreMateriaCorrelativa;
    }

    public String getApellidoNombre() {
        return apellidoNombre;
    }

    public void setApellidoNombre(String apellidoNombre) {
        this.apellidoNombre = apellidoNombre;
    }

    public String getTipoMateria() {
        return tipoMateria;
    }

    public void setTipoMateria(String tipoMateria) {
        this.tipoMateria = tipoMateria;
    }
 
}
