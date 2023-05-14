package JRMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Ventana extends JFrame{
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblGenero;
    private JLabel lblPesoGb;
    private JLabel lblPlataforma;
    private JLabel lblDesarrollador;
    private JTextField txtID;
    private JTextField txtNombre;
    private JTextField txtGenero;
    private JTextField txtPesoGb;
    private JTextField txtPlataforma;
    private JTextField txtDesarrollador;
    private JButton btnAgregar;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private ModeloTablaJuego modelo;
    private ArrayList<VideoJuego> info;
    private JScrollPane scroll;
    private JTable tblTabla;

    public Ventana(String title) throws HeadlessException {
        super(title);

        // Configuración Básica De Ventana
        this.setSize(500,700);
        layout = new GridLayout(2,1);
        this.setLayout(layout);


        // Panel 1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(241, 236, 154));
        lblId = new JLabel("Id:");
        txtID = new JTextField(4);
        lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField(30);
        lblGenero = new JLabel("Genero:");
        txtGenero = new JTextField(15);
        lblPesoGb = new JLabel("Peso:");
        txtPesoGb = new JTextField(10);
        lblPlataforma = new JLabel("Plataforma:");
        txtPlataforma = new JTextField(30);
        lblDesarrollador = new JLabel("Desarrollador:");
        txtDesarrollador = new JTextField(30);
        btnAgregar = new JButton("Agregar Juego");


        panel1.add(lblId);
        panel1.add(txtID);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblGenero);
        panel1.add(txtGenero);
        panel1.add(lblPesoGb);
        panel1.add(txtPesoGb);
        panel1.add(lblPlataforma);
        panel1.add(txtPlataforma);
        panel1.add(lblDesarrollador);
        panel1.add(txtDesarrollador);
        panel1.add(btnAgregar);

        this.getContentPane().add(panel1,0);


        // Panel 2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(138, 246, 212));
        info = new ArrayList<>();
        info.add(new VideoJuego(1, "League of Legends","Moba",
                4.5,"Pc","Blizzard"));
        modelo = new ModeloTablaJuego(info);
        tblTabla = new JTable(modelo);
        scroll = new JScrollPane(tblTabla);
        panel2.add(scroll);


        this.getContentPane().add(panel2,1);


        // Vista, Cierre y Eventos
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.btnAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                VideoJuego nuevo = new VideoJuego();
                nuevo.setId(Integer.parseInt(txtID.getText()));
                nuevo.setNombre(txtNombre.getText());
                nuevo.setGenero(txtGenero.getText());
                nuevo.setPesoGb(Double.parseDouble(txtPesoGb.getText()));
                nuevo.setPlataforma(txtPlataforma.getText());
                nuevo.setDesarrollador(txtDesarrollador.getText());
                modelo.agregarJuego(nuevo);
                tblTabla.updateUI();
            }
        });
    }
}
