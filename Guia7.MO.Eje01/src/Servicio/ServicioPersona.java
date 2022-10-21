package Servicio;

import Entidad.Persona;
import java.util.Scanner;

// el servicio este se encarga de generar acciones sobre los atributos de la clase Persona
public class ServicioPersona {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");

    
     public Persona CrearPersona() {
         Persona perCompleta = new Persona();
         
         System.out.println("Ingrese su nombre: ");
         perCompleta.setNombre(leer.next());
         System.out.println("Ingrese su DNI: ");
         perCompleta.setDni(leer.nextDouble());
         System.out.println("Ingrese su fecha de nacimiento: ");
         perCompleta.setFechaNaci(leer.next());
         
         return perCompleta;
                 
    }
     
     public void ModificoEdad(Persona p1){
         
         System.out.println("Ingrese nueva fecha: ");
         p1.setFechaNaci(leer.next());
         
     }
    
    
    
    
}
