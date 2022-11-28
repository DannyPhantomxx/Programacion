package Final.Heroe;

public class Heroe {
    public int vida;
    public int rescatados;

    //Constructor
    public Heroe(int vida, int rescatados) {
        this.vida = vida;
        this.rescatados = rescatados;
    }

    //Para añadir mas vida
    public boolean rescatados(){
        if (this.rescatados >= 10){
            this.vida++;
            this.rescatados = 0;
            return true;
        }
        return false;
    }

    //Esto es al momento de ser golpeado
    public void recibirDamage(int damage){
        System.out.printf("¡Has recibido %d de daño!\n", damage);
        this.vida -= damage;
    }
}
