/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package guia7eje07;

import Entidad.Persona;
import Servicio.ServicioPersona;

/**
 *
 * @author A308443
 */
public class Guia7Eje07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int debajoPeso = 0, pesoIdea = 0, pesoPorEncima = 0, menorEdad = 0, mayorEdad = 0;

        ServicioPersona serviPer = new ServicioPersona();
        Persona p1 = serviPer.crearPersona();
        Persona p2 = serviPer.crearPersona();
        Persona p3 = serviPer.crearPersona();
        Persona p4 = serviPer.crearPersona();

        System.out.println("p1: " + p1.toString());
        System.out.println("p2: " + p2.toString());
        System.out.println("p3: " + p3.toString());
        System.out.println("p4: " + p4.toString());

        if (serviPer.calcularIMC(p1) == -1) {
            debajoPeso++;

        } else if (serviPer.calcularIMC(p1) == 0) {
            pesoIdea++;
        } else {
            pesoPorEncima++;
        }

        if (serviPer.esMayorDeEdad(p1)) {
            mayorEdad++;

        } else {
            menorEdad++;
        }

        if (serviPer.calcularIMC(p4) == -1) {
            debajoPeso++;

        } else if (serviPer.calcularIMC(p4) == 0) {
            pesoIdea++;
        } else {
            pesoPorEncima++;
        }

        if (serviPer.esMayorDeEdad(p4)) {
            mayorEdad++;

        } else {
            menorEdad++;
        }

        if (serviPer.calcularIMC(p2) == -1) {
            debajoPeso++;

        } else if (serviPer.calcularIMC(p2) == 0) {
            pesoIdea++;
        } else {
            pesoPorEncima++;
        }

        if (serviPer.esMayorDeEdad(p2)) {
            mayorEdad++;

        } else {
            menorEdad++;
        }

        if (serviPer.calcularIMC(p3) == -1) {
            debajoPeso++;

        } else if (serviPer.calcularIMC(p3) == 0) {
            pesoIdea++;
        } else {
            pesoPorEncima++;
        }

        if (serviPer.esMayorDeEdad(p3)) {
            mayorEdad++;

        } else {
            menorEdad++;
        }
        System.out.println("% de personas debajo del peso: " + (debajoPeso/4*100));
        System.out.println("% de personas de peso idal: " + (pesoIdea/4*100));
                System.out.println("% de personas encima del peso: " + (pesoPorEncima/4*100));
                System.out.println("% de personas mayores: " + (mayorEdad/4*100));
                System.out.println("% de personas menores: " + (menorEdad/4*100));

    }

}
