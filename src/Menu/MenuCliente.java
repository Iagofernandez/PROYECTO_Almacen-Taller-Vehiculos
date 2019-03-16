package Menu;

import javax.swing.JOptionPane;
import Almacenes.*;
import utilities.PedirDatos;
import Escritura_Lectura.*;

/**
 *
 * @author lvaqueiroperez
 */
public class MenuCliente {
    
    public static void menuCliente() {
        int opcion1;
        
        do {
            
            opcion1 = PedirDatos.entero("Selecciona una opción:\n1- Comprar\n0- Finalizar pedido y salir");

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
                                    
                                    String parte = PedirDatos.string("PARTES DE COCHES:\nIntroduzca la parte que desea comprar:\nliquidoFrenos   5.75 euros\ncinturones   4 euros\nllantas   15 euros\neumaticos   17.5 euros\nradios   23 euros\naltavoces   30 euros");
                                    
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
                                                
                                                String nombreFichPC = PedirDatos.string("Introduce tu nombre");
                                                
                                                Escribir.pedido(parte, unidad, direccion, telf, precioTotal, nombreFichPC);
                                                
                                                Escribir.fichPartesCoches(APartesCoches.listaPartesC);
                                                
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
                                    
                                    String parte2 = PedirDatos.string("PARTES DE MOTOS:\nIntroduzca la parte que desea comprar:\nliquidoFrenos   5.75 euros\ncascos   12 euros\nllantas   15 euros\neumaticos   17.5 euros\nguantes   15 euros\npunhos   30 euros");
                                    
                                    for (APartesMotos z : APartesMotos.listaPartesM) {
                                        
                                        if (z.getNombreParte().equalsIgnoreCase(parte2)) {
                                            
                                            unidad2 = PedirDatos.entero("Cuantas unidades desea?");
                                            
                                            if (unidad2 <= z.getUnidadesParte()) {
                                                
                                                marca2 = 1;
                                                direccion2 = PedirDatos.string("Introduce tu dirección");
                                                telf2 = PedirDatos.string("Introduce un teléfono de contacto");
                                                
                                                z.setUnidadesParte(z.getUnidadesParte() - unidad2);
                                                precioTotal2 = z.getPrecioParte() * unidad2;
                                                
                                                String nombreFichPM = PedirDatos.string("Introduce tu nombre");
                                                
                                                Escribir.pedido(parte2, unidad2, direccion2, telf2, precioTotal2, nombreFichPM);
                                                
                                                Escribir.fichPartesMotos(APartesMotos.listaPartesM);
                                                
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
                                    float precioTotal3;
                                    int marca = 0;
                                    
                                    for (ACoches z : ACoches.listaCoches) {
                                        
                                        if (z.getModelo().equalsIgnoreCase(modelo)) {
                                            
                                            if (z.getUnidades() > 0) {
                                                marca = 1;
                                                z.setUnidades(z.getUnidades() - 1);
                                                precioTotal3 = z.getPrecio();
                                                
                                                String direccion3 = PedirDatos.string("Introduce una dirección");
                                                String telf3 = PedirDatos.string("Introduce un teléfono");
                                                
                                                String nombreFichC = PedirDatos.string("Introduce tu nombre");
                                                
                                                Escribir.pedido(modelo, 1, direccion3, telf3, precioTotal3, nombreFichC);
                                                
                                                Escribir.fichCoches(ACoches.listaCoches);
                                                
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
                                    float precioTotal4;
                                    int marca2 = 0;
                                    
                                    for (AMotos z : AMotos.listaMotos) {
                                        
                                        if (z.getModelo().equalsIgnoreCase(modelo2)) {
                                            
                                            if (z.getUnidades() > 0) {
                                                marca2 = 1;
                                                z.setUnidades(z.getUnidades() - 1);
                                                precioTotal4 = z.getPrecio();
                                                
                                                String direccion4 = PedirDatos.string("Introduce una dirección");
                                                String telf4 = PedirDatos.string("Introduce un teléfono");
                                                
                                                String nombreFichM = PedirDatos.string("Introduce tu nombre");
                                                
                                                Escribir.pedido(modelo2, 1, direccion4, telf4, precioTotal4, nombreFichM);
                                                
                                                Escribir.fichMotos(AMotos.listaMotos);
                                                
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
                //opcion de salir
                case 0:
                    
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "INTRODUZCA UNA OPCION DE NUMERO CORRECTA");
            }
        } while (opcion1 != 0);
        
    }//fin metodo
}
