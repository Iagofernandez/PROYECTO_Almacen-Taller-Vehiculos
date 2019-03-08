package Menu;

import javax.swing.JOptionPane;
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
                        break; //o system exit
                    }

                }

                if (marca == 0) {

                    nombreClient = PedirDatos.string("Introduzca su nombre");

                    Clientes.listaClientes.add(new Clientes(nombreClient, dniClient));

                    //acceso al menu como cliente nuevo
                }

            }

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
                }

            }
            if (marca == 0) {

                JOptionPane.showMessageDialog(null, "Nombre o Password incorrectos");

            }

        }

    }

    public void menuUsuario() {

        int opcion1 = PedirDatos.entero("Selecciona una opción:\n1- Comprar\n2- Vender\n3- Reparar");

        switch (opcion1) {

            case 1:
                int opcion2 = PedirDatos.entero("1- Partes\n2- Vehiculos");

                switch (opcion2) {

                    case 1 : 
                        
                        //meter el pedido en un arraylist
                        //hacer con un while los set del builder 
                        //meter todos esos set en otro arraylist
                        //vaciarlo en el programa para la creacioón del objeto
                        //devolver ese objeto
                        //clase con solo el nombre y la unidad de la parte? ??
                        
                        /*
                        Si no va:
                        poner solo con las unidades, de manera simple
                        */
                        
                        
                        
                        
                        
                        
                }

                break;
                
                
                
                
            default : JOptionPane.showMessageDialog(null, "ERROR, introduce una opcion válida");

        }

    }

}
