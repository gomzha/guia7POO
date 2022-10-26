/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author A308443
 */
public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        Persona per = new Persona();
        String sexo;
        boolean sexoCorrect = false;

        System.out.println("Ingrese nombre");
        per.setNombre(leer.next());

        do {
            System.out.println("Ingrese sexo(M/H/O)");
            sexo = leer.next();
            if (sexo.equals("H") || sexo.equals("M") || sexo.equals("O")) {
                sexoCorrect = true;
            }else System.out.println("Sexo mal ingresado ");
        } while (!sexoCorrect);

        per.setNombre(sexo);

        System.out.println("Ingrese edad");
        per.setEdad(leer.nextInt());
        System.out.println("Ingrese peso");
        per.setPeso(leer.nextDouble());
        System.out.println("Ingrese altura");
        per.setAltura(leer.nextDouble());
        return per;

    }
    
    public int calcularIMC(Persona per){
        
        if(per.getPeso()/(Math.pow(per.getAltura(),2)) <20){
            return -1;
        }else if(per.getPeso()/(Math.pow(per.getAltura(),2)) >= 20 && (per.getPeso()/(Math.pow(per.getAltura(),2)) <= 25)){
            return 0;
        } else return 1;
    }
    
        public boolean esMayorDeEdad(Persona per){
        
        return per.getEdad() >= 18;
      
    }

}
