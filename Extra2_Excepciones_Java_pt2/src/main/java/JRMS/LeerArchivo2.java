package JRMS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo2 {
    public void leer2(String ruta) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(ruta));
        String line = "";

        while ((line = br.readLine()) != null) {
            System.out.println("Información de " + ruta + ": " + line);
        }
    }

    public void metodoUno(String ruta)throws IOException{
        this.metodoDos(ruta);
    }

    public void metodoDos(String ruta)throws IOException{
        this.leer2(ruta);
    }
}
