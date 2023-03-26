package JRMS;

public class DepositoAgua {
    private double capacidad;

    public DepositoAgua() {
    }

    public DepositoAgua(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        if (capacidad >= 0 && capacidad <= 5000)
            this.capacidad = capacidad;
        else
            System.out.println("El depósito de agua no puede almacenar tanta agua");
    }

    @Override
    public String toString() {
        return "DepositoAgua{" +
                "capacidad=" + capacidad +
                '}';
    }
}
