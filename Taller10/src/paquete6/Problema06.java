/*
Imprima en pantalla a través de una variable acumuladora 
solo los estudiantes que tengan 11 caracteres 
(se cuentan también los espacios en blanco)
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {
        //Variables
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}};

        String nombre;
        String iniciales;
        String cadena = "";

        int stringlen;

        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                nombre = estudiantes[i][j];
                stringlen = nombre.length(); //caracteres de cada nombre
                if (stringlen <= 11) {
                    cadena = String.format("%s%s\n",
                            cadena, estudiantes[i][j]);
                }

            }

        }
        System.out.println(cadena);

    }

}
