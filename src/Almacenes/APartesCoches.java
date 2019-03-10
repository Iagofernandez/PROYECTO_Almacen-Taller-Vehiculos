package Almacenes;

import java.util.ArrayList;

/**
 *
 * @author luis-
 */
public class APartesCoches {

    //cambiar nombre clase?
    private String nombreParte;
    private int unidadesParte;
    private float precioParte;

    public static ArrayList<APartesCoches> listaPartesC = new ArrayList<APartesCoches>();

    public APartesCoches() {
    }

    public APartesCoches(String nombreParte, int unidadesParte, float precioParte) {
        this.nombreParte = nombreParte;
        this.unidadesParte = unidadesParte;
        this.precioParte = precioParte;
    }

    public void llenarAlmacenPartesC() {
        //cambiar unidades al acabar
        listaPartesC.add(new APartesCoches("liquidoFrenos", 2, 5.75f));
        listaPartesC.add(new APartesCoches("cinturones", 2, 4f));
        listaPartesC.add(new APartesCoches("llantas", 2, 15f));
        listaPartesC.add(new APartesCoches("neumaticos", 2, 17.5f));
        listaPartesC.add(new APartesCoches("radios", 2, 23f));
        listaPartesC.add(new APartesCoches("altavoces", 2, 30f));

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
