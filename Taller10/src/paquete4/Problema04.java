/*
    Realice un proceso que permita ingresar los valores por teclado 
    para el siguiente arreglo
    double[][] datos = new double[2][2];
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double[][] datos = new double[2][2];
        double valorIngresado;

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.printf("Ingrese valor para la posición [%d][%d]\t: ",
                        i, j);
                valorIngresado = entrada.nextInt();
                datos[i][j] = valorIngresado;
            }
            System.out.println(); // salto de línea
        }

    }

}
