/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia7.mo.eje01;

import Entidad.Persona;
import Servicio.ServicioPersona;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioPersona ps = new ServicioPersona();
        Persona p1 = ps.CrearPersona();
        
        
        System.out.println(p1);
        ps.ModificoEdad(p1);
        System.out.println(p1);


        
    }
    
}
