package JRMS;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        LeerArchivo lectura = new LeerArchivo();
        System.out.println("------- Leer 1 -------");
        lectura.leer("datos.txt");
        System.out.println(" ");


        LeerArchivo2 lectura2 = new LeerArchivo2();
        System.out.println("------- Leer 2 -------");
        try {
            lectura2.leer2("datos.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(" ");


        System.out.println("------- USO DE MÉTODOS -------");
        try {
            lectura2.metodoUno("datos.txt");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}