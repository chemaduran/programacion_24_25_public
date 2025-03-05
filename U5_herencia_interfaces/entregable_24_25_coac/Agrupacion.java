package resolucion;

public abstract class Agrupacion implements Comparable<Agrupacion> {
    protected String nombre;
   protected String autor;
    protected String autor_musica;
    protected String autor_letras;
    protected String tipo;

    public abstract void cantar_la_presentacion();

    public abstract void hacer_tipo();

    public String getAutor() {
        return autor;
    }


    @Override
    public int compareTo(Agrupacion o) {
        return this.nombre.compareTo(o.nombre);
    }
}
