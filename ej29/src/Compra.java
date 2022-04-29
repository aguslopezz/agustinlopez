import java.util.HashMap;

public class Compra {

    private int idCompra;
    private HashMap<Producto, Integer> productos;
    private Cliente cliente;
    private Tarjeta tarjeta;
    private String direccion;
    private float precioTotal;

    public Compra(int idCompra, HashMap<Producto, Integer> productos, Cliente cliente, Tarjeta tarjeta, String direccion, float precioTotal) {
        this.idCompra = idCompra;
        this.productos = productos;
        this.cliente = cliente;
        this.tarjeta = tarjeta;
        this.direccion = direccion;
        this.precioTotal = precioTotal;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public HashMap<Producto, Integer> getCantProductos() {
        return productos;
    }

    public void setCantProductos(HashMap<Producto, Integer> cantProductos) {
        this.productos = cantProductos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void realizarCompra(Carrito carrito){

    }
}
