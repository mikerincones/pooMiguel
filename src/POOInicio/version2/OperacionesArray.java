package POOInicio.version2;

/*
* Ejercicio 0
Dos versiones:
    1. Una versión que tenga como atributo el array
    2. Otra versión que no tenga atributos y por lo tanto sus métodos serán estáticos.
Definir una clase OperacionesArray con los siguientes métodos:
    • Cargar un array
    • Listar contenido array
    • Ordenar array
    • Calcular media
    • Devolver una copia del array invertido
Definir una clase Tester para utilizar OperacionesArray.
* */

import java.util.Random;
import java.util.Scanner;

public class OperacionesArray {

    public static void cargarArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public static void listarArray(int[]array) {
        System.out.println("\nArray original:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void ordenarArray(int[]array) {
        int aux = 0;
        for (int pasada = 1; pasada != 0; ) {
            pasada = 0;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                    pasada++;
                }
            }
        }
    }

    public static double calcularMedia(int[]array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return (double) suma / array.length;
    }

    public static int[] arrayInvertido(int[]array) {
        int[] invertido = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - 1-i];
        }
        return invertido;
    }

}

