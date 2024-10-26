/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escuela.Entidades;

/**
 *
 * @author Marcos Baró
 */
public class MateriaCorrelatividad {
    
    private Integer idMateriaCorrelatividad;
    private Integer idCarrerra;
    private Integer idMateria;
    private Integer idMateriaCorrelativa;
    
    //Constructores

    public MateriaCorrelatividad() {
    }

    public MateriaCorrelatividad(Integer idMateriaCorrelatividad, Integer idCarrerra, Integer idMateria, Integer idMateriaCorrelativa) {
        this.idMateriaCorrelatividad = idMateriaCorrelatividad;
        this.idCarrerra = idCarrerra;
        this.idMateria = idMateria;
        this.idMateriaCorrelativa = idMateriaCorrelativa;
    }
    
    public MateriaCorrelatividad(Integer idCarrerra, Integer idMateria, Integer idMateriaCorrelativa) {
        this.idCarrerra = idCarrerra;
        this.idMateria = idMateria;
        this.idMateriaCorrelativa = idMateriaCorrelativa;
    }

    public Integer getIdMateriaCorrelatividad() {
        return idMateriaCorrelatividad;
    }

    public void setIdMateriaCorrelatividad(Integer idMateriaCorrelatividad) {
        this.idMateriaCorrelatividad = idMateriaCorrelatividad;
    }

    public Integer getIdCarrerra() {
        return idCarrerra;
    }

    public void setIdCarrerra(Integer idCarrerra) {
        this.idCarrerra = idCarrerra;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public Integer getIdMateriaCorrelativa() {
        return idMateriaCorrelativa;
    }

    public void setIdMateriaCorrelativa(Integer idMateriaCorrelativa) {
        this.idMateriaCorrelativa = idMateriaCorrelativa;
    }
   
}
