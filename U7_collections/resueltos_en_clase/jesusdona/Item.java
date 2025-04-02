package U7_collections.en_clase.lista_compra_jesus;

public class Item {
    private String producto;
    private Integer cantidad;

    public Item(String producto, Integer cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Item{" +
                "producto='" + producto + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
