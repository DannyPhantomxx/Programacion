package reto10.processing.Main;

import reto10.processing.CEO.CEO;
import reto10.processing.Developer.Developer;
import reto10.processing.Empleado.Empleado;
import reto10.processing.Manager.Manager;

public class Main {

    public static void main(String[] args) {
        Empleado empleado1;
        Developer developer1 = new Developer();
        Manager manager1 = new Manager();
        CEO ceo = new CEO();

        /*developer1.trabajar();
        manager1.trabajar();
        ceo.trabajar();
        */



        if(manager1.getClass().equals(Manager.class) )
            System.out.println("true");

        //  ordenarTrabajo(developer1);
        // ordenarTrabajo(manager1);
        //ordenarTrabajo(ceo);

    }

    static void ordenarTrabajo(Empleado empleado){
        if(empleado instanceof Developer) {
            Developer d = (Developer)empleado;
            System.out.println(empleado.getClass());
        }
        empleado.trabajar();
    }
}
