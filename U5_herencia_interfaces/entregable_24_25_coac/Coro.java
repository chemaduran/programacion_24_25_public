package resolucion;

public class Coro extends AgrupacionOficial{
    private int num_bandurrias;
    private int num_guitarras;

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Coro " + nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El coro " + nombre + " va de " + tipo);
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("El coro " + nombre + " va caminito del falla");
    }
}
