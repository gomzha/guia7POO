/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Matematica;
import java.util.Scanner;

/**
 *
 * @author A308443
 */
public class ServicioMatematica {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Matematica cargarNum() {
        Matematica mat = new Matematica();
//        System.out.println("Ingrese numero 1: ");
        mat.setNum1(Math.random()*9+1);
        //      System.out.println("Ingrese numero 2: ");
        mat.setNum2(Math.random()*9+1);

        return mat;
    }

    public void devolverMayor(Matematica mat) {
        System.out.println("El mayor de los dos números es " + Math.max(mat.getNum1(), mat.getNum2()));

    }

    public void calcularPotencia(Matematica mat) {
        double numMayorRedondeado = Math.round(Math.max(mat.getNum1(), mat.getNum2()));
        double numMenorRedondeado = Math.round(Math.min(mat.getNum1(), mat.getNum2()));
        System.out.println("numMayorRedondeado: " + numMayorRedondeado);
        System.out.println("numMenorRedondeado: " + numMenorRedondeado);
        System.out.println("La potencia del mayor de los dos números es " + Math.pow(numMayorRedondeado, numMenorRedondeado));
    }
    
     public void calculaRaiz(Matematica mat) {
        double numMenorRedondeadoAbsoluto = Math.abs(Math.round(Math.min(mat.getNum1(), mat.getNum2())));
        System.out.println("numMenorRedondeado: " + numMenorRedondeadoAbsoluto);
        System.out.println("La raíz cuadrada del menor es: " + Math.sqrt(numMenorRedondeadoAbsoluto));
    }   
    
}
