package JRMS;

import JRMS.Modelo.Libro;
import JRMS.Persistencia.DemoLibroDB;
import JRMS.Persistencia.LibroDAO;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        LibroDAO ldao = new LibroDAO();

        try {
            Libro tmp = (Libro)ldao.buscarPorId("1");
            System.out.println(tmp);
            System.out.println("-------------------");
            for (Object libro: ldao.obtenerTodo()){
                System.out.println((Libro)libro);
            }
        }catch (SQLException sqle){
            System.out.println("Error: " + sqle.getMessage());
        }
    }
}