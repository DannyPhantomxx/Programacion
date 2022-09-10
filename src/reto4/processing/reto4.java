
package reto4.processing;

import java.io.*;

public class reto4 {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[ ] args)throws IOException {

        //Arreglos
        String[] Sabores = {"Chocolate", "Vainilla", "Fresa", "Oreo"};
        String[] Fechas = {"Ene-Feb-Mar", "Abr-May-Jun", "Jul-Ago-Sep", "Oct-Nov-Dic"};

        int[][] ventas = {{111, 483, 427},
                {192, 500, 355, 158},
                {289, 470, 474, 160},
                {415, 114, 161, 308}};

        String FECH = "";//Almacenamiento de fecha
        String SAB = "";//Almacena sabores

        int contador2 = 0;
        int minitrim = 0;
        int opera1 = 0;
        int opera2 = 0;
        int opera3 = 0;
        int opera4 = 0;
        int trim = 0;

        //Mensaje
        System.out.println("El semestre que vendio mas de cada sabor.");
        System.out.println("Presiona una tecla para continuar");



        System.out.println("El trimestre Ene-Feb-Mar vendio un total de:" + opera1);
        System.out.println("El trimestre Abr-May-Jun vendio un total de:" + opera2);
        System.out.println("El trimestre Jul-Ago-Sep vendio un total de:" + opera3);
        System.out.println("El trimestre Oct-Nov-Dic vendio un total de:" + opera4);
        System.out.println("Lo que significa que en " + Fechas[trim] + " se vendio mas por " + minitrim);
    }
}