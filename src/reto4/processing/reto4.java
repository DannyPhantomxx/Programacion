package reto4.processing;

import java.io.*;
class tabla1
{
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main (String[] args) throws IOException
    {

        int trimestre;
        int chocolate = 0, vainilla = 0, fresa = 0, oreo = 0;

        int [][] tabla = new int[4][4];

        tabla [0] [0] = 111;
        tabla [1] [0] = 192;
        tabla [2] [0] = 289;
        tabla [3] [0] = 415;

        tabla [0] [1] = 483;
        tabla [1] [1] = 500;
        tabla [2] [1] = 470;
        tabla [3] [1] = 114;

        tabla [0] [2] = 471;
        tabla [1] [2] = 355;
        tabla [2] [2] = 474;
        tabla [3] [2] = 161;

        tabla [0] [3] = 427;
        tabla [1] [3] = 158;
        tabla [2] [3] = 160;
        tabla [3] [3] = 308;


        for(int j = 0; j<3; j++)
        {
            if(tabla [0][j] > chocolate)
            {
                chocolate = tabla [0][j];
            }
        }
        for(int j = 0; j<3; j++)
        {
            if(tabla [1][j] > vainilla)
            {
                vainilla = tabla [1][j];
            }
        }
        for(int j = 0; j<3; j++)
        {
            if(tabla [2][j] > fresa)
            {
                fresa = tabla [2][j];
            }
        }
        for(int j = 0; j<3; j++)
        {
            if(tabla [3][j] > oreo)
            {
                oreo = tabla [2][j];
            }
        }

        System.out.println("Chocolate: Abr-May-Jun:" + chocolate);
        System.out.println("Vainilla: Abr-May-Jun:" + vainilla);
        System.out.println("Fresa: Jul-Ago-Sep:" + fresa);
        System.out.println("Oreo: Ene-Feb-Mar:" + oreo);

        trimestre = tabla [0][1] + tabla [1][1] + tabla [2][1] + tabla [3][1];
        System.out.println("Trimestre que se vendio mas es: Abr-May-Jun:" + trimestre);

    }
}
