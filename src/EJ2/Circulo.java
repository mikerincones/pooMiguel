package EJ2;

import java.util.Random;

public class Circulo {

    private double radio;

    public Circulo() {
        Random random = new Random();
        this.radio = random.nextDouble();
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


}
