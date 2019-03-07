package almacen_taller_vehiculos;

import javax.swing.JOptionPane;
import Personas.*;
import java.util.Iterator;
import utilities.PedirDatos;

/**
 *
 * @author luis-
 */
public class Menu {

    protected enum Personas {

        CLIENTES,
        ADMINS

    }

    public void menuUsuario(Personas user) {
        JOptionPane.showMessageDialog(null, "BIENVENIDO");
        if (user == Personas.CLIENTES) {

            String nombreClient;
            String dniClient;

            dniClient = PedirDatos.string("Por favor, introduzca su dni");

            if (Clientes.listaClientes.isEmpty()) {
                nombreClient = PedirDatos.string("Introduzca su nombre");

                Clientes.listaClientes.add(new Clientes(nombreClient, dniClient));

                //acceso al menu como cliente nuevo en lista vacía
            } else {

                int marca = 0;

                Iterator it = Clientes.listaClientes.iterator();

                while (it.hasNext()) {

                    Clientes client = (Clientes) it.next();

                    if (client.getDni().equalsIgnoreCase(dniClient)) {
                        //acceso al menú como cliente existente
                        marca = 1;

                        JOptionPane.showMessageDialog(null, "Hola de nuevo, " + client.getNombre());

                        //OPERACIONES CLIENTE ENCONTRADO EN LA LISTA 
                        //(CUANDO ACABE UN BREAK) (HABRÁ UN SWITCH, OPCION DE SALIR DEL SWITCH QUE SALGA TAMBIEN CON UN BREAK DEL WHILE)
                        //(menu en libreria para no llenar el codigo de basura)
                        break;
                    }

                }

                if (marca == 0) {

                    nombreClient = PedirDatos.string("Introduzca su nombre");

                    Clientes.listaClientes.add(new Clientes(nombreClient, dniClient));

                    //acceso al menu como cliente nuevo
                }

            }

        }

    }

}
