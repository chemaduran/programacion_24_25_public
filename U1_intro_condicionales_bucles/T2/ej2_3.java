package U1_intro_bucles_condicionales.ejercicios.T2;

// Crea un programa que calcule y muestre la división de
// dos números enteros introducidos por el usuario.

import java.util.Scanner;

public class ej2_3 {
  public static void main(String[] args) {
    // Ahora voy a leer la entrada del usuario;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca el primer número: ");
    int num1 = teclado.nextInt();
    System.out.println("Introduzca el segundo número: ");
    int num2 = teclado.nextInt();
    System.out.println("La división de los dos números es: " + num1 / num2);
  }
}
