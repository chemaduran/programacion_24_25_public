package EjemploCajero;

public class Cajero extends Usuario {
    private int idCajero;
    private int anyo;
//
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Cajero cajero = (Cajero) o;
        return idCajero == cajero.idCajero && anyo == cajero.anyo;
    }

    @Override
    public String toString() {
        return "Cajero{" +
                super.toString() +
                ", idCajero=" + idCajero +
                ", anyo=" + anyo +
                '}';
    }

    public int getIdCajero() {
        return idCajero;
    }

    public void setIdCajero(int idCajero) {
        this.idCajero = idCajero;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public Cajero(String nombre, String pass, String direccion, int idCajero, int anyo) {
        super(nombre, pass, direccion);
        this.idCajero = idCajero;
        this.anyo = anyo;
    }
}
