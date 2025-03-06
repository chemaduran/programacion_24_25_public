package U5_herencia_interfaces.teoria.clases_anonimas;

public class Animal implements Comparable {
    int id;
    String nombre;

    public Animal(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nombre='" + nombre + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return id == animal.id;
    }

    @Override
    public int compareTo(Object o) {
        int resultado;
        Animal otro = (Animal) o;
        resultado = Integer.compare(this.id, otro.id);
        return resultado;
    }
}
