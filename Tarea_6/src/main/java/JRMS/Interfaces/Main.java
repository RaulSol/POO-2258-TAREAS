package JRMS.Interfaces;

public class Main {
    public static void main(String[] args) {
        Cuadrado square = new Cuadrado();
        square.setLado(8);
        System.out.println("--- Cuadrado ---");
        System.out.println("Lado: " + square.getLado());
        System.out.println("Area: " + square.calcularArea());

        Circulo circle = new Circulo();
        circle.setRadio(7);
        System.out.println("--- Circulo ---");
        System.out.println("Radio: " + circle.getRadio());
        System.out.println("Area: " + circle.calcularArea());
    }
}
