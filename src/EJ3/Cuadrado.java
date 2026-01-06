package EJ3;

import java.util.Random;

public class Cuadrado {

    private double lado;

    public Cuadrado() {
        Random random = new Random();
        this.lado = random.nextDouble();
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
