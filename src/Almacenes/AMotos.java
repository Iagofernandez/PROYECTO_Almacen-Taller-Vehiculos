package Almacenes;

import java.util.*;

/**
 *
 * @author luis-
 */
public class AMotos {

    private String matricula;
    private String modelo;
    private String color;
    private float precio;
    private int unidades;

    public static ArrayList<AMotos> listaMotos = new ArrayList<AMotos>();

    public AMotos() {
    }

    public AMotos(String matricula, String modelo, String color, float precio, int unidades) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.unidades = unidades;
    }

    public void llenarAlmacenM() {

        listaMotos.add(new AMotos("1234P", "Honda Forza 300", "Plata", 5000f, 2));
        listaMotos.add(new AMotos("6655O", "Honda X-ADV", "Blanco", 10000f, 2));
        listaMotos.add(new AMotos("8899Y", "Quadro QV3", "Negro", 7500f, 2));
        listaMotos.add(new AMotos("2233P", "Harley Davidson Street Glide", "Blanco", 29000f, 2));
        listaMotos.add(new AMotos("9514A", "Suzuki Burgman", "Negro", 7000f, 2));
        listaMotos.add(new AMotos("7890B", "Yamaha YS125", "Azul", 2500f, 2));
        listaMotos.add(new AMotos("5545L", "Triumph Bonneville", "Negro", 13000f, 2));

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
        return "AMotos{" + "matricula=" + matricula + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio + ", unidades=" + unidades + '}';
    }

}
