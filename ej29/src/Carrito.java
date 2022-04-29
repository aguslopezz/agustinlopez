import java.util.HashMap;

public class Carrito {
    private int idCarrito;
    private HashMap<Producto, Integer> productos;
    private Cliente cliente;


    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }

    public HashMap<Producto, Integer> getCantidadProductos() {
        return productos;
    }

    public void setCantidadProductos(HashMap<Producto, Integer> cantidadProductos) {
        this.productos = cantidadProductos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agregarProductos(Producto producto, int cantidad){
        if (productos.containsKey(producto)){
            productos.replace(producto, productos.get(producto) + cantidad);
        }
        else {
            productos.put(producto, cantidad);
        }
    }


}
