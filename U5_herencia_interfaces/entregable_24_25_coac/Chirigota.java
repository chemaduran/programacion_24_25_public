package resolucion;

public class Chirigota extends AgrupacionOficial implements Callejera {
    private int num_cuples;

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Chirigota " + nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El chirigota " + nombre + " va de " + tipo);
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("La chirigota " + nombre + " va caminito del falla");
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la Chirigota " + nombre);
    }
}
