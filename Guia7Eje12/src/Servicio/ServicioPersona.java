/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author A308443
 */
public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        int anio, mes, dia;
        Persona per = new Persona();
        System.out.println("Ingrese nombre");
        per.setNombre(leer.next());

        System.out.println("Ingrese el año de nacimiento: ");
        anio = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento: ");
        mes = leer.nextInt();
        System.out.println("Ingrese el día de nacimiento: ");
        dia = leer.nextInt();
        LocalDate fechaNaci = LocalDate.of(anio, mes, dia);

        System.out.println("fecha: " + fechaNaci);

        per.setFechaNaci(fechaNaci);

        return per;
    }

    public int calcularEdad(Persona objPer) {
        int edad;
        System.out.println("hola");
        LocalDate fechaHoy = LocalDate.now();


        LocalDate fechaNacimiento = LocalDate.of(objPer.getFechaNaci().getYear(), objPer.getFechaNaci().getMonth(), objPer.getFechaNaci().getDayOfMonth());
        edad = (Period.between(fechaNacimiento, fechaHoy).getYears());
        System.out.println("Tiene una edad de: " + edad);
        return edad;
    }
    
    public void menorQue(Persona objPersona, int edadPropia){
        int edadOtraPer; 
        System.out.println("Ingrese la edad de la otra persona");
        edadOtraPer = leer.nextInt();
        if (edadPropia < edadOtraPer){
            System.out.println("La persona " + objPersona.getNombre() + " cargada anteriormente es menor");
            
        }else System.out.println("La persona cargada " + objPersona.getNombre() + " anteriormente es mayor");
        
        
    }

}
