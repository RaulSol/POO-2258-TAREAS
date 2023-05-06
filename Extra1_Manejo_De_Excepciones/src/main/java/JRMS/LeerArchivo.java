package JRMS;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {
        String ruta = "JRMS/datos.txt";
        try{
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
        } catch (FileNotFoundException fnfe){
            System.out.println("No se ha encontrado el archivo");
            System.out.println(fnfe.getMessage());
        }
    }

}
