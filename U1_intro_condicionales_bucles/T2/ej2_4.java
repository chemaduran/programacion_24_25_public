package U1_intro_bucles_condicionales.ejercicios.T2;
// Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y calcule su
// equivalencia en metros (1 milla = 1609 m).

import java.util.Scanner;

public class ej2_4 {
  public static void main(String[] args) {
    //
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca una longitud en millas: ");
    int millas = teclado.nextInt();

    System.out.println("La conversión a metros es: " + millas * 1609);
  }
}
