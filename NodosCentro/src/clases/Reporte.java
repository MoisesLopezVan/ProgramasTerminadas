/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;

/**
 *
 * @author MoisesDario
 */
public class Reporte implements Serializable{
    private Integer id;
    private String nombre;
    private String descripcion;
    private Integer id_reportepadre;
    
    public Reporte(){
        
    }

    public Reporte(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getId_reportepadre() {
        return id_reportepadre;
    }

    public void setId_reportepadre(Integer id_reportepadre) {
        this.id_reportepadre = id_reportepadre;
    }
    
}
