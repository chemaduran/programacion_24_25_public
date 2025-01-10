package U4_poo.resolucion.ej1;

public class CuentaCorriente {
    static String nombreBanco = "Banco de España";
    double saldo;
    int limiteDescubrimiento;
    String nombre;
    String dni;

    CuentaCorriente(String nombreRecibido, String dni) {
        this.saldo = 0;
        this.limiteDescubrimiento = -50;
        this.nombre = nombreRecibido;
        this.dni = dni;
    }

    void ingresarDinero(double cantidad) {
        if (cantidad > 0)
            this.saldo += cantidad;
    }


    boolean sacarDinero(double dineroASacar) {
        boolean resultado = false;
        if (dineroASacar <= saldo - limiteDescubrimiento) {
            saldo -= dineroASacar;
            System.out.print("Es posible sacar " + dineroASacar + " euros.");
            resultado = true;
        } else {
            System.out.print("No ha sido posible sacar el dinero");
        }

        return resultado;
    }

    void mostrarInfo() {
        System.out.println("El saldo es " + saldo);
        System.out.println("El nombre del titular es " + nombre);
        System.out.println("El DNI del titular es " + dni);
        System.out.println("El nombre del banco es " + nombreBanco);
        System.out.println("El límite de descubrimiento es " + limiteDescubrimiento);
    }


}