/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        double[][] ventas = new double[2][5];

        double suma = 0;
        double valor;
        double valoringresado;

        for (int i = 0; i < ventas.length; i++) {
            System.out.printf("Ingrese las ventas diarias de %s \n",
                     vendedores[i]);
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.printf("Día %s\n", j);
                valoringresado = entrada.nextDouble();
                ventas[i][j] = valoringresado;
            }
        }

        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                valor = ventas[i][j];
                suma = suma + valor;
            }
        }
        System.out.printf("Vendedor(a) %s\nVendedor(a) %s\n"
                + "Ha realizado un total de %.2f en ventas",
                vendedores[0], vendedores[1], suma);
    }

}
