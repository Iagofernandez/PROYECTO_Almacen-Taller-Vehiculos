package Menu;

import javax.swing.JOptionPane;
import java.util.Iterator;
import utilities.PedirDatos;
import Menu.MenuCliente;

/**
 *
 * @author luis-
 */
public class MenuAcceso {

    protected enum Personas {

        CLIENTES,
        ADMINS

    }

    public void accederMenu(Personas user) {
        JOptionPane.showMessageDialog(null, "BIENVENIDO");
        if (user == Personas.CLIENTES) {

            String nombreClient;
            String dniClient;

            dniClient = PedirDatos.string("Por favor, introduzca su dni");

            if (Clientes.listaClientes.isEmpty()) {
                nombreClient = PedirDatos.string("Introduzca su nombre");

                Clientes.listaClientes.add(new Clientes(nombreClient, dniClient));

                //acceso al menu como cliente nuevo en lista vacía
                MenuCliente.menuCliente();
                
            } else {

                int marca = 0;

                Iterator it = Clientes.listaClientes.iterator();

                while (it.hasNext()) {

                    Clientes client = (Clientes) it.next();

                    if (client.getDni().equalsIgnoreCase(dniClient)) {
                        //acceso al menú como cliente existente
                        marca = 1;

                        JOptionPane.showMessageDialog(null, "Hola de nuevo, " + client.getNombre());
                        
                        MenuCliente.menuCliente();
                       
                        break; 
                    }

                }

                if (marca == 0) {

                    nombreClient = PedirDatos.string("Introduzca su nombre");

                    Clientes.listaClientes.add(new Clientes(nombreClient, dniClient));

                    //acceso al menu como cliente nuevo
                    
                    MenuCliente.menuCliente();
                }

            }
            //hacer aquí un do while por intentos???
        } else if (user == Personas.ADMINS) {

            JOptionPane.showMessageDialog(null, "Modo Administrador");

            String nombre = PedirDatos.string("Introduzca su nombre:");
            String pass = PedirDatos.string("Introduzca su password");
            int marca = 0;

            Iterator it = Admins.listaAdmins.iterator();

            while (it.hasNext()) {

                Admins adm = (Admins) it.next();

                if (adm.getNombre().equals(nombre) && adm.getPassword().equals(pass)) {
                    marca = 1;
                    JOptionPane.showMessageDialog(null, "Acceso concedido");

                    //acceso al menu de administradores
                    //salir con break o system out
                    break;
                }

            }
            if (marca == 0) {

                JOptionPane.showMessageDialog(null, "Nombre o Password incorrectos");

            }

        }

    }

}
