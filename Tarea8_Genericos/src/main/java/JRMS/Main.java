package JRMS;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Caja <String> Box = new Caja<>(new String[10]);
        Box.add(0, "Hi");
        Box.add(1, "¿Como?");
        Box.add(2, "Vale");
        Box.add(3, "Adios");
        System.out.println("------ Box1 ------");
        System.out.println(Box);
        System.out.println(" ");

        System.out.println("------ Sin genéricos ------");
        CajaSinGenericos CajaSN = new CajaSinGenericos(new Object[10]);
        CajaSN.add(0,"Hi");
        CajaSN.add(1,"¿Cómo?");
        CajaSN.add(2,"Vale");
        CajaSN.add(3,"Adios");
        System.out.println(CajaSN);
        System.out.println(" ");

        String temp = Box.get(0);
        String temp2 = (String)CajaSN.get(0);

        System.out.println("------ Comida ------");
        Caja<Comida> mandado = new Caja<>(new Comida[6]);
        mandado.add(0,new Comida("Platano",1.5));
        mandado.add(1,new Comida("Manzana",2.0));
        mandado.add(2,new Comida("Cacahuate",0.75));
        mandado.add(3,new Comida("Doritos",0.3));
        mandado.add(4,new Comida("Yakult",0.25));
        mandado.add(5,new Comida("Froot Loops",0.4));
        System.out.println(" ");

        System.out.println("------ Lista Comidas ------");
        ArrayList<Comida> comidas = new ArrayList<>();
        comidas.add(new Comida("Platano",1.5));
        comidas.add(new Comida("Manzana",2.0));
        comidas.add(new Comida("Fresas",1.2));
        comidas.add(new Comida("Platano",1.5));
        comidas.add(new Comida("Manzana",2.0));
        comidas.add(new Comida("Fresas",1.2));
        comidas.add(new Comida("Platano",1.5));
        comidas.add(new Comida("Manzana",2.0));
        comidas.add(new Comida("Fresas",1.2));
        comidas.add(new Comida("Platano",1.5));
        comidas.add(new Comida("Manzana",2.0));
        comidas.add(new Comida("Fresas",1.2));
        System.out.println("Elementos totales: " + comidas.size());
        System.out.println(comidas.get(10));
        comidas.set(10,new Comida("Naranja",3.0));
        System.out.println(" ");

        System.out.println("------ Lista ------");
        comidas.add(6, new Comida("Guayaba",1.5));
        for (Comida comida : comidas){
            System.out.println(comida);
        }
    }
}
