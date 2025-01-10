package U4_poo.resolucion_clase.T1.ej9.maquinaria;

import U4_poo.resolucion_clase.T1.ej9.personal.Maquinista;

public class Tren {
  private Locomotora locomotora;
  private Vagon[] vagones;
  private Maquinista maquinista;

  public Tren(Locomotora locomotora, Maquinista maquinista, int cantidad_vagones) {
    this.locomotora = locomotora;
    this.maquinista = maquinista;
    vagones = new Vagon[0];

    if (cantidad_vagones <= 5) {
      vagones = new Vagon[cantidad_vagones];
      for (int i = 0; i < cantidad_vagones; i++) {
        Vagon v1 = new Vagon(100, 90, "Caracoles");
        vagones[i] = v1;
      }
    }
  }

  public void mostrar_informacion() {
    for (int i = 0; i < vagones.length; i++) {
      vagones[i].mostrar_informacion();
    }
  }
}
