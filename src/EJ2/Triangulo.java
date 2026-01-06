
package EJ2;

import java.util.Random;

public class Triangulo {

    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo() {
        Random random = new Random();
        this.lado1 = random.nextDouble(1, 30);
        this.lado2 = random.nextDouble(1, 30);
        this.lado3 = random.nextDouble(1, 30);
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }


    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public static double damePerimetro(Triangulo a) {
        return (a.lado1 + a.lado2 + a.lado3);
    }

    public static double dameArea(Triangulo a) {
        double base = a.lado1;
        double semi = ((a.lado1 + a.lado2 + a.lado3) / 2);
        return Math.sqrt(Math.abs(semi*(semi- a.lado1)*(semi-a.lado2)*(semi-a.lado3)));
    }

}
