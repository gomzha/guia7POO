/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.time.LocalDate;
import java.util.Date;

public class Persona {
    
    private String nombre;
    private LocalDate fechaNaci;

    public Persona() {
    }

    public Persona(String nombre, LocalDate fechaNaci) {
        this.nombre = nombre;
        this.fechaNaci = fechaNaci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNaci() {
        return fechaNaci;
    }

    public void setFechaNaci(LocalDate fechaNaci) {
        this.fechaNaci = fechaNaci;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNaci=" + fechaNaci + '}';
    }

    
    
    
}
