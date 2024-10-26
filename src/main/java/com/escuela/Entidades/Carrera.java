/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escuela.Entidades;

/**
 *
 * @author Marcos Baró
 */
public class Carrera {
    
    private Integer idCarrera;
    private String nombreCarrera;
    
    //Constructores
    
    public Carrera() {
        
    }
    
    public Carrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public Carrera(Integer idCarrera, String nombreCarrera) {
        this.idCarrera = idCarrera;
        this.nombreCarrera = nombreCarrera;
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
   
}
