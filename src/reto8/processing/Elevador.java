package reto8.processing;

public class Elevador {
    public static void main(String[] args){

    }
    private class controlador{
    }

    private class empleado{
        String nombre;
        int sn; //serial number
        public empleado(String _nombre,int _sn){
            nombre = _nombre;
            sn = _sn;
        }
    }

    private class elevador{
        int id;
        int peso;
        int floor;

        public elevador(int _id,int _peso,int _floor){
            id = _id;
            peso = _peso;
            floor = _floor;
        }
    }
}

