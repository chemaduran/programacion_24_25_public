package resolucion;

public class Comparsa  extends AgrupacionOficial {
    private String empresa_atrezzo;

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la comparsa " + nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El comparsa" + nombre + " va de " + tipo);
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("La comparsa " + nombre + " va caminito del falla");
    }
}
