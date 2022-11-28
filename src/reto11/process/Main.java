package reto11.process;
import java.util.Random;

public class Main {

    public class Hilos {

        public void main(String[] args) {
            Personaje personaje1 = new Personaje("rob");
            Personaje personaje2 = new Personaje("bob");

            personaje2.setOther(personaje1);
            personaje1.setOther(personaje2);

            Thread thread = new Thread(personaje1);
            Thread thread2 = new Thread(personaje2);
            thread.start();
            thread2.start();
        }
    }

    class Personaje implements Runnable {

        private int power = 10;
        private String name;

        public int getPower() {
            return this.power;
        }

        public void reducePower() {
            this.power--;
            System.out.printf("Personaje: %s poder%d ", this.name, this.power);
            System.out.println();
        }

        public void hit() {
            other.reducePower();
        }

        public Personaje getOther() {
            return other;
        }

        public void setOther(Personaje other) {
            this.other = other;
        }

        public Personaje() {
        }

        public Personaje(String name) {
            this.name = name;
        }

        private Personaje other;

        @Override
        public void run() {
            Random random = new Random();
            while (true) {
                System.out.printf("this is %s \n", this.name);
                if (this.power <= 0) {
                    System.out.printf("%s is dead \n", this.name);
                    break;
                }
                int espera = random.nextInt(2);
                //espera =  Math.abs(espera)

                try {
                    System.out.printf("%s duerme %d segundos \n", this.name, espera);
                    Thread.sleep(espera * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (other.getPower() <= 0) {
                    System.out.printf("%s gano", this.name);
                    break;
                }
                this.hit();

            }
        }
    }
}
