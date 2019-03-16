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

    public static void llenarAdmins() {

        listaAdmins.add(new Admins("Rodolfo", "1990123"));
        listaAdmins.add(new Admins("Jose", "1991123"));
        listaAdmins.add(new Admins("Mari", "1992123"));

    }

    public Admins(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

}
