package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author A308443
 */
public class ServicioRectangulo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo crearRectangulo() {
        Rectangulo rec = new Rectangulo();

        System.out.println("Ingrese base: ");
        rec.setBase(leer.nextDouble());

        System.out.println("Ingrese altura: ");
        rec.setAltura(leer.nextDouble());

        return rec;
    }

    public void calcularArea(double altura, double base) {
        System.out.println("entra");

        System.out.println("altura " + altura);
        System.out.println("base " + base);

        System.out.println("El area es: " + (altura * base));
    }

    public void calcularPerimetro(Rectangulo rec1) {
        System.out.println("El perímetro es: " + (rec1.getAltura() * 2 + rec1.getBase() * 2));
    }

    public void dibujarRectangulo(double altura, double base) {
        
        for(int i = 0 ; i<altura;i++){
            for(int j = 0 ; j<base ; j++){
                System.out.print("*");
            }
                            System.out.println("");

        }
        
        
    }

}
