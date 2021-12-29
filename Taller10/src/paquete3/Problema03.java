/*
    Referencia para obtener el valor cualitativo de una nota numérica
    0 - 2.9   Insuficiente
    3 - 4.9   Regular
    5 - 7.9   Buena
    8 - 9.5   Muy Buena
    9.6 - 10  Sobresaliente  
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        //Variables
        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};
        double nota;

        for (int i = 0; i < notasCuantitativas.length; i++) {
            for (int j = 0; j < notasCuantitativas[i].length; j++) {
                nota = notasCuantitativas[i][j];
                if (nota < 3) {
                    notasCualitativas[i][j] = "Insuficiente";
                } else {
                    if (nota >= 3 && nota < 5) {
                        notasCualitativas[i][j] = "Regular";
                    } else {
                        if (nota >= 5 && nota < 8) {
                            notasCualitativas[i][j] = "Buena";
                        } else {
                            if (nota >= 8 && nota < 9.5) {
                                notasCualitativas[i][j] = "Muy Buena";
                            } else {
                                if (nota >= 9.6 && nota <= 10) {
                                    notasCualitativas[i][j] = "Sobresaliente";
                                }
                            }

                        }

                    }
                }

            }
        }

        for (int i = 0; i < notasCualitativas.length; i++) {
            for (int j = 0; j < notasCualitativas[i].length; j++) {
                System.out.printf("Nota posición %d %d %s\n",
                        i,
                        j,
                        notasCualitativas[i][j]);
            }
        }
    }

}
