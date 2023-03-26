package JRMS;

public class DepositoVasos {
    private double vasos;
    private double ml;

    public DepositoVasos() {
    }

    public DepositoVasos(double vasos, double ml) {
        this.vasos = vasos;
        this.ml = ml;
    }

    public double getVasos() {
        return vasos;
    }

    public void setVasos(double vasos) {
        if (vasos >= 0 && vasos <= 50)
            this.vasos = vasos;
        else
            System.out.println("No pueden almacenarse tantos vasos");
    }

    public double getMl() {
        return ml;
    }

    public void setMl(double ml) {
        if (ml >= 0 && ml <=200)
            this.ml = ml;
        else
            System.out.println("El vaso se desbordaría");
    }

    @Override
    public String toString() {
        return "DepositoVasos{" +
                "vasos=" + vasos +
                ", ml=" + ml +
                '}';
    }
}
