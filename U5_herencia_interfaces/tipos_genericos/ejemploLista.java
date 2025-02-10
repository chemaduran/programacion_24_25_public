package U5_herencia_interfaces.teoria.tipos_genericos;

public class ejemploLista {
    public static void main(String[] args) {
        Lista solamente_numeros = new Lista();
        solamente_numeros.insertar_final(66);

        ListaGenerico<String> lista_strings = new ListaGenerico<>();
        lista_strings.insertar_final("hola");

        ListaGenerico<Double> lista_doubles = new ListaGenerico<>();
        lista_doubles.insertar_final(4.5);

    }
}
