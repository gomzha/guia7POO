/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

public class ServicioCafetera {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cafetera crearCafetera() {

        Cafetera caf = new Cafetera();
        System.out.println("Ingrese la capacidad actual");
        caf.setCapacidadActual(leer.nextInt());
        System.out.println("Ingrese la capacidad máxima");
        caf.setCapacidadMax(leer.nextInt());
        return caf;
    }

    public void llenarCafetera(Cafetera caf) {

        caf.setCapacidadActual(caf.getCapacidadMax());

    }

    public void servirTaza(Cafetera caf, int cant) {

        if (caf.getCapacidadActual() < cant) {
            System.out.println("No se llenó la taza debido a que solo había en la cafetera una cantidad de: " + caf.getCapacidadActual());
            caf.setCapacidadActual(0);
        } else {
            caf.setCapacidadActual(caf.getCapacidadActual() - cant);
        }

    }

    public void vaciarCafetera(Cafetera caf) {

        caf.setCapacidadActual(0);

    }

    public void agregarCafe(Cafetera caf, int cant) {
        
        caf.setCapacidadActual(caf.getCapacidadActual()+cant);
        
        if (caf.getCapacidadActual() > caf.getCapacidadMax()) {
            caf.setCapacidadActual(caf.getCapacidadMax());
        } 

    }

}
