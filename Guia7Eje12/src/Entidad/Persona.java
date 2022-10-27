/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Date;

public class Persona {
    
    private String nombre;
    private Date fechaNaci;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNaci) {
        this.nombre = nombre;
        this.fechaNaci = fechaNaci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNaci() {
        return fechaNaci;
    }

    public void setFechaNaci(Date fechaNaci) {
        this.fechaNaci = fechaNaci;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNaci=" + fechaNaci + '}';
    }
    
    
    
}
