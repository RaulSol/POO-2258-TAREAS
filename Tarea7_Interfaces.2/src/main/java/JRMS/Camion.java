package JRMS;

public class Camion implements Vehiculo {
    private String combustible;
    private double peso;
    private String marca;

    public Camion() {
    }

    public Camion(String combustible, double peso, String marca) {
        this.combustible = combustible;
        this.peso = peso;
        this.marca = marca;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "combustible='" + combustible + '\'' +
                ", peso=" + peso +
                ", marca='" + marca + '\'' +
                '}';
    }

    public void transportar(){
        System.out.println("El camión está listo para transportar algo...");
    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo el camión " + this.marca);
        return Math.random() >= 0.3;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando el camión " + this.marca);
        return true;
    }

    @Override
    public void avanzar() {
        System.out.println("El camión está avanzando...");
    }

    @Override
    public void frenar() {
        System.out.println("Has frenado la " + this.marca);
    }
}
