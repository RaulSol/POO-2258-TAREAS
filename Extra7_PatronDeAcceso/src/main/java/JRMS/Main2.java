package JRMS;

import JRMS.Controlador.ControladorLibro;
import JRMS.Vista.VentanaLibro;

public class Main2 {
    public static void main(String[] args) {
        VentanaLibro ventana = new VentanaLibro("MVC");
        ControladorLibro controler = new ControladorLibro(ventana);
    }
}
