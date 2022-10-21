/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author A308443
 */
public class ServicioLibro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro() {
        Libro libroObj = new Libro();
        System.out.println("Ingresa el isbn: ");
        libroObj.setIsbn(leer.next());
        System.out.println("Ingresa el Título: ");
        libroObj.setTitulo(leer.next());
        System.out.println("Ingresa el autor: ");
        libroObj.setAutor(leer.next());
        System.out.println("Ingresa número de páginas: ");
        libroObj.setNumPag(leer.nextInt());
        return libroObj;
    }
}
