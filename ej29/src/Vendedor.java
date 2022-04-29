
public class Vendedor {
    private int idVendedor;
    private String Nombre;
    private String apellido;

    public Vendedor(int idVendedor, String nombre, String apellido) {
        this.idVendedor = idVendedor;
        Nombre = nombre;
        this.apellido = apellido;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
