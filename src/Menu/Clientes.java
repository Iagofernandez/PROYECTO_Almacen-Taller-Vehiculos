package Menu;

import java.util.*;

/**
 *
 * @author luis-
 */
public class Clientes {

    private String nombre;
    private String dni;

    //se rellenará según vayan registrándose clientes
    //no sirve de nada ponerlo en protected??? como protejer el array
    //accedemos a los ArrayList con static
    protected static ArrayList<Clientes> listaClientes = new ArrayList<Clientes>();

    public static void llenarClientes() {

        listaClientes.add(new Clientes("Manuel", "5555Y"));

    }

    public Clientes(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

}
