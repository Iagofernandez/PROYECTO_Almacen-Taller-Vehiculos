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
        
        do{
        
        int opcion = PedirDatos.entero("1- CLIENTES\n2- ADMINISTRADORES\n0- SALIR");
        
        
        objAc.accederMenu(Personas.CLIENTES);
        
        
        }while(opcion != 0);
        
    }
}
