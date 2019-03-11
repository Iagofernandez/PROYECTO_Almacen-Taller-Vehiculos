package almacen_taller_vehiculos;

import Menu.MenuCliente;
import Menu.MenuAcceso;
import javax.swing.JOptionPane;

/**
 *
 * @author luis-
 */
public class Almacen_Taller_Vehiculos extends MenuAcceso {

    public static void main(String[] args) {

        MenuCliente objMenu = new MenuCliente();
        MenuAcceso objAc = new MenuAcceso();
        
        objAc.accederMenu(Personas.CLIENTES);
        

    }
}
