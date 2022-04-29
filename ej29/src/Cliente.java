import java.util.HashSet;

public class Cliente {

    private int idCliente;
    private String nombre;
    private String direccionEnvio;
    private String direccionCobro;
    private String email;
    private Boolean esPrefencial;
    private HashSet<Tarjeta>tarjetas;
    private HashSet<Carrito>carritos;

    public Cliente(int id, String nombre, String direccionEnvio, String direccionCobro, String email, Boolean esPrefencial, HashSet<Tarjeta> tarjetas, HashSet<Carrito> carritos) {
        this.idCliente = id;
        this.nombre = nombre;
        this.direccionEnvio = direccionEnvio;
        this.direccionCobro = direccionCobro;
        this.email = email;
        this.esPrefencial = esPrefencial;
        this.tarjetas = tarjetas;
        this.carritos = carritos;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getDireccionCobro() {
        return direccionCobro;
    }

    public void setDireccionCobro(String direccionCobro) {
        this.direccionCobro = direccionCobro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEsPrefencial() {
        return esPrefencial;
    }

    public void setEsPrefencial(Boolean esPrefencial) {
        this.esPrefencial = esPrefencial;
    }

    public HashSet<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(HashSet<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public HashSet<Carrito> getCarritos() {
        return carritos;
    }

    public void setCarritos(HashSet<Carrito> carritos) {
        this.carritos = carritos;
    }
}
