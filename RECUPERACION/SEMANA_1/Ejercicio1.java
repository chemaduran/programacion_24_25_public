package _RECUPERACION_PROG.raul_prieto;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca la altura de la piramide: ");
		int alt = 9;


		for (int x = 0; x < alt; x++) {
			int numero = 0;
			for (int y = 0; y < (alt * 2) - 1; y++) {
				if ( (x + y >= alt - 1  && y < ((alt * 2) / 2) ) ||  (x - y >= -alt + 1  && y >= ((alt * 2) / 2)) ) {
					if (y < ((alt * 2) / 2)) {
						numero++;
					} else  {
						numero--;
					}
					System.out.print(numero);

				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}


