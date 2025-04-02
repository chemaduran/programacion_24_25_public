package U7_collections.en_clase.lista_compra_jesus;

import java.util.*;

public class Jesusdona {
    private static Map<String, Double> listaProductos = new HashMap<>();

    public static void main(String[] args) {
        listaProductos.put("tomate", 1.59);
        listaProductos.put("quinoa", 4.5);
        listaProductos.put("avena", 2.21);

        List<Item> listaCompra = new ArrayList<>();

        listaCompra.add(new Item("tomate", 1));
        listaCompra.add(new Item("quinoa", 2));
        listaCompra.add(new Item("avena", 1));
        listaCompra.add(new Item("tomate", 2));

        Iterator<Item> it = listaCompra.iterator();
        System.out.println("| Producto | Precio | Cantidad | Subtotal |");
        double total = 0.0;
        while (it.hasNext()) {
            Item item = it.next();
            double subtotal = listaProductos.get(item.getProducto()) * item.getCantidad();
            total += subtotal;
            System.out.println("| " + item.getProducto() + " | " + listaProductos.get(item.getProducto()) + " | " + item.getCantidad() + " | " + subtotal);
        }

        System.out.println("Total: " + total);


    }
}
