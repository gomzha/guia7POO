/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

public class ServicioCuenta {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {
        Cuenta cue = new Cuenta();
        System.out.println("Ingrese número de cuenta: ");
        cue.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese número de DNI: ");
        cue.setDni(leer.nextLong());
        System.out.println("Ingrese número de saldo actual: ");
        cue.setSaldoActual(leer.nextInt());

        return cue;

    }

    public void ingreso(Cuenta objCue) {
        System.out.println("Ingrese el dinero que desea agregar: ");
        objCue.setSaldoActual(objCue.getSaldoActual() + leer.nextInt());
    }

    public void retirar(Cuenta objCue) {
        System.out.println("Ingrese el dinero que desea retirar: ");
        objCue.setSaldoActual(objCue.getSaldoActual() - leer.nextInt());
        if (objCue.getSaldoActual() < 0) {
            objCue.setSaldoActual(0);
        }
    }

    public void extraccionRapida(Cuenta objCue) {
        System.out.println("Ingrese el dinero que desea retirar: ");
        int saldoARetirar = leer.nextInt();
        if ((objCue.getSaldoActual() * 0.20) > saldoARetirar) {
            objCue.setSaldoActual(objCue.getSaldoActual() - saldoARetirar);
        } else {
            System.out.println("El saldo ingresado supera el 20% de su saldo total, ¡¡¡rechazado!!!");
        }
    }

    public void consultarSaldo(Cuenta objCue) {
        System.out.println("El saldo es: " + objCue.getSaldoActual());
    }

    public void consultarDatos(Cuenta objCue) {
        System.out.println("El saldo es: " + objCue.toString());
    }

}
