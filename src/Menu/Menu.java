package Menu;

import javax.swing.JOptionPane;
import java.util.Iterator;
import utilities.PedirDatos;
import Almacenes.*;

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
                        break; //del while
                    }

                }

                if (marca == 0) {

                    nombreClient = PedirDatos.string("Introduzca su nombre");

                    Clientes.listaClientes.add(new Clientes(nombreClient, dniClient));

                    //acceso al menu como cliente nuevo
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

    //IR ALMACENANDO EN UN FICHERO LA INFO DEL PEDIDO !!!
    //SOLO SE HA IMPLEMENTADO COMPRAR
    public void menuCliente() {

        int opcion1;

        APartesCoches ob1 = new APartesCoches();
        APartesMotos ob2 = new APartesMotos();
        ACoches ob3 = new ACoches();
        AMotos ob4 = new AMotos();

        ob1.llenarAlmacenPartesC();
        ob2.llenarAlmacenPartesM();
        ob3.llenarAlmacenC();
        ob4.llenarAlmacenM();

        do {

            opcion1 = PedirDatos.entero("Selecciona una opción:\n1- Comprar\n2- Vender\n3- Reparar\n0- Salir");

            //switch primigenio
            switch (opcion1) {
                //inicio comprar
                case 1:
                    int opcion1_2 = PedirDatos.entero("1- Partes\n2- Vehiculos");
                    //switch partes/vehiculos
                    switch (opcion1_2) {
                        //comprar partes
                        case 1:
                            int opcion1_3 = PedirDatos.entero("1- Partes Coches\n2- Partes Motos");
                            //switch comprar partes
                            switch (opcion1_3) {
                                //comprar partes de coches
                                case 1:

                                    int marca1 = 0;
                                    int unidad;
                                    String direccion;
                                    String telf;
                                    float precioTotal;

                                    String parte = PedirDatos.string("PARTES DE COCHES:\nIntroduzca la parte que desea comprar:\nliquidoFrenos\ncinturones\nllantas\neumaticos\nradios\naltavoces");

                                    for (APartesCoches z : APartesCoches.listaPartesC) {

                                        if (z.getNombreParte().equalsIgnoreCase(parte)) {

                                            unidad = PedirDatos.entero("Cuantas unidades desea?");

                                            if (unidad <= z.getUnidadesParte()) {

                                                marca1 = 1;
                                                //info pedido
                                                direccion = PedirDatos.string("Introduce tu dirección");
                                                //info pedido
                                                telf = PedirDatos.string("Introduce un teléfono de contacto");

                                                z.setUnidadesParte(z.getUnidadesParte() - unidad);
                                                //info pedido
                                                precioTotal = z.getPrecioParte() * unidad;
                                                // info pedido: nombre de la parte, unidades

                                                JOptionPane.showMessageDialog(null, "Gracias por su compra");
                                                break;

                                            } else {

                                                JOptionPane.showMessageDialog(null, "No quedan unidades de esa parte");
                                                break;
                                            }

                                        }

                                    }

                                    if (marca1 == 0) {

                                        JOptionPane.showMessageDialog(null, "Parte no reconocida o sin unidades, por favor introduzca el nombre de la parte correctamente");
                                        break;
                                    }
                                    //fin comprar partes coche
                                    break;
                                //comprar partes de motos    
                                case 2:

                                    int marca2 = 0;
                                    int unidad2;
                                    String direccion2;
                                    String telf2;
                                    float precioTotal2;

                                    String parte2 = PedirDatos.string("PARTES DE MOTOS:\nIntroduzca la parte que desea comprar:\nliquidoFrenos\ncascos\nllantas\neumaticos\nguantes\npunhos");

                                    for (APartesMotos z : APartesMotos.listaPartesM) {

                                        if (z.getNombreParte().equalsIgnoreCase(parte2)) {

                                            unidad2 = PedirDatos.entero("Cuantas unidades desea?");

                                            if (unidad2 <= z.getUnidadesParte()) {

                                                marca2 = 1;
                                                direccion2 = PedirDatos.string("Introduce tu dirección");
                                                telf2 = PedirDatos.string("Introduce un teléfono de contacto");

                                                z.setUnidadesParte(z.getUnidadesParte() - unidad2);
                                                precioTotal2 = z.getPrecioParte() * unidad2;

                                                JOptionPane.showMessageDialog(null, "Gracias por su compra");
                                                break;

                                            } else {

                                                JOptionPane.showMessageDialog(null, "No quedan unidades de esa parte");
                                                break;
                                            }

                                        }

                                    }

                                    if (marca2 == 0) {

                                        JOptionPane.showMessageDialog(null, "Parte no reconocida o sin unidades, por favor introduzca el nombre de la parte correctamente");
                                        break;

                                    }
                                    //fin de case 2 comprar partes motos
                                    break;
                                //fin del switch de partes    
                                default:
                                    JOptionPane.showMessageDialog(null, "INTRODUZCA UN NÚMERO DE OPCIÓN VÁLIDO");

                                    break;

                            }

                            break;

                        //comprar vehiculos
                        case 2:
                            int opcion1_4 = PedirDatos.entero("1- Coches\n 2-Motos");
                            //switch comprar vehiculos
                            switch (opcion1_4) {
                                //listaCoches.toString??
                                //comprar coches
                                case 1:
                                    JOptionPane.showMessageDialog(null, "Coches disponibles:\n" + ACoches.listaCoches);

                                    String modelo = PedirDatos.string("Introduzca el modelo del coche que desea comprar");
                                    float precioTotal;
                                    int marca = 0;

                                    for (ACoches z : ACoches.listaCoches) {

                                        if (z.getModelo().equalsIgnoreCase(modelo)) {

                                            if (z.getUnidades() > 0) {
                                                marca = 1;
                                                z.setUnidades(z.getUnidades() - 1);
                                                precioTotal = z.getPrecio();
                                                JOptionPane.showMessageDialog(null, "Gracias por su compra");
                                                break;

                                            } else {

                                                JOptionPane.showMessageDialog(null, "No quedan unidades de ese modelo de coche");
                                                break;

                                            }

                                        }

                                    }

                                    if (marca == 0) {

                                        JOptionPane.showMessageDialog(null, "Modelo de coche no encontrado, asegúrese de que lo escribe bien");

                                    }

                                    //fin comprar coches
                                    break;

                                //comprar motos
                                case 2:

                                    JOptionPane.showMessageDialog(null, "Coches disponibles:\n" + AMotos.listaMotos);

                                    String modelo2 = PedirDatos.string("Introduzca el modelo de la moto que desea comprar");
                                    float precioTotal2;
                                    int marca2 = 0;

                                    for (AMotos z : AMotos.listaMotos) {

                                        if (z.getModelo().equalsIgnoreCase(modelo2)) {

                                            if (z.getUnidades() > 0) {
                                                marca2 = 1;
                                                z.setUnidades(z.getUnidades() - 1);
                                                precioTotal2 = z.getPrecio();
                                                JOptionPane.showMessageDialog(null, "Gracias por su compra");
                                                break;

                                            } else {

                                                JOptionPane.showMessageDialog(null, "No quedan unidades de ese modelo de moto");
                                                break;

                                            }

                                        }

                                    }

                                    if (marca2 == 0) {

                                        JOptionPane.showMessageDialog(null, "Modelo de moto no encontrado, asegúrese de que lo escribe bien");

                                    }
                                    //fin comprar motos
                                    break;
                                //fin switch comprar vehiculos coches motos
                                default:
                                    JOptionPane.showMessageDialog(null, "INTRODUZCA UNA OPCION DE NUMERO CORRECTA");
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "INTRODUZCA UNA OPCION DE NUMERO CORRECTA");

                    }//fin comprar partes vehiculos

                    //fin switch comprar.... (primigenio)
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "INTRODUZCA UNA OPCION DE NUMERO CORRECTA");
            }
        } while (opcion1 != 0);

    }//fin metodo
}
