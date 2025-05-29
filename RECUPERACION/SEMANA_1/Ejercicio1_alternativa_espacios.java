package _RECUPERACION_PROG.raul_prieto;

import java.util.Scanner;

public class Ejercicio1_alternativa_espacios {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca la altura de la piramide: ");
		int alt = 9;


//		if (y < ((alt * 2) / 2)) {
//			numero++;
//		} else  {
//			numero--;
//		}
//		System.out.print(numero);

		for (int x = 0; x < alt; x++) {
			int numero = 0;
			int max_espacios = alt - x - 1;
			int contador_anchura = 0;
			for (int contador_espacios = 0; contador_espacios < max_espacios; contador_espacios++) {
				System.out.print(" ");
				contador_anchura++;
			}

			for (int contador_ast = 0; contador_ast < x * 2 + 1; contador_ast++) {
//				System.out.print("*");
				if (contador_anchura < ((alt * 2) / 2)) {
					numero++;
				} else {
					numero--;
				}
				System.out.print(numero);
				contador_anchura++;
			}

			System.out.println();
		}
	}
}
