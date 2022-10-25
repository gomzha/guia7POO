/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

public class Cuenta {
    private int numeroCuenta, saldoActual;
    private long dni;

    
    
    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int saldoActual, long dni) {
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
        this.dni = dni;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldoActual=" + saldoActual + ", dni=" + dni + '}';
    }
    
    
    
}
