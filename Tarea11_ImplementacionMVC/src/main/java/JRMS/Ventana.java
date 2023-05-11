package JRMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Ventana extends JFrame{
    private JLabel lblName;
    private JTextField txtName;
    private JButton btn;
    private JComboBox combo;
    private NombreModeloCombo model;

    public Ventana(String title) throws HeadlessException {
        super(title);


        // ORGANIZACIÓN DE LOS DATOS EN LA VENTANA

        this.setSize(400,400);
        setLayout(new FlowLayout());
        lblName = new JLabel("Ingrese el nombre:");
        this.getContentPane().add(lblName);
        txtName = new JTextField(30);
        this.getContentPane().add(txtName);
        btn = new JButton("Agregar");
        this.getContentPane().add(btn);


        // CONFIGURACIÓN DEL MODELO

        model = new NombreModeloCombo();
        model.agregarNombre("Diana");
        model.agregarNombre("Diego");
        model.agregarNombre("Susana");
        combo = new JComboBox(model);
        this.getContentPane().add(combo);

        combo.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(combo.getSelectedIndex());
                System.out.println(combo.getSelectedItem());
                JOptionPane.showMessageDialog(null, "Hola " + combo.getSelectedItem());
            }
        });


        // CONFIGURACIÓN DEL BOTÓN AL HACER CLICK

        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String nuevo = txtName.getText();
                model.agregarNombre(nuevo);
                txtName.setText("");
            }
        });


        // VISIBILIDAD Y CIERRE DE VENTANA

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
