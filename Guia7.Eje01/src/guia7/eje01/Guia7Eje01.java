/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package guia7.eje01;

import Entidad.Libro;
import Servicio.ServicioLibro;

public class Guia7Eje01 {


    public static void main(String[] args) {

        ServicioLibro servLib = new ServicioLibro();
        Libro lib = servLib.crearLibro();
        
        System.out.println(lib.toString());

    }
    
}
