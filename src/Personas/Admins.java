package Personas;

import java.util.*;
import almacen_taller_vehiculos.Menu;

/**
 *
 * @author luis-
 */
public class Admins {

    private String nombre;
    private String password;

    //Se inicializa al principio del programa automáticamente
    //no sirve de nada ponerlo en protected???
    //accedemos a los arrayList con static
    private ArrayList<Admins> listaAdmins = new ArrayList<Admins>();

}
