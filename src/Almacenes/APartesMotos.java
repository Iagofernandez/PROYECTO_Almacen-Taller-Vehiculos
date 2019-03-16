package Almacenes;

import java.util.ArrayList;
import Escritura_Lectura.*;

/**
 *
 * @author luis-
 */
public class APartesMotos {

    //cambiar nombre clase?
    private String nombreParte;
    private int unidadesParte;
    private float precioParte;

    public static ArrayList<APartesMotos> listaPartesM = new ArrayList<APartesMotos>();

    public APartesMotos() {
    }

    public APartesMotos(String nombreParte, int unidadesParte, float precioParte) {
        this.nombreParte = nombreParte;
        this.unidadesParte = unidadesParte;
        this.precioParte = precioParte;
    }

    //leer al principio y escribir al final
    public static void llenarAlmacenPartesM() {
        //cambiar unidades al acabar
        listaPartesM.add(new APartesMotos("liquidoFrenos", 2, 5.75f));
        listaPartesM.add(new APartesMotos("cascos", 2, 12f));
        listaPartesM.add(new APartesMotos("llantas", 2, 15f));
        listaPartesM.add(new APartesMotos("neumaticos", 2, 17.5f));
        listaPartesM.add(new APartesMotos("guantes", 2, 15f));
        listaPartesM.add(new APartesMotos("puños", 2, 30f));

    }

    public static void escribirFich() {

        Escribir.fichPartesMotos(listaPartesM);

    }

    public String getNombreParte() {
        return nombreParte;
    }

    public int getUnidadesParte() {
        return unidadesParte;
    }

    public float getPrecioParte() {
        return precioParte;
    }

    public void setNombreParte(String nombreParte) {
        this.nombreParte = nombreParte;
    }

    public void setUnidadesParte(int unidadesParte) {
        this.unidadesParte = unidadesParte;
    }

    public void setPrecioParte(float precioParte) {
        this.precioParte = precioParte;
    }

}
