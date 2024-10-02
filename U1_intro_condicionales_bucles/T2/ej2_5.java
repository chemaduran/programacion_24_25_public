package U1_intro_bucles_condicionales.ejercicios.T2;

import java.util.Scanner;

//  Crea un programa que pida al usuario una temperatura en grados centígrados y calcule (y muestre)
// a cuántos grados Fahrenheit equivalen (F = 9*C/5 + 32).

public class ej2_5 {
  public static void main(String[] args) {
    //
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca una temperatura en grados centígrados: ");
    int temp_grados = teclado.nextInt();
    int fanhreit = 9 * temp_grados / 5 + 32;
    System.out.println("La temperatura en Fahrenheit es: " + fanhreit);
  }
}
