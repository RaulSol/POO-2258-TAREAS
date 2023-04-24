package JRMS.Interfaces;

public class Circulo implements Figura {
    private double radio;
    private double pi = 3.1416;

    public Circulo() {
    }

    public Circulo(double radio, double pi) {
        this.radio = radio;
        this.pi = pi;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", pi=" + pi +
                '}';
    }

    @Override
    public double calcularArea() {
        return this.pi * this.radio * this.radio;
    }
}
