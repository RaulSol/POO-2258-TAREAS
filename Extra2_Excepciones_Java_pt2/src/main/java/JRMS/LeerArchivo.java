package JRMS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    public void leer(String ruta){
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String line = "";
            while ((line = br.readLine()) != null){
                System.out.println("Información de " + ruta + ": " + line);
            }
        } catch (IOException e){
            e.printStackTrace();

        }
    }
}
