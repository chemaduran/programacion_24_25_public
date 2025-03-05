package resolucion;

public class Integrante {
    private int numero_participante;
    private String nombre;
    private int edad;
    private String localidad;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Integrante that = (Integrante) o;
        return numero_participante == that.numero_participante;
    }

}
