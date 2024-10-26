/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escuela.Entidades;

/**
 *
 * @author Marcos Baró
 */
public class Materia {
    
    private Integer idMateria;
    private String nombreMateria;
    private Integer idCarrera;
    private String tipo;
    
    //Constructores

    public Materia() {
    }

    public Materia(Integer idMateria, String nombreMateria, Integer idCarrera, String tipo) {
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
        this.idCarrera = idCarrera;
        this.tipo = tipo;
    }
    
    public Materia(String nombreMateria, Integer idCarrera, String tipo) {
        this.nombreMateria = nombreMateria;
        this.idCarrera = idCarrera;
        this.tipo = tipo;
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

    public Integer getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
  
}
