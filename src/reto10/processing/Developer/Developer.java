package reto10.processing.Developer;

import reto10.processing.Empleado.Empleado;
import reto10.processing.Entrevistador.Entrevistador;
import reto10.processing.Programador.Programador;

public class Developer extends Empleado implements Entrevistador, Programador {
    @Override public void entrevistar() {
        System.out.println("Entrevista tecnica");
    }

    @Override public void programar() {
        System.out.println("programación basica");

    }

    @Override
    public void trabajar() {
        System.out.println("Yo programo y desarrollo");
    }
}
