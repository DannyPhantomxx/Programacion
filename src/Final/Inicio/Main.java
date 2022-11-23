package Final.Inicio;
import Final.Heroe.Heroe;
import Final.Villano.Villano;

import java.util.Random; // Esto es para lo aleatorio de los golpes enemigos
import java.util.Scanner; // Para acciones establecidas

    public class Main {
        static Scanner sc = new Scanner(System.in);

        //Comienza el juego
        public static void juego() {
            Random random = new Random();
            int casas = 1, accion;
            Heroe heroe = new Heroe(3, 0);
            Villano villano = new Villano(3, 0);

            //Esto es un bucle del juego, hasta que alguno pierda
            while (true) {
                if (heroe.rescatados()) villano.vida--;
                villano.atrapados();

                if (heroe.vida == 0) {
                    System.out.println("""
                              
                             (╥_╥) HAZ PERDIDO (╥_╥)
                                  \s""".indent(12));
                    break;
                }
                if (villano.vida == 0) {
                    System.out.println("""
                                  
                            ( ͠❛ ͜ʖ͠❛)¡HAZ GANADO!( ͠❛ ͜ʖ͠❛)
                                     \s""".indent(12));
                    break;
                }
                System.out.printf("""
                                
                                |Tus estadisticas:                   |             Estadisticas del enemigo:|
                                |____________________________________|______________________________________|
                                |Vidas: %d, hadas rescatadas: %d     |       hadas capturadas: %d, vidas: %d|
                                |Casas: %d                           |                       Casas: infinito|
                                |                                    |                                      |
                        """, heroe.vida, heroe.rescatados, villano.atrapado, villano.vida, casas);

                //Acciones del jugador
                System.out.println("¡Tu turno!:\n1)construir casas\n2)rescatar hada\n3)Huir\n >>> ");
                try {
                    accion = sc.nextInt();
                } catch (Exception ignored) {
                    System.out.println("Ese poder sólo lo han conseguidos los mas grandes heroes, use otros poderes");
                    continue;
                }

                //Golpe enemigo random
                if ((random.nextInt(0, 100) >= 95)) {
                    System.out.println("¡Recibiste daño, ten cuidado!");
                    heroe.recibirDamage(villano.herir());
                    villano.atrapado++;
                    continue;
                }

                //Acciones del heroe
                switch (accion) {
                    case 1:
                        casas++;
                        break;

                    case 2:
                        if (casas > 0) {
                            heroe.rescatados++;
                            casas--;
                        } else System.out.println("Esta accion no es posible, hacen falta casas, ¡Construye más!");
                        break;

                    case 3:
                        System.out.println("¡Huiste, ahora el mago controlara el bosque!");
                        break;

                    default:
                        System.out.println("¡Esa acción está fuera de tu alcance!");
                }
            }
            System.out.printf("""
                    "Estadisticas:
                                Personajes:           Heroe (Tú)  |   Mago
                                __________________________________|__________
                                atrapados:                 %d     |    %d
                                Vidas:                     %d     |    %d
                    """, heroe.rescatados, villano.atrapado, heroe.vida, villano.vida);
        }

        //Menu del juego
        public static void main(String[] args) {

            int respuesta;

            System.out.println("""
                                 ,        ,
                                /(        )`
                                \\ \\___   / |
                                /- _  `-/  '
                               (/\\/ \\ \\   /\\
                               / /   | `    \\
                               O O   ) /    |
                               `-^--'`<     '
                              (_.)  _  )   /
                               `.___/`    /
                                 `-----' /
                    <----.     __ / __   \\
                    <----|====O)))==) \\) /====
                    <----'    `--' `.__,' \\
                                 |        |
                                  \\       /
                             ______( (_  / \\______
                           ,'  ,-----'   |        \\
                           `--{__________)        \\/
                                   
                            \s""".indent(3));


            //Menu del jugador
            System.out.println("¡Bienvenido al juego, gran heroe! Escoge tu opción:");
            while (true) {
                System.out.println("\n1)Jugar\n2)Salir\n>>> ");

                try {
                    respuesta = sc.nextInt();
                } catch (Exception ignored) {
                    System.out.println("Introduzca un numero, las letras o simbolos no estan permitidos");
                    continue;
                }
                if (respuesta == 2) {
                    System.out.println("¡Hasta luego, heroe!");
                    break;
                } else if (respuesta == 1) juego();
                else System.out.println("¡Esa opción es de rango superior!, sólo las leyendas saben invocarla");
            }
        }
    }
