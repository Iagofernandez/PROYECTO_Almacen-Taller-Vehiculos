package Menu;

import javax.swing.JOptionPane;
import Almacenes.*;
import Escritura_Lectura.Escribir;
import utilities.PedirDatos;

/**
 *
 * @author luis-
 */
public class MenuAdmin {

    public static void menuAdmins() {

        int opcion = 0;
        String parteC;
        String parteM;
        String coche;
        String moto;
        int unidadesPC;
        int unidadesPM;
        int unidadesC;
        int unidadesM;

        do {

            opcion = PedirDatos.entero("Introduce una opción:\n1- unidades Partes Coches\n2- unidades Partes Motos\n3- unidades Coches\n4- unidades Motos\n0- SALIR");
            //switch opcion primigenia
            switch (opcion) {
                //partes coche
                case 1:

                    parteC = PedirDatos.string("Introduce la parte del coche que quieres aumentar/disminuír:\nliquidoFrenos\ncinturones\nllantas\nneumaticos\nradios\naltavoces ");
                    int marca1 = 0;

                    for (APartesCoches z : APartesCoches.listaPartesC) {

                        if (z.getNombreParte().equalsIgnoreCase(parteC)) {
                            marca1 = 1;
                            JOptionPane.showMessageDialog(null, "Unidades actuales: " + z.getUnidadesParte());

                            int opcion2;

                            opcion2 = PedirDatos.entero("1- Añadir\n2- Quitar");
                            //switch añadir/quitar partes coche
                            switch (opcion2) {

                                //añadir partes coche
                                case 1:

                                    unidadesPC = PedirDatos.entero("Introduce el número de unidades a añadir:");

                                    z.setUnidadesParte(z.getUnidadesParte() + unidadesPC);

                                    Escribir.fichPartesCoches(APartesCoches.listaPartesC);

                                    JOptionPane.showMessageDialog(null, "Unidades de " + parteC + ": " + z.getUnidadesParte());

                                    break;
                                // quitar partes coche    
                                case 2:

                                    unidadesPC = PedirDatos.entero("Introduce el número de unidades a quitar:");

                                    z.setUnidadesParte(z.getUnidadesParte() - unidadesPC);

                                    Escribir.fichPartesCoches(APartesCoches.listaPartesC);

                                    JOptionPane.showMessageDialog(null, "Unidades de " + parteC + ": " + z.getUnidadesParte());

                                    break;

                                default:
                                    JOptionPane.showMessageDialog(null, "ERROR, introduce una opción correcta");

                                    break;

                            }

                        }

                    }

                    if (marca1 == 0) {

                        JOptionPane.showMessageDialog(null, "No se ha encontrado la parte introducida, asegúrate de escribirla bien");
                        break;
                    }
                    //fin case 1 primigenio
                    break;
                //partes moto 
                case 2:
                    parteM = PedirDatos.string("Introduce la parte de la moto que quieres aumentar/disminuír:\nliquidoFrenos\ncascos\nllantas\nneumaticos\nguantes\npuños");
                    int marca2 = 0;
                    for (APartesMotos z : APartesMotos.listaPartesM) {

                        if (z.getNombreParte().equalsIgnoreCase(parteM)) {
                            marca2 = 1;
                            JOptionPane.showMessageDialog(null, "Unidades actuales: " + z.getUnidadesParte());

                            int opcion3;

                            opcion3 = PedirDatos.entero("1- Añadir\n2- Quitar");
                            //switch añadir/quitar partes moto
                            switch (opcion3) {

                                //añadir partes moto
                                case 1:

                                    unidadesPM = PedirDatos.entero("Introduce el número de unidades a añadir:");

                                    z.setUnidadesParte(z.getUnidadesParte() + unidadesPM);

                                    Escribir.fichPartesMotos(APartesMotos.listaPartesM);

                                    JOptionPane.showMessageDialog(null, "Unidades de " + parteM + ": " + z.getUnidadesParte());

                                    break;
                                // quitar partes moto  
                                case 2:

                                    unidadesPM = PedirDatos.entero("Introduce el número de unidades a quitar:");

                                    z.setUnidadesParte(z.getUnidadesParte() - unidadesPM);

                                    JOptionPane.showMessageDialog(null, "Unidades de " + parteM + ": " + z.getUnidadesParte());

                                    Escribir.fichPartesMotos(APartesMotos.listaPartesM);

                                    break;

                                default:
                                    JOptionPane.showMessageDialog(null, "ERROR, introduce una opción correcta");

                                    break;

                            }

                        }

                    }

                    if (marca2 == 0) {

                        JOptionPane.showMessageDialog(null, "No se ha encontrado la parte introducida, asegúrate de escribirla bien");
                        break;

                    }
                    //fin case 2 primigenio
                    break;
                //coches
                case 3:

                    coche = PedirDatos.string("Introduce el modelo del coche que quieres aumentar/disminuir\n" + ACoches.listaCoches);
                    int marca3 = 0;

                    for (ACoches z : ACoches.listaCoches) {

                        if (z.getModelo().equalsIgnoreCase(coche)) {
                            marca3 = 1;
                            JOptionPane.showMessageDialog(null, "Unidades actuales: " + z.getUnidades());

                            int opcion4;

                            opcion4 = PedirDatos.entero("1- Añadir\n2- Quitar");
                            //switch añadir/vender coches
                            switch (opcion4) {

                                //añadir coche
                                case 1:

                                    unidadesC = PedirDatos.entero("Introduce el número de unidades a añadir:");

                                    z.setUnidades(z.getUnidades() + unidadesC);

                                    Escribir.fichCoches(ACoches.listaCoches);

                                    JOptionPane.showMessageDialog(null, "Unidades de " + coche + ": " + z.getUnidades());

                                    break;
                                // quitar coche  
                                case 2:

                                    unidadesC = PedirDatos.entero("Introduce el número de unidades a quitar:");

                                    z.setUnidades(z.getUnidades() - unidadesC);

                                    Escribir.fichCoches(ACoches.listaCoches);

                                    JOptionPane.showMessageDialog(null, "Unidades de " + coche + ": " + z.getUnidades());

                                    break;

                                default:
                                    JOptionPane.showMessageDialog(null, "ERROR, una opción correcta");

                                    break;

                            }

                        }

                    }

                    if (marca3 == 0) {

                        JOptionPane.showMessageDialog(null, "No se ha encontrado el coche introducido, asegúrate de escribirla bien");
                        break;

                    }
                    //fin case 3 primigenio
                    break;

                //motos
                case 4:
                    moto = PedirDatos.string("Introduce el modelo de la moto que quieres aumentar/disminuir\n" + AMotos.listaMotos);
                    int marca4 = 0;

                    for (AMotos z : AMotos.listaMotos) {

                        if (z.getModelo().equalsIgnoreCase(moto)) {
                            marca4 = 1;
                            JOptionPane.showMessageDialog(null, "Unidades actuales: " + z.getUnidades());

                            int opcion4;

                            opcion4 = PedirDatos.entero("1- Añadir\n2- Quitar");
                            //switch añadir/quitar motos
                            switch (opcion4) {

                                //añadir moto
                                case 1:

                                    unidadesM = PedirDatos.entero("Introduce el número de unidades a añadir:");

                                    z.setUnidades(z.getUnidades() + unidadesM);

                                    Escribir.fichMotos(AMotos.listaMotos);

                                    JOptionPane.showMessageDialog(null, "Unidades de " + moto + ": " + z.getUnidades());

                                    break;
                                // quitar moto  
                                case 2:

                                    unidadesM = PedirDatos.entero("Introduce el número de unidades a quitar:");

                                    z.setUnidades(z.getUnidades() - unidadesM);

                                    Escribir.fichMotos(AMotos.listaMotos);

                                    JOptionPane.showMessageDialog(null, "Unidades de " + moto + ": " + z.getUnidades());

                                    break;

                                default:
                                    JOptionPane.showMessageDialog(null, "ERROR, una opción correcta");

                                    break;

                            }

                        }

                    }

                    if (marca4 == 0) {

                        JOptionPane.showMessageDialog(null, "No se ha encontrado la moto, asegúrate de escribirla bien");
                        break;

                    }
                    //fin case 4 primigenio
                    break;
                //salir del programa (primigenio)
                case 0:
                    System.exit(0);

                    break;
                //default primigenio
                default:
                    JOptionPane.showMessageDialog(null, "ERROR, introduce una opcion correcta");

            }

        } while (opcion != 0);

    }

}
