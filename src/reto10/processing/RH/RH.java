package reto10.processing.RH;


import reto10.processing.Empleado.Empleado;

public class RH extends Empleado Entrevistador {

    @Override
    public void trabajar() {
        System.out.println("Yo me dedico a reclutador");
    }

    @Override public void entrevistar() {
        System.out.println("Entrevista screening");
    }
}
