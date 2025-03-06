package U5_herencia_interfaces.teoria.clases_anonimas;

import java.util.Comparator;

public class ComparaAnimalesNombre implements Comparator {
  @Override
  public int compare(Object o1, Object o2) {
    int resultado;
    Animal a1 = (Animal) o1;
    Animal a2 = (Animal) o2;

    int por_nombre = a1.nombre.compareTo(a2.nombre);
    if (por_nombre == 0) {
      return a1.compareTo(a2);
    } else {
      resultado = por_nombre;
    }

    return resultado;
  }
}
