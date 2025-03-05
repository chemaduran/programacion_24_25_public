package resolucion;

import java.util.Arrays;

public abstract class AgrupacionOficial extends Agrupacion {
    protected int puntos;
    protected Integrante[] lista_integrantes;

    public abstract void caminito_del_falla();

    void insertar_integrante(Integrante i) {
        lista_integrantes = Arrays.copyOf(lista_integrantes, lista_integrantes.length + 1);
        lista_integrantes[lista_integrantes.length - 1] = i;
    }

    boolean eliminar_integrante(Integrante i) {
        boolean resultado = false;
        Integrante[] integrantes_nueva  = new Integrante[0];

        for (int j = 0; j < lista_integrantes.length; j++) {
            if (!lista_integrantes[j].equals(i)) {
                integrantes_nueva = Arrays.copyOf(integrantes_nueva, integrantes_nueva.length + 1);
                integrantes_nueva[integrantes_nueva.length - 1] = lista_integrantes[j];
            } else {
                resultado = true;
            }
        }

        lista_integrantes = integrantes_nueva;

        return resultado;
    }
}
