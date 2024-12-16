package resolucion._24_25_.U3.examen_2021;

import java.util.Arrays;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] a = {8, 9, 0};
        int[] b = {1, 2, 3};
        int[] resultado = mezcla(a, b);
        System.out.println(Arrays.toString(resultado));
    }

    public static int[] mezcla(int[] a, int[] b) {
        int[] resultado = new int[a.length + b.length];
        int array1 = 0;
        int array2 = 0;
        int contador = 0;
        for (int i = 0; i < resultado.length; i++) {
            if (array1 < a.length) {
                resultado[contador] = a[array1];
                array1++;
                contador++;
            }
            if (array2 < b.length) {
                resultado[contador] = b[array2];
                array2++;
                contador++;
            }
        }
        return resultado;
    }
}
