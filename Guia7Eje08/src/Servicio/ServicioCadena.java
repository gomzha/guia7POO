/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author A308443
 */
public class ServicioCadena {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {
        Cadena cad = new Cadena();
        System.out.println("Ingrese la cadena");
        cad.setFrase(leer.next());
        cad.setLongitud(cad.getFrase().length());
        return cad;
    }

    public void mostrarVocales(Cadena objCad) {
        int contVocales = 0;
        System.out.println("ONGITUD  " + objCad.getLongitud());

        for (int i = 0; i < objCad.getLongitud(); i++) {
            System.out.println("objCad.getFrase().charAt(i): " + objCad.getFrase().charAt(i));
            if (objCad.getFrase().charAt(i) == 'A'
                    || objCad.getFrase().charAt(i) == 'E'
                    || objCad.getFrase().charAt(i) == 'I'
                    || objCad.getFrase().charAt(i) == 'O'
                    || objCad.getFrase().charAt(i) == 'U') {
                contVocales++;
            }
        }

        System.out.println("posee un total de vocales: " + contVocales);

    }

    public void invertirFrase(Cadena objCad) {
        StringBuilder stringBuilder = new StringBuilder(objCad.getFrase());
        System.out.println("Cadena inviertida: " + stringBuilder.reverse().toString());

    }

    public void vecesRepetido(Cadena objCad) {
        char letra;
        System.out.println("Ingrese la letra a buscar");
        letra = leer.next().charAt(0);
        int contador = 0;
        System.out.println("LETRA QUE VA A BUSCAR: " + letra);

        for (int i = 0; i < objCad.getLongitud(); i++) {
            if (objCad.getFrase().charAt(i) == letra) {
                contador++;
            }
        }

        System.out.println("La letra " + letra + " se encuentra repetida un total de: " + contador);

    }

    public void compararLongitud(Cadena objCad) {
        String cad;
        System.out.println("Ingrese la cadena");
        cad = leer.next();

        if (cad.length() == objCad.getLongitud()) {
            System.out.println("Longitudes iguales");
        } else {
            System.out.println("Longitudes Diferentes");
        }

    }

    public void unirFrases(Cadena objCad) {
        String cad;
        System.out.println("Ingrese la cadena");
        cad = leer.next();

        System.out.println("Cadenas unidas: " + (objCad.getFrase() + cad));

    }

    public void reemplazar(Cadena objCad) {
        char letra;
        System.out.println("Ingrese la letra que cambiará las letras 'A': ");
        letra = leer.next().charAt(0);

        String cadenaNueva = "";
        System.out.println("LETRA QUE VA A BUSCAR: " + letra);

        for (int i = 0; i < objCad.getLongitud(); i++) {
            if (objCad.getFrase().charAt(i) == 'A') {
                cadenaNueva = cadenaNueva + letra;

            } else {
                cadenaNueva = cadenaNueva + objCad.getFrase().charAt(i);
            }
        }
        
        System.out.println("La neuva cadena que reemplazó la letra A es: " + cadenaNueva);

    }
        public void contiene(Cadena objCad) {
        String  letra;
        System.out.println("Ingrese la letra a buscar en la cadena");
        letra = leer.next();

        System.out.println("contiene la letra? True/false: " + objCad.getFrase().contains(letra));

    }
    
    
    
}
