package JRMS.Controlador;

import JRMS.Vista.Ventana;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Controlador extends MouseAdapter {
    private Ventana view;

    public Controlador(Ventana view) {
        this.view = view;
        this.view.getBtnMensaje().addMouseListener(this);
        this.view.getBtnEntrada().addMouseListener(this);
        this.view.getBtnOpcion().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == view.getBtnMensaje()){
            ImageIcon icono = new ImageIcon("Dinamite.png");
            JOptionPane.showMessageDialog(view,
                    "Saluda el controlador",
                    "Titulo",
                    JOptionPane.INFORMATION_MESSAGE,
                    icono);
        }
        if (e.getSource() == view.getBtnEntrada()){
            String datos =JOptionPane.showInputDialog(view,
                    "Ejemplo de entrada",
                    "Title",
                    JOptionPane.WARNING_MESSAGE);
            this.view.getLblResultado().setText(datos);

        }
        if (e.getSource() == view.getBtnOpcion()){
            int respuesta = JOptionPane.showConfirmDialog(view,
                    "¿Quieres eliminar este elemento?",
                    "Confirmacion",
                    JOptionPane.YES_NO_OPTION);


            if (respuesta == JOptionPane.YES_NO_OPTION){
                this.view.getLblResultado().setText("Eliminado");
            }else {
                this.view.getLblResultado().setText("Elemento no eliminado");
            }
        }
    }
}
