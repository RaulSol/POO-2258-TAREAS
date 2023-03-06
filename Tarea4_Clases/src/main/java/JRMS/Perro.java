package JRMS;

import java.awt.*;

public class Perro {
    private String raza;

    private Color pelaje;

    private float peso;

    private float tamanio;

    private String nombre;

    public Perro(String raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Color getPelaje() {
        return pelaje;
    }

    public void setPelaje(Color pelaje) {
        this.pelaje = pelaje;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", pelaje=" + pelaje +
                ", peso=" + peso +
                ", tamanio=" + tamanio +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public void conocer() {
        System.out.println(nombre + " intenta recordarte");

        if (Math.random() > 0.5)
            System.out.println(nombre + " te conoce");

        else
            System.out.println(nombre + " no te conoce");
    }

    public void acercar(){
        System.out.println("Se acerca a ti");

        if (Math.random() > 0.5)
            System.out.println("Te olfatea");
        else
            System.out.println("Retrocede");
    }

    public void ladrar(){
        if (Math.random() > 0.5)
            System.out.println(nombre + " te ladra");
        else
            System.out.println(nombre + " mira a otro lado");
    }
}