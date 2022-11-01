/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.Arrays;


public class Ahorcado {
    
    int cantidadLetras, cantidadLetrasEncontradas, cantidadJugadasMax;
    char [] listaLetra = new char[cantidadLetras];

    public Ahorcado() {

    }

    public Ahorcado(int cantidadLetras, int cantidadLetrasEncontradas, int cantidadJugadasMax, char [] listaLetra) {
        this.cantidadLetras = cantidadLetras;
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.cantidadJugadasMax = cantidadJugadasMax;
        this.listaLetra = listaLetra;
               
    }

    public int getCantidadLetras() {
        return cantidadLetras;
    }

    public void setCantidadLetras(int cantidadLetras) {
        this.cantidadLetras = cantidadLetras;
    }

    public int getCantidadLetrasEncontradas() {
        return cantidadLetrasEncontradas;
    }

    public void setCantidadLetrasEncontradas(int cantidadLetrasEncontradas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    }

    public int getCantidadJugadasMax() {
        return cantidadJugadasMax;
    }

    public void setCantidadJugadasMax(int cantidadJugadasMax) {
        this.cantidadJugadasMax = cantidadJugadasMax;
    }

    public char[] getListaLetra() {
        return listaLetra;
    }

    public void setListaLetra(char[] listaLetra) {
        this.listaLetra = listaLetra;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "cantidadLetras=" + cantidadLetras + ", cantidadLetrasEncontradas=" + cantidadLetrasEncontradas + ", cantidadJugadasMax=" + cantidadJugadasMax + ", listaLetra=" + Arrays.toString(listaLetra) + '}';
    }
    
    
    
}
