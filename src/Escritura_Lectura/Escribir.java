package Escritura_Lectura;

import java.io.*;
import java.util.*;
import Almacenes.*;

/**
 *
 * @author lvaqueiroperez
 */
public class Escribir {

    public static void pedido(String nombreProducto, int unidades, String direccion, String telf, float precio, String nombreFich) {

        File fich = null;

        PrintWriter f = null;

        try {

            f = new PrintWriter(new File("FACTURA" + nombreFich + ".txt"));

            f.println("FACTURA DEL PEDIDO:");
            f.println("");
            f.println("Producto: " + nombreProducto);
            f.println("Unidades: " + unidades);

            f.println("Direccion: " + direccion);
            f.println("Telf: " + telf);
            f.println("PRECIO TOTAL: " + precio + " euros");

        } catch (Exception ex1) {

            System.out.println(ex1.getMessage());

        } finally {

            f.close();

        }

    }

    public static void fichPartesCoches(ArrayList<APartesCoches> lista) {

        File fich = null;
        PrintWriter f = null;
        try {
            f = new PrintWriter(new File("ApartesCoches.txt"));

            for (APartesCoches z : lista) {

                f.println(z.getNombreParte() + "," + z.getUnidadesParte() + "," + z.getPrecioParte());

            }

        } catch (Exception ex) {

            System.out.println(ex.getMessage());

        } finally {

            f.close();

        }

    }

    public static void fichPartesMotos(ArrayList<APartesMotos> lista) {

        File fich = null;
        PrintWriter f = null;
        try {
            f = new PrintWriter(new File("ApartesMotos.txt"));

            for (APartesMotos z : lista) {

                f.println(z.getNombreParte() + "," + z.getUnidadesParte() + "," + z.getPrecioParte());

            }

        } catch (Exception ex) {

            System.out.println(ex.getMessage());

        } finally {

            f.close();

        }

    }

    public static void fichCoches(ArrayList<ACoches> lista) {

        File fich = null;
        PrintWriter f = null;
        try {
            f = new PrintWriter(new File("Acoches.txt"));

            for (ACoches z : lista) {

                f.println(z.getMatricula() + "," + z.getModelo() + "," + z.getColor() + "," + z.getUnidades() + "," + z.getPrecio());

            }

        } catch (Exception ex) {

            System.out.println(ex.getMessage());

        } finally {

            f.close();

        }

    }

    public static void fichMotos(ArrayList<AMotos> lista) {

        File fich = null;
        PrintWriter f = null;
        try {
            f = new PrintWriter(new File("Amotos.txt"));

            for (AMotos z : lista) {

                f.println(z.getMatricula() + "," + z.getModelo() + "," + z.getColor() + "," + z.getUnidades() + "," + z.getPrecio());

            }

        } catch (Exception ex) {

            System.out.println(ex.getMessage());

        } finally {

            f.close();

        }

    }

}
