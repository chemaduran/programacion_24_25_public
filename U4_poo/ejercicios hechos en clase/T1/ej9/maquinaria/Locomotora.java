package U4_poo.resolucion_clase.T1.ej9.maquinaria;

import U4_poo.resolucion_clase.T1.ej9.personal.Mecanico;

public class Locomotora {
  private String matricula;
  private int potencia;
  private int ano;
  private Mecanico mecanico;

  public Locomotora(String matricula, int potencia, int ano, Mecanico mecanico) {
    this.matricula = matricula;
    this.potencia = potencia;
    this.ano = ano;
    this.mecanico = mecanico;
  }
}
