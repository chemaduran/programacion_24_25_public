package resolucion;

public class Romancero extends Agrupacion implements Callejera {

    private String tematica_cartelon;


    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Romancero " + nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El romancero " + nombre + " va de " + tipo);
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el romancero " + nombre);
    }
}
