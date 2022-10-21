package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;


public class ServicioCircunferencia {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    
    public Circunferencia crearCircunferencia(){

        System.out.println("Ingrese el radio: ");
        Circunferencia c1 = new Circunferencia(leer.nextDouble());

        return c1;
    }

    public void area(double radio) {
        System.out.println("Area: " + (Math.PI * (radio*radio)));
        
    }
    public void perimetro(double radio) {
        System.out.println("Perimetro: " + (2 * Math.PI * radio));
        
    }

    
}
