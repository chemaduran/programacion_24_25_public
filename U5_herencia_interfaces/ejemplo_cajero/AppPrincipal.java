package EjemploCajero;

public class AppPrincipal {
    public static void main(String[] args) {
        Cajero c1 = new Cajero("Flavito", "12345", "Calle piruleta", 1, 2004);
        Cajero c2 = new Cajero("Manolita", "54321", "Calle gominola", 2, 2025);

        GestorCajero gestorCajero = new GestorCajero();

        gestorCajero.add_cajero(c1);
        gestorCajero.add_cajero(c2);

        System.out.println(gestorCajero);


    }
}
