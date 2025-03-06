package EjemploCajero;

import java.util.Arrays;

public class GestorCajero {
    private Cajero[] lista_cajeros;

    @Override
    public String toString() {
        return "GestorCajero{" +
                "lista_cajeros=" + Arrays.toString(lista_cajeros) +
                '}';
    }

    public GestorCajero() {
        this.lista_cajeros = new Cajero[0];
    }

    public void add_cajero(Cajero c) {
        // Código para añadir un cajero a la lista de cajeros
        lista_cajeros = Arrays.copyOf(lista_cajeros, lista_cajeros.length + 1);
        lista_cajeros[lista_cajeros.length - 1] = c;
    }

    public boolean delete_cajero(Cajero c) {
        boolean resultado = false;
        // Código para eliminar un cajero concreto de la lista de cajeros. Devolverá true si lo elimina, y false si no lo ha eliminado.
        Cajero[] lista_temporal = new Cajero[0];

        for (Cajero cajero : lista_cajeros) {
            if (!cajero.equals(c)) {
                lista_temporal = Arrays.copyOf(lista_temporal, lista_temporal.length + 1);
                lista_temporal[lista_temporal.length - 1] = cajero;
            } else {
                resultado = true;
            }
        }

//        LO MISMO PERO CON FOR "DE TODA LA VIDA"
//        for (int i = 0; i < lista_cajeros.length; i++) {
//            if (!lista_cajeros[i].equals(c)) {
//                lista_temporal = Arrays.copyOf(lista_temporal, lista_temporal.length + 1);
//                lista_temporal[lista_temporal.length - 1] = lista_cajeros[i];
//            } else {
//                resultado = true;
//            }
//        }
        System.out.println(resultado);
        return resultado;
    }


}
