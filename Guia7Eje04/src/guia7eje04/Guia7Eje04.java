/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2
 */
package guia7eje04;

import Entidad.Rectangulo;
import Servicio.ServicioRectangulo;

/**
 *
 * @author A308443
 */
public class Guia7Eje04 {


    public static void main(String[] args) {
        
        ServicioRectangulo serviRec = new ServicioRectangulo();
        Rectangulo rec = serviRec.crearRectangulo();
        
                        System.out.println("ALTRURA " + rec.getAltura());
                System.out.println("BASE " + rec.getBase());
        
        serviRec.calcularArea(rec.getAltura(),rec.getBase());
        serviRec.calcularPerimetro(rec);  //PASO POR OBJETO
        serviRec.dibujarRectangulo(rec.getAltura(),rec.getBase());

    }
    
}
