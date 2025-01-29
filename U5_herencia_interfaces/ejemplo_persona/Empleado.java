package U5_herencia_interfaces.teoria.ejemplo_persona;

public class Empleado extends Persona {
    double salario;
    String estatura = "";

    public Empleado(String nombre, int edad, double estatura, double salario) {
        super(nombre, edad, estatura, 1234);
        this.salario = salario;
    }

    // Este es un método normal de la clase empleado
    public double getSalario() {
        return this.salario;
    }

    // Estoy sobreescribiendo el método de la clase base
    @Override
    public String getNombre() {
        return "El nombre es: " + this.nombre;
    }

    @Override
    public String toString() {
        return "Empleado{"
                + "nombre='"
                + nombre
                + '\''
                + ", edad="
                + edad
                + ", estatura="
                + super.dni
                + ", salario="
                + salario
                + '}';
    }

    @Override
    public boolean equals(Object otra_persona) {
        if (this == otra_persona) return true;
        if (otra_persona == null || getClass() != otra_persona.getClass()) return false;
        if (!super.equals(otra_persona)) return false;
        Empleado empleado = (Empleado) otra_persona;
        return Double.compare(salario, empleado.salario) == 0;
    }
}
