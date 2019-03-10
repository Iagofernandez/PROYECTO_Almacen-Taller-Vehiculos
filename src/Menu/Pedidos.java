package Menu;

/**
 *
 * @author luis-
 */
public class Pedidos {

    private String nombreProducto;
    private int unidades;
    private String direccion;
    private String telf;

    public Pedidos(String nombreProducto, int unidades, String direccion, String telf) {
        this.nombreProducto = nombreProducto;
        this.unidades = unidades;
        this.direccion = direccion;
        this.telf = telf;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getUnidades() {
        return unidades;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelf() {
        return telf;
    }

}
