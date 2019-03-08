package Menu;

import java.util.*;

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
    protected static ArrayList<Admins> listaAdmins = new ArrayList<Admins>();

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

}
