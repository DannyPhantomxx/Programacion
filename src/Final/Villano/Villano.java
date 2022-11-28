package Final.Villano;

public class Villano {
    public int vida;
    public int atrapado;

    //Constructor
    public Villano(int vida, int rescatados) {
        this.vida = vida;
        this.atrapado = rescatados;
    }

    //Para agregar mas vida
    public boolean atrapados(){
        if (this.atrapado >= 10){
            this.vida++;
            this.atrapado = 0;
            return true;
        }
        return false;
    }

    //Golpear a alguien
    public int herir(){return 1;}
}
