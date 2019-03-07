package Personas;

import java.util.*;

import almacen_taller_vehiculos.Menu;

/**
 *
 * @author luis-
 */
public class Clientes {

    private String nombre;
    private String dni;

    //se rellenará según vayan registrándose clientes
    //no sirve de nada ponerlo en protected???
    //accedemos a los ArrayList con static
    public static ArrayList<Clientes> listaClientes = new ArrayList<Clientes>();

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
