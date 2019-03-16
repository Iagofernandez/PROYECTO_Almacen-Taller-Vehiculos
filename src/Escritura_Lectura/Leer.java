package Escritura_Lectura;

import java.io.*;
import java.util.*;
import Almacenes.*;

/**
 *
 * @author luis-
 */
public class Leer {

    public static ArrayList leerPartesCoches() {

        File fich;

        Scanner read = null;

        ArrayList<APartesCoches> listaPC = new ArrayList<APartesCoches>();

        try {
            read = new Scanner(new File("ApartesCoches.txt")).useDelimiter("\\s*,\\s*");

            String nombreParte1 = read.next();
            int unidadesParte1 = read.nextInt();
            float precioParte1 = read.nextFloat();
            String nombreParte2 = read.next();
            int unidadesParte2 = read.nextInt();
            float precioParte2 = read.nextFloat();
            String nombreParte3 = read.next();
            int unidadesParte3 = read.nextInt();
            float precioParte3 = read.nextFloat();
            String nombreParte4 = read.next();
            int unidadesParte4 = read.nextInt();
            float precioParte4 = read.nextFloat();
            String nombreParte5 = read.next();
            int unidadesParte5 = read.nextInt();
            float precioParte5 = read.nextFloat();
            String nombreParte6 = read.next();
            int unidadesParte6 = read.nextInt();
            float precioParte6 = read.nextFloat();

            APartesCoches obj1 = new APartesCoches(nombreParte1, unidadesParte1, precioParte1);
            listaPC.add(obj1);
            APartesCoches obj2 = new APartesCoches(nombreParte1, unidadesParte1, precioParte1);
            listaPC.add(obj2);
            APartesCoches obj3 = new APartesCoches(nombreParte1, unidadesParte1, precioParte1);
            listaPC.add(obj3);
            APartesCoches obj4 = new APartesCoches(nombreParte1, unidadesParte1, precioParte1);
            listaPC.add(obj4);
            APartesCoches obj5 = new APartesCoches(nombreParte1, unidadesParte1, precioParte1);
            listaPC.add(obj5);
            APartesCoches obj6 = new APartesCoches(nombreParte1, unidadesParte1, precioParte1);
            listaPC.add(obj6);

        } catch (Exception ex) {

            System.out.println(ex.getMessage());

        } finally {

            read.close();

        }

        return listaPC;

    }

}
