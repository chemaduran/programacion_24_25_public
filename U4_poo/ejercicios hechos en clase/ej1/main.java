package U4_poo.resolucion.ej1;

public class main {
    public static void main(String[] args) {
        // codigo main

        CuentaCorriente a = new CuentaCorriente("Antonio", "86897W");

        a.ingresarDinero(100);
        a.mostrarInfo();
        System.out.println();
        //------------------
        a.sacarDinero(100);
        a.mostrarInfo();
        System.out.println();
        //------------------
        a.sacarDinero(50);
        a.mostrarInfo();
        System.out.println();
        //------------------
        a.sacarDinero(50);
        a.mostrarInfo();
        //------------------
        System.out.println();


    }
}
