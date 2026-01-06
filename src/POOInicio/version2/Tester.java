package POOInicio.version2;

import java.util.Arrays;

public class Tester {

    public static void main() {
        int[] datos = new int[15];
        OperacionesArray.cargarArray(datos);
        OperacionesArray.listarArray(datos);
        OperacionesArray.ordenarArray(datos);
        System.out.println("\n\nLa media es: "+OperacionesArray.calcularMedia(datos));
        System.out.println("\nArray ordenado e invertido:\n"+Arrays.toString(OperacionesArray.arrayInvertido(datos)));
    }
}
