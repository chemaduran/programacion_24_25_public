package U4_poo.resolucion_clase.T1.ej9;

import U4_poo.resolucion_clase.T1.ej9.maquinaria.Locomotora;
import U4_poo.resolucion_clase.T1.ej9.maquinaria.Tren;
import U4_poo.resolucion_clase.T1.ej9.personal.Maquinista;
import U4_poo.resolucion_clase.T1.ej9.personal.Mecanico;

public class principal_trenes {
  public static void main(String[] args) {
    Mecanico mecanico = new Mecanico("Antonio", 43489, "Informático");
    Locomotora locomotora1 = new Locomotora("947", 1000, 1997, mecanico);
    Maquinista maquinista1 = new Maquinista("Javicito", "957565", 4, "Programador junior");

    Tren tren = new Tren(locomotora1, maquinista1, 5);
    tren.mostrar_informacion();
  }
}
