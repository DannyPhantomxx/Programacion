package reto5.processing;
//Daniel Corona
import java.util.Random;
import java.util.Scanner;

public class Adivina {

        //Niveles
        private static final String[] FACIL = {
                "pesa", "saco", "pelo", "dijo", "ropa", "abre", "duda", "duro", "palo", "rosa"
        };

        private static final String[] INTERMEDIO = {
                "langosta", "elefante", "defender", "fabricar", "caliente",
                "mamifero", "abandono", "abrieron", "afectivo", "acuarela"
        };

        private static final String[] AVANZADO = {
                "adolescentes", "acelerabamos", "dactilogia",	"damnificadas",
                "enloquecedor",	"fabricadoras",	"galardonado",	"habitualidad",
                "idealizadora", "saborizantes"
        };

        //Array de char para representar la palabra secreta a acertar
        private static char[] secreta;

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            String entrada = "";

            while (!entrada.equals("0")) {
                System.out.println("\nElija nivel dificultad...");
                System.out.println("(1) --> Fácil");
                System.out.println("(2) --> Intermedio");
                System.out.println("(3) --> Avanzado");
                System.out.println("(0) --> SALIR");
                System.out.print("Su opción [0-3]: ");
                entrada = teclado.nextLine();

                if (!entrada.equals("0")) {
                    //Nivel de dificultad
                    String palabra = obtenerPalabra(entrada);
                    boolean resuelta = false;  //Se ha resuelto la palabra
                    if (palabra == null) //Si hemos recibido null, es porque la opcion no es válida
                        System.out.println("Escoja una opción válida.");
                    else {
                        //Letras ocultas con *
                        secreta = new char[palabra.length()];
                        for (int i = 0; i < secreta.length; i++)
                            secreta[i] = '*';
                        //Pedie primera letra
                        String letra = "";
                        System.out.print("\nPruebe una letra [0 = SALIR]: ");
                        letra = teclado.nextLine().toLowerCase();
                        while (!letra.equals("0") && !resuelta) {
                            if (palabra.contains(letra)) {
                                System.out.println("\nEsa letra SI existe en la palabra:");
                                //La letra existe, puede estar en una o más posiciones
                                //Descubrir cambiando los asteriscos por la letra acertada
                                for (int i = 0; i < secreta.length; i++) {
                                    if (palabra.charAt(i) == letra.charAt(0))
                                        secreta[i] = letra.charAt(0);
                                }
                                /*
                                 * Hemos sustituido los asteriscos por la letra.
                                 * Mostrar caracteres en pantalla.
                                 * Comprobar si hay asteriscos array.
                                 * Si ya no quedan asteriscos, la palabra ha sido resuelta
                                 */
                                resuelta = true;
                                for (int i = 0; i < secreta.length; i++) {
                                    System.out.print(secreta[i]);
                                    if (secreta[i] == '*')
                                        resuelta = false; //Quedan asteriscos, no se ha resuelto
                                }
                            }
                            else
                                System.out.println("Esa letra NO existe en la palabra");
                            if (resuelta)
                                System.out.println("\n¡Ganaste! Prueba otra vez si quieres.");
                            else {
                                System.out.print("\nPruebe otra letra [0 = SALIR]: ");
                                letra = teclado.nextLine();
                            }
                        }
                    }
                }
            }
            System.out.println("\n\nFIN DEL PROGRAMA");
            teclado.close();

        }

        /**
         * Proporciona una palabra al azar
         * prefijadas, según el nivel de dificultad indicado.
         * @param nivel Valor de dificultad
         * @return Palabra al azar o valor null si no es válido.
         */
        private static String obtenerPalabra(String nivel) {
            Random azar = new Random();
            switch(nivel) {
                case "1":
                    return FACIL[azar.nextInt(FACIL.length)];
                case "2":
                    return INTERMEDIO[azar.nextInt(INTERMEDIO.length)];
                case "3":
                    return AVANZADO[azar.nextInt(AVANZADO.length)];
                default:
                    return null;

            }
        }

    }
