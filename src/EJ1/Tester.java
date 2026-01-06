package EJ1;

public class Tester {
    public static void main() {
        Triangulo triangulo1 = new Triangulo();
        double perimetro = Triangulo.damePerimetro(triangulo1);
        System.out.printf("\nEl área del triángulo es: %.2f\n",perimetro);
        double area = Triangulo.dameArea(triangulo1);
        System.out.printf("\nEl área del triángulo es: %.2f\n",area);
    }
}
