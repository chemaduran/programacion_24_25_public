package EjemploCajero;

public class Usuario {
    protected String nombre;
    protected String pass;
    protected String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Usuario(String nombre, String pass, String direccion) {
        this.nombre = nombre;
        this.pass = pass;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' + ", pass='" + pass + '\'' + ", direccion='" + direccion + '\'';
    }
}
