/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package guia7eje10;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author A308443
 */
public class Guia7Eje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double arrayNumA[] = new double[50];
        double arrayNumB[] = new double[20];

        for (int i = 0; i < arrayNumA.length; i++) {
            arrayNumA[i] = ((double) (Math.random() * 20) + 1);
        }

        System.out.println("el vector A tiene: " + Arrays.toString(arrayNumA));
        Arrays.sort(arrayNumA);
                System.out.println("el vector A ORDENADO tiene: " + Arrays.toString(arrayNumA));

        for (int i = 0; i < 10; i++) {
            arrayNumB[i] = arrayNumA[i];
            arrayNumB[arrayNumB.length-i-1] = arrayNumA[arrayNumA.length-i-1];

        }

        System.out.println("el vector b tiene: " + Arrays.toString(arrayNumB));

    }

}
