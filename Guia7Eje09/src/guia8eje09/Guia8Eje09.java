/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package guia8eje09;

import Entidad.Matematica;
import Servicio.ServicioMatematica;

/**
 *
 * @author A308443
 */
public class Guia8Eje09 {

    public static void main(String[] args) {
        System.out.println("mate: ");

        ServicioMatematica serviceMat = new ServicioMatematica();
        Matematica mate = serviceMat.cargarNum();
        System.out.println("mate: " + mate.toString());

        serviceMat.devolverMayor(mate);
        serviceMat.calcularPotencia(mate);
        serviceMat.calculaRaiz(mate);
        

    }

}
