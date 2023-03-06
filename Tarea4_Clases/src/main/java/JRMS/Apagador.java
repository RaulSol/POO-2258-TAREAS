package JRMS;

import java.awt.*;

public class Apagador {

    private String marca;

    private Color color;

    private float medida;

    private String lugar;

    private String numero;

    public Apagador(String marca, float medida, String lugar, String numero) {
        this.marca = marca;
        this.medida = medida;
        this.lugar = lugar;
        this.numero = numero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getMedida() {
        return medida;
    }

    public void setMedida(float medida) {
        this.medida = medida;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Apagador{" +
                "marca='" + marca + '\'' +
                ", color=" + color +
                ", medida=" + medida +
                ", lugar='" + lugar + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }

    public boolean estado(){
        System.out.println("El apagador está encendido");
        boolean est = Math.random() > 0.5;
        return  est;
    }

    public void cambio(){
        if (estado()) {
            System.out.println("Has apagado el apagador");
        }
        else
            System.out.println("Has encendido el apagador");
    }

    public void danio(){
        if (Math.random() > 0.5) {
            System.out.println("El apagador se dañó");
        }
        else
            System.out.println("El apagador está funcionando correctamente");
    }
}
