import javax.swing.*;
import java.awt.event.*;

public class VentanaPrincipal extends JFrame implements ActionListener {

    JLabel etiNombre, etiCiudad;
    JButton btnOcultarNombre, btnVisuNombre, btnOcultarCiudad, btnVisuCiudad;

    public VentanaPrincipal() {
        setLayout(null);
        setTitle("Ejercicio 1");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        etiNombre = new JLabel("Tu Nombre");
        etiNombre.setBounds(50, 30, 150, 30);
        add(etiNombre);

        etiCiudad = new JLabel("Tu Ciudad");
        etiCiudad.setBounds(50, 70, 150, 30);
        add(etiCiudad);

        btnOcultarNombre = new JButton("Ocultar Nombre");
        btnOcultarNombre.setBounds(220, 30, 150, 30);
        btnOcultarNombre.addActionListener(this);
        add(btnOcultarNombre);

        btnVisuNombre = new JButton("Visualizar Nombre");
        btnVisuNombre.setBounds(220, 70, 150, 30);
        btnVisuNombre.addActionListener(this);
        add(btnVisuNombre);

        btnOcultarCiudad = new JButton("Ocultar Ciudad");
        btnOcultarCiudad.setBounds(220, 110, 150, 30);
        btnOcultarCiudad.addActionListener(this);
        add(btnOcultarCiudad);

        btnVisuCiudad = new JButton("Visualizar Ciudad");
        btnVisuCiudad.setBounds(220, 150, 150, 30);
        btnVisuCiudad.addActionListener(this);
        add(btnVisuCiudad);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOcultarNombre) {
            etiNombre.setVisible(false);
        } else if (e.getSource() == btnVisuNombre) {
            etiNombre.setVisible(true);
        } else if (e.getSource() == btnOcultarCiudad) {
            etiCiudad.setVisible(false);
        } else if (e.getSource() == btnVisuCiudad) {
            etiCiudad.setVisible(true);
        }
    }

    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
}
