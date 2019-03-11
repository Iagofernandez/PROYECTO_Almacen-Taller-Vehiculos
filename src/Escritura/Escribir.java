package Escritura;

import java.io.*;

/**
 *
 * @author lvaqueiroperez
 */
public class Escribir {

    public static void pedido(String nombreProducto, int unidades, String direccion, String telf, float precio, String nombreFich) {

        File fich = null;

        PrintWriter f = null;

        try {

            f = new PrintWriter(new File(nombreFich + ".txt"));

            f.println("FACTURA DEL PEDIDO:");
            f.println("");
            f.println("Producto: " + nombreProducto);
            f.println("Unidades: " + unidades);

            f.println("Direccion: " + direccion);
            f.println("Telf: " + telf);
            f.println("PRECIO TOTAL: " + precio+" euros");

        } catch (Exception ex1) {

            System.out.println(ex1.getMessage());

        } finally {

            f.close();

        }

    }

}
