package JRMS;

public class MaquinaDeCafe {
    private DepositoAgua agua;
    private DepositoCafe cafe;
    private DepositoCrema crema;
    private DepositoVasos vasos;

    public MaquinaDeCafe() {
    }

    public MaquinaDeCafe(DepositoAgua agua, DepositoCafe cafe, DepositoCrema crema, DepositoVasos vasos) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
    }

    public DepositoAgua getAgua() {
        return agua;
    }

    public void setAgua(DepositoAgua agua) {
        this.agua = agua;
    }

    public DepositoCafe getCafe() {
        return cafe;
    }

    public void setCafe(DepositoCafe cafe) {
        this.cafe = cafe;
    }

    public DepositoCrema getCrema() {
        return crema;
    }

    public void setCrema(DepositoCrema crema) {
        this.crema = crema;
    }

    public DepositoVasos getVasos() {
        return vasos;
    }

    public void setVasos(DepositoVasos vasos) {
        this.vasos = vasos;
    }

    @Override
    public String toString() {
        return "MaquinaDeCafe{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + vasos +
                '}';
    }

    public void estadoIngredientes(){
        System.out.println("------ Revisando el estado de los ingredientes... ------");
        if (getAgua().getCapacidad() >= 100 && getCafe().getCapacidad() >= 14 && getVasos().getVasos() >= 1
            && getCrema().getCapacidad() >= 70){
            System.out.println(".- La maquina contiene los ingredientes mínimos para un café");
        }

        else if (getAgua().getCapacidad() < 100){
            System.out.println("Parece que no tienes agua suficiente");
        }

        else if(getCafe().getCapacidad() < 14){
            System.out.println("Parece que no tienes café suficiente");
        }

        else if(getVasos().getVasos() < 1){
            System.out.println("Parece que no tienes vasos suficientes");
        }

        else if (getCrema().getCapacidad() < 70){
            System.out.println("Parece que no tienes crema suficiente");
        }

        System.out.println("--- Ingredientes Actuales Disponibles ---");
        System.out.println("Agua: " + getAgua().getCapacidad() + " ml");
        System.out.println("Café: " + getCafe().getCapacidad() + " g");
        System.out.println("Crema: " + getCrema().getCapacidad() + " ml");
        System.out.println("Vasos: " + getVasos().getVasos());
    }

    public void americano(){
        System.out.println("Preparando un 'Americano'...");
        if (getAgua().getCapacidad() >= 180 && getCafe().getCapacidad() >= 15 && getVasos().getVasos() >= 1){
            System.out.println(".. El 'Americano' está listo!!");
            getAgua().setCapacidad(getAgua().getCapacidad() - 180);
            getCafe().setCapacidad(getCafe().getCapacidad() - 15);
            getVasos().setVasos(getVasos().getVasos() - 1);
        }
        else
            System.out.println(".. No tienes los ingredientes suficientes para un 'Americano'");
    }

    public void expreso(){
        System.out.println("Preparando un 'Expreso'...");
        if (getAgua().getCapacidad() >= 120 && getCafe().getCapacidad() >= 20 && getVasos().getVasos() >= 1) {
            System.out.println(".. El 'Expreso' está listo!!");
            getAgua().setCapacidad(getAgua().getCapacidad() - 120);
            getCafe().setCapacidad(getCafe().getCapacidad() - 20);
            getVasos().setVasos(getVasos().getVasos() - 1);
        }
        else
            System.out.println("... No tienes los ingredientes suficientes para un 'Expreso'");
    }

    public void capuchino(){
        System.out.println("Preparando un 'Capuchino'...");
        if (getAgua().getCapacidad() >= 100 && getCafe().getCapacidad() >= 14 && getVasos().getVasos() >= 1
        && getCrema().getCapacidad() >= 70){
            System.out.println(".. El 'Capuchino' está listo!!");
            getAgua().setCapacidad(getAgua().getCapacidad() - 100);
            getCafe().setCapacidad(getCafe().getCapacidad() - 14);
            getVasos().setVasos(getVasos().getVasos() - 1);
            getCrema().setCapacidad(getCrema().getCapacidad() - 70);
        }
        else
            System.out.println("... No tienes los ingredientes suficientes para un 'Capuchino'");
    }

}
