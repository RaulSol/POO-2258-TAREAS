package JRMS;

public class CafeteraDriver {
    public static void main(String[] args) {
        MaquinaDeCafe maquina1 = new MaquinaDeCafe(new DepositoAgua(0), new DepositoCafe(0),
                                 new DepositoCrema(0), new DepositoVasos(0, 0));
        maquina1.getAgua().setCapacidad(5000);
        maquina1.getCafe().setCapacidad(1000);
        maquina1.getCrema().setCapacidad(1500);
        maquina1.getVasos().setVasos(50);
        System.out.println(maquina1);
        maquina1.estadoIngredientes();
        maquina1.americano();
        maquina1.expreso();
        maquina1.capuchino();
        maquina1.estadoIngredientes();
        maquina1.americano();
        maquina1.expreso();
        maquina1.capuchino();
        maquina1.americano();
        maquina1.expreso();
        maquina1.capuchino();
        maquina1.americano();
        maquina1.expreso();
        maquina1.capuchino();
        maquina1.americano();
        maquina1.expreso();
        maquina1.capuchino();
        maquina1.americano();
        maquina1.expreso();
        maquina1.capuchino();
        maquina1.americano();
        maquina1.expreso();
        maquina1.capuchino();
        maquina1.americano();
        maquina1.expreso();
        maquina1.capuchino();
        maquina1.americano();
        maquina1.expreso();
        maquina1.capuchino();
        maquina1.americano();
        maquina1.expreso();
        maquina1.capuchino();
        maquina1.americano();
        maquina1.expreso();
        maquina1.capuchino();
        maquina1.americano();
        maquina1.expreso();
        maquina1.capuchino();
        maquina1.capuchino();
        maquina1.capuchino();
        maquina1.expreso();
        maquina1.estadoIngredientes();

    }
}
