/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables

        String[] estudiantes = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        double[][] notas = {{9, 10, 7, 8},
                            {10, 5, 7, 9},
                            {7, 9.4, 10, 9}};
        double[] promedios = new double[3];
        
        double suma;
        double nota;

        for (int fila = 0; fila < notas.length; fila++) {
            suma = 0;
            for (int col = 0; col < notas[fila].length; col++) {
                nota = notas[fila][col];
                suma = suma + nota;
                promedios[fila] = suma / notas[fila].length;

            }
        }
        for (int fila = 0; fila < estudiantes.length; fila++) {
            System.out.printf("Estudiante: %s tiene un promedio de %.2f\n",
                     estudiantes[fila],
                     promedios[fila]);
        }

    }

}

/*
Estudiante: Jerry Ponce tiene un promedio de ?
Estudiante: Gabriela Lewis tiene un promedio de ?
Estudiante: David Bell tiene un promedio de ?	
 */
