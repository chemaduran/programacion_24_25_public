package resolucion;

public class Cuarteto  extends AgrupacionOficial implements Callejera {
    private int num_miembros;


    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Cuarteto " + nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El cuarteto " + nombre + " va de " + tipo);
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("El cuarteto " + nombre + " va caminito del falla");
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el cuarteto " + nombre);
    }
}
