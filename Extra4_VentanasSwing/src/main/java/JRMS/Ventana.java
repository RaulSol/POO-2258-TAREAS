package JRMS;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Ventana extends JFrame {
    private JPanel panel1;
    private JButton btn1;
    private JLabel etiquetap1;

    private JPanel panel2;
    private JLabel etiquetap2;

    private JPanel panel3;
    private JComboBox<String> comboBox;

    private JPanel panel4;

    private GridLayout layout;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 600);
        layout = new GridLayout(2, 2);
        this.getContentPane().setLayout(layout);

    //Primer Panel
        panel1 = new JPanel();
        panel1.setBackground(Color.GRAY);
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        btn1 = new JButton("OK!");
        panel1.add(btn1);
        etiquetap1 = new JLabel(".....");
        panel1.add(etiquetap1);
        btn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiquetap1.setText("Presionaste el boton 1!");
            }
        });
        this.getContentPane().add(panel1,0);


    //Segundo Panel
        String urlImagen = "https://i.pinimg.com/564x/b6/b8/e3/b6b8e36c73a89622190c0f67558432e5.jpg";
        panel2 = new JPanel();
        panel2.setBackground(Color.WHITE);
        panel2.setLayout(new FlowLayout());

        //Cargar Imagen
        try{
            URL url = new URL(urlImagen);
            Image imagen = ImageIO.read(url);
            ImageIcon icon = new ImageIcon(imagen);
            etiquetap2 = new JLabel(icon);
            panel2.add(etiquetap2);
            this.getContentPane().add(panel2,1);
        } catch(MalformedURLException e){
            System.out.println("URL no valido");
        } catch (Exception e){
            System.out.println("Error al cargar la imagen");
        }


    //Tercer Panel
        panel3 = new JPanel();
        panel3.setBackground(Color.WHITE);
        this.getContentPane().add(panel3,2);
        panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        String[] elementos = {"Opcion1", "Opcion2", "Opcion3", "Opcion4"};
        comboBox = new JComboBox<>(elementos);
        comboBox.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource().toString());
                System.out.println(comboBox.getSelectedIndex());
            }
        });
        panel3.add(comboBox);
        this.getContentPane().add(panel3, 2);

    //Cuarto Panel

        panel4 = new JPanel();
        panel4.setBackground(Color.GRAY);
        this.getContentPane().add(panel4,3);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setVisible(true);
    }
}
