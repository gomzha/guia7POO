/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Servicio.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author A308443
 */
public class ServicioAhorcado {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {

        String palabraEnt;

        Ahorcado palabra = new Ahorcado();
        System.out.println("Ingrese la cantidad de jugadas máximas: ");
        palabra.setCantidadJugadasMax(leer.nextInt());
        palabra.setCantidadLetrasEncontradas(0);

        System.out.println("Ingrese la palabra a encontrar: ");
        palabraEnt = leer.next();

        palabra.setCantidadLetras(palabraEnt.length());

        char[] listaLetra = new char[palabraEnt.length()];
        for (int i = 0; i < listaLetra.length; i++) {
            listaLetra[i] = palabraEnt.charAt(i);
        }

        palabra.setListaLetra(listaLetra);

        return palabra;
    }

    public void longitud(Ahorcado p1) {
        System.out.println("La longitud de la palabra es de: " + p1.getCantidadLetras());
    }

    public boolean buscar(Ahorcado p1) {
        char letra;
        int numEnc = 0;
        boolean encontrar = false;
        System.out.println("Ingrese la letra a buscar: ");
        letra = leer.next().charAt(0);

        for (int i = 0; i < p1.getCantidadLetras(); i++) {
            if (letra == p1.getListaLetra()[i]) {
                encontrar = true;
                numEnc++;
            }
        }
        if (encontrar) {
            System.out.println("Se encontró la letra");
            return encontradas(p1, letra, numEnc);
        } else {
            System.out.println("La letra no pertecene a la palabra");
            p1.setCantidadJugadasMax(p1.getCantidadJugadasMax() - 1);
            return encontradas(p1, letra, 0);
        }

    }

    private boolean encontradas(Ahorcado p1, char letra, int numEnc) {

        p1.setCantidadLetrasEncontradas(p1.getCantidadLetrasEncontradas() + numEnc);
        System.out.println("Número de letras (encontradas, faltantes): " + (p1.getCantidadLetrasEncontradas()) + " , " + (p1.getCantidadLetras() - p1.getCantidadLetrasEncontradas()) + ")");
        return true;
    }

    public void intentos(Ahorcado p1) {
        System.out.println("Número de oportunidades restantes: " + p1.getCantidadJugadasMax());
    }

}
