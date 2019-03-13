package almacen_taller_vehiculos;

import Menu.MenuCliente;
import Menu.MenuAcceso;
import javax.swing.JOptionPane;
import utilities.PedirDatos;

/**
 *
 * @author luis-
 */
public class Almacen_Taller_Vehiculos extends MenuAcceso {

    public static void main(String[] args) {

        MenuAcceso objAc = new MenuAcceso();

        int opcion;

        do {

            opcion = PedirDatos.entero("1- CLIENTES\n2- ADMINISTRADORES\n0- SALIR");

            switch (opcion) {

                case 1:

                    objAc.accederMenu(Personas.CLIENTES);
                    break;

                case 2:

                    objAc.accederMenu(Personas.ADMINS);

                    break;

                    
                case 0 : 
                    System.exit(0);
                    
                default:
                    JOptionPane.showMessageDialog(null, "Introduzca una opción numérica válida");

            }

        } while (opcion != 0);

    }
}
