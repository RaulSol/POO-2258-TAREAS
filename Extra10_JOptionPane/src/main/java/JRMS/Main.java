package JRMS;

import JRMS.Controlador.Controlador;
import JRMS.Vista.Ventana;

public class Main {
    public static void main(String[] args) {
        Ventana view = new Ventana("JOptionPane");
        Controlador controller = new Controlador(view);

    }
}