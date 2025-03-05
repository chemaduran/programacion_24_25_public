package resolucion;

import java.util.Arrays;

public class AppMain {
    public static void main(String[] args) {
        Agrupacion[] lista_agrupaciones = new Agrupacion[0];

        Arrays.sort(lista_agrupaciones, new comparaAgrupacionAutor());
        Arrays.sort(lista_agrupaciones);

    }
}
