package U7_collections.teoria;

import java.util.Objects;

public class Cliente implements Comparable<Cliente> {

  private String dni;
  private String nombre;
  private int edad;

  public Cliente(String dni, String nombre, int edad) {
    this.dni = dni;
    this.nombre = nombre;
    this.edad = edad;
  }

  public String getDni() {
    return dni;
  }

  public int getEdad() {
    return edad;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;

    Cliente cliente = (Cliente) o;
    return dni.equals(cliente.dni);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dni);
  }

  @Override
  public String toString() {
    return nombre;
  }

  @Override
  public int compareTo(Cliente cliente) {
    return this.dni.compareTo(cliente.dni);
  }
}