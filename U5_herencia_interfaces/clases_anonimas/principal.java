package U5_herencia_interfaces.teoria.clases_anonimas;

import java.util.Arrays;
import java.util.Comparator;

public class principal {
  public static void main(String[] args) {
    //
    Animal caballo = new Animal(2, "Caballo");
    Animal koala = new Animal(6, "Koala");
    Animal centollo5 = new Animal(5, "Centollo");
    Animal centollo3 = new Animal(3, "Centollo");

    Animal[] animals = new Animal[4];
    animals[0] = koala;
    animals[1] = caballo;
    animals[2] = centollo5;
    animals[3] = centollo3;

    System.out.println(caballo.compareTo(koala));

//    ComparaAnimalesNombre comparador = new ComparaAnimalesNombre();

    Comparator comparador = (o1, o2) -> {
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
    };





    Arrays.sort(animals, comparador);

    System.out.println(Arrays.toString(animals));
  }
}
