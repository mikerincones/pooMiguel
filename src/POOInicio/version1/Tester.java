package POOInicio.version1;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        OperacionesArray op = new OperacionesArray(10);
        op.cargarArray();
        op.listarArray();
        op.ordenarArray();
        double media = op.calcularMedia();
        System.out.println("\n\nLa media es: "+media);
        System.out.print("\nArray ordenado e invertido:\n"+Arrays.toString(op.arrayInvertido())+"\n");
    }
}