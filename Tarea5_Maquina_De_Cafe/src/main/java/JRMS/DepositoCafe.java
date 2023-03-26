package JRMS;

public class DepositoCafe {
    private double capacidad;

    public DepositoCafe() {
    }

    public DepositoCafe(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        if (capacidad >= 0 && capacidad <= 1000)
            this.capacidad = capacidad;
        else
            System.out.println("El depósito no admite tanto café");
    }

    @Override
    public String toString() {
        return "DepositoCafe{" +
                "capacidad=" + capacidad +
                '}';
    }
}
