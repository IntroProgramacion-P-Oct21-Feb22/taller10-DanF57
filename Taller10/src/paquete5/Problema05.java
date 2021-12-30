/*
 Imprima en pantalla a través de una variable acumuladora 
solo los estudiantes que tienen como primera letra S,P,T
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        //Variables
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}};

        String nombre;
        String iniciales;
        String cadena = "";

        char[] arregloc = new char[5];

        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                nombre = estudiantes[i][j];
                iniciales = nombre.substring(0,1);
                if (iniciales.equals("S") || iniciales.equals("P") 
                        || iniciales.equals("T")) {
                    cadena = String.format("%s %s\n",
                            cadena, estudiantes[i][j]);
                }

            }
         
        }
        System.out.println(cadena);
        
    }

}
