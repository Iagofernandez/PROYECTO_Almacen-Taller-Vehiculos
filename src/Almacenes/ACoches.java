package Almacenes;

import java.util.ArrayList;

/**
 *
 * @author luis-
 */
public class ACoches {

    private String matricula;
    private String modelo;
    private String color;
    private float precio;
    private int unidades;
    //UTILIZAMOS ARRAYLISTS PUBLIC STATIC PARA NO TENER QUE ESTAR CREANDO OBJETOS SIEMPRE
    public static ArrayList<ACoches> listaCoches = new ArrayList<ACoches>();

    public ACoches() {
    }

    public ACoches(String matricula, String modelo, String color, float precio, int unidades) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.unidades = unidades;
    }

    public void llenarAlmacenC() {

        listaCoches.add(new ACoches("8844U", "Ford Mustang", "Naranja", 15000f, 2));
        listaCoches.add(new ACoches("3322Z", "Audi A4", "Negro", 17000f, 2));
        listaCoches.add(new ACoches("1177A", "Bmw Z4", "Rojo", 29000f, 2));
        listaCoches.add(new ACoches("0066G", "Jeep Wrangler ", "Rojo", 20000f, 2));
        listaCoches.add(new ACoches("1234D", "Opel Corsa", "Rojo", 5000f, 2));
        listaCoches.add(new ACoches("6589P", "Nissan Micra", "Naranja", 15000f, 2));

    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public float getPrecio() {
        return precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "\n"+modelo + " | COLOR: " + color + "| PRECIO: " + precio + "| UNIDADES: " + unidades + "|\n";
    }

}
