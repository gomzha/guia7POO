/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia7eje12;

import Entidad.Persona;
import Servicio.ServicioPersona;

/**
 *
 * @author A308443
 */
public class Guia7Eje12 {

    public static void main(String[] args) {
        
        ServicioPersona servPer = new ServicioPersona();
        Persona per = servPer.crearPersona();
        System.out.println("la fecha es: " + per.getFechaNaci());
        servPer.menorQue(per,servPer.calcularEdad(per));


    }
    
}
