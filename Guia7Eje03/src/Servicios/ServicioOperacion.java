/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Operacion;
import java.util.Scanner;

public class ServicioOperacion {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Operacion op1 = new Operacion();

    public Operacion crearOperacion() {
        System.out.println("Ingrese el valor del num1: ");
        op1.setNum1(leer.nextInt());
        System.out.println("Ingrese el valor del num2: ");
        op1.setNum2(leer.nextInt());     
        
        return op1;
    }
    
    public double sumar(double num1, double num2){
        return (num1 + num2);
        
    }
    public double restar(double num1, double num2){
        return (num1 - num2);
        
    }
    public String multiplicar(double num1, double num2){
        if(num1== 0 || num2==0){
           return "Hay un numero que es cero, resultado: 0" ;

        }
           return "" + (num1 * num2);

    }
    public String dividir(double num1, double num2){
        if(num1== 0 || num2==0){
           return "Hay un numero que es cero, resultado: 0";

        }
           return "" + (num1 / num2);

    }  
}
