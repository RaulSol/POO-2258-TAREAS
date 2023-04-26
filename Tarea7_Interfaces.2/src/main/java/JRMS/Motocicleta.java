package JRMS;

public class Motocicleta implements Vehiculo{
    private int centímetrosCúbicos;
    private String marca;

    public Motocicleta() {
    }

    public Motocicleta(int centímetrosCúbicos, String marca) {
        this.centímetrosCúbicos = centímetrosCúbicos;
        this.marca = marca;
    }

    public int getCentímetrosCúbicos() {
        return centímetrosCúbicos;
    }

    public void setCentímetrosCúbicos(int centímetrosCúbicos) {
        this.centímetrosCúbicos = centímetrosCúbicos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "centímetrosCúbicos=" + centímetrosCúbicos +
                ", marca='" + marca + '\'' +
                '}';
    }

    public void caballito(){
        System.out.println("Haciendo un caballito en la moto " + this.marca);
    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo la motocicleta " + this.marca);
        return true;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando la motocicleta");
        return true;
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando....");
    }

    @Override
    public void frenar() {
        System.out.println("Has frenado");
    }
}
