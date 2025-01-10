package U4_poo.resolucion.ej2;

public class CuentaCorriente {
    static String nombreBanco = "Banco de España";
    String dni;
    private double saldo;
    private int limiteDescubrimiento;
    private String nombre;


    CuentaCorriente(String nombreRecibido, String dni) {
        this.saldo = 0;
        this.limiteDescubrimiento = -50;
        this.nombre = nombreRecibido;
        this.dni = dni;
    }


    /*
     * solo con el saldo inicial, no serán necesarios
     * los datos del titular. Por defecto el límite de
     * descubierto será 0 euros
     * */
    CuentaCorriente(double saldo) {
        this.saldo = saldo;
        limiteDescubrimiento = 0;
    }


    /*
     *con un saldo inicial, con un límite de
     *descubierto y con el DNI del titular de la cuenta.
     * */
    CuentaCorriente(double saldo, int limiteDescubrimiento, String dni) {
        this.saldo = saldo;
        this.limiteDescubrimiento = limiteDescubrimiento;
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
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