package JRMS.Vista;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JButton btnMensaje;
    private JButton btnEntrada;
    private JButton btnOpcion;
    private JLabel lblResultado;
    public JButton getBtnMensaje() {
        return btnMensaje;
    }

    public void setBtnMensaje(JButton btnMensaje) {
        this.btnMensaje = btnMensaje;
    }

    public JButton getBtnEntrada() {
        return btnEntrada;
    }

    public void setBtnEntrada(JButton btnEntrada) {
        this.btnEntrada = btnEntrada;
    }

    public JButton getBtnOpcion() {
        return btnOpcion;
    }

    public void setBtnOpcion(JButton btnOpcion) {
        this.btnOpcion = btnOpcion;
    }

    public JLabel getLblResultado() {
        return lblResultado;
    }

    public void setLblResultado(JLabel lblResultado) {
        this.lblResultado = lblResultado;
    }
    public Ventana(String title) throws HeadlessException {
        //Inicio
        this.setSize(450,200);
        this.setLayout(new GridLayout());

        //Elementos
        btnMensaje = new JButton("Mensaje");
        btnEntrada = new JButton("Entrada");
        btnOpcion = new JButton("Opcion");
        lblResultado = new JLabel("...");

        //inicialización del Layout
        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(btnMensaje);
        this.getContentPane().add(btnEntrada);
        this.getContentPane().add(btnOpcion);
        this.getContentPane().add(lblResultado);




        //Vista y otros
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }


}
