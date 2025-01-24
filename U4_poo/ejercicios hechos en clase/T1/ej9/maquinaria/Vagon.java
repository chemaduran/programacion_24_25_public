package U4_poo.resolucion_clase.T1.ej9.maquinaria;

class Vagon {
  private int carga_maxima;
  private int carga_actual;
  private String tipo_mercancia;

  public Vagon(int carga_maxima, int carga_actual, String tipo_mercancia) {
    this.carga_maxima = carga_maxima;
    this.carga_actual = carga_actual;
    this.tipo_mercancia = tipo_mercancia;
  }

  public void mostrar_informacion() {
    System.out.println(tipo_mercancia + " " + carga_maxima + " " + carga_actual);
  }
}
