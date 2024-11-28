package U3_strings_arrays_funciones.ejercicios.T4_arrays_adicionales;

public class ej4_sin_matriz {
  static final int MAX_TAM_TABLERO = 8;

  public static void main(String[] args) {

    String posicion_alfil = "d5";
    int[] posicion_matriz = posicionAjedrezAPosicionMatriz(posicion_alfil);
    System.out.println("Posición ajedrez: " + posicion_alfil);
    System.out.println("Posición matriz: " + posicion_matriz[0] + " " + posicion_matriz[1]);

    // Comprobamos las 4 diagonales posibles
    System.out.println(comprobar_diagonal(posicion_matriz[0], posicion_matriz[1], -1, 1));
    System.out.println(comprobar_diagonal(posicion_matriz[0], posicion_matriz[1], -1, -1));
    System.out.println(comprobar_diagonal(posicion_matriz[0], posicion_matriz[1], 1, 1));
    System.out.println(comprobar_diagonal(posicion_matriz[0], posicion_matriz[1], 1, -1));
  }

  // Esta función comprueba una de las 4 diagonales en las que se puede mover un alfil
  // Recibe las coordenadas x e y del tablero, y la dirección de la diagonal.
  public static String comprobar_diagonal(int x, int y, int inc_x, int inc_y) {
    String movimientos = "";
    int temp_x = x + inc_x;
    int temp_y = y + inc_y;
    while (temp_x >= 0 && temp_x < MAX_TAM_TABLERO && temp_y >= 0 && temp_y < MAX_TAM_TABLERO) {
      movimientos += posicionMatrizAposicionAjedrez(new int[] {temp_x, temp_y}) + " ";
      temp_x = temp_x + inc_x;
      temp_y = temp_y + inc_y;
    }

    return movimientos;
  }

  // Esta función recibe una posición en formato "ajedrez" en un String, y devuelve
  // un array con dos posiciones (0 y 1), indicando las coordenadas x, y de la matriz "ficticia"
  // que representa el tablero.
  public static int[] posicionAjedrezAPosicionMatriz(String posicionAjedrez) {
    int[] resultado = new int[2];

    String letras = "abcdefgh";
    resultado[0] = letras.indexOf(posicionAjedrez.charAt(0));

    int numero = Integer.parseInt(String.valueOf(posicionAjedrez.charAt(1)));
    resultado[1] = 8 - numero;

    return resultado;
  }

  // Esta función recibe un array con dos posiciones (0 y 1), indicando las coordenadas x e y de la
  // matriz
  // "ficticia" que representa el tablero, y devuelve un String con las coordenadas de esa posición
  // en formato
  // "ajedrez"
  public static String posicionMatrizAposicionAjedrez(int[] posicionMatriz) {

    String resultado = "";

    String letras = "abcdefgh";
    resultado += String.valueOf(letras.charAt(posicionMatriz[0]));
    resultado += String.valueOf(8 - posicionMatriz[1]);

    return resultado;
  }
}
