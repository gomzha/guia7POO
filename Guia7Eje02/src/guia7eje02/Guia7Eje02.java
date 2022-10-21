/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 */
package guia7eje02;

import Entidad.Circunferencia;
import Servicio.ServicioCircunferencia;

public class Guia7Eje02 {


    public static void main(String[] args) {

        ServicioCircunferencia servCir = new ServicioCircunferencia();
        Circunferencia circu = servCir.crearCircunferencia();
        
        servCir.area(circu.getRadio());
        servCir.perimetro(circu.getRadio());

    }
    
}
