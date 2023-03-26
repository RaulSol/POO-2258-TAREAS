package JRMS;

public class DepositoCrema {
    private double capacidad;

    public DepositoCrema() {
    }

    public DepositoCrema(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        if(capacidad >= 0 && capacidad <= 1500)
            this.capacidad = capacidad;
        else
            System.out.println("El depósito no admite tanta crema");
    }

    @Override
    public String toString() {
        return "DepositoCrema{" +
                "capacidad=" + capacidad +
                '}';
    }
}
