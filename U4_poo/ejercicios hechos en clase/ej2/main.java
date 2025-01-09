package U4_poo.resolucion.ej2;

public class main {
    public static void main(String[] args) {
        // codigo main
        CuentaCorriente a = new CuentaCorriente("Antonio", "86897W");

        // Con el saldo
        CuentaCorriente cuentaConSaldo = new CuentaCorriente(100);

        // Con el saldo, limíte de descubrimiento y Dni
        CuentaCorriente cuentaCompleta = new CuentaCorriente(100.000, 0, "91310109Z");

        cuentaConSaldo.setDni("buenas noches");

        cuentaConSaldo.getDni();


    }
}
