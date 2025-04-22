import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaHerramientas extends JFrame {
    private JToolBar barraHerramientas;
    private JButton btnUno, btnDos, btnTres, btnCuatro;

    public VentanaHerramientas() {
        setTitle("Ventana con Herramientas");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        crearBarraHerramientas();
    }

    private void crearBarraHerramientas() {
        barraHerramientas = new JToolBar();

        btnUno = new JButton("Uno");
        btnUno.addActionListener(e ->
            JOptionPane.showMessageDialog(null, "Activaste el botón Uno")
        );

        btnDos = new JButton();
        btnDos.setToolTipText("Botón Dos con ícono");
        btnDos.setIcon(new ImageIcon("icono_dos.gif")); // Asegúrate de tener este archivo

        btnTres = new JButton("Tres");
        btnTres.addActionListener(e -> System.out.println("Botón Tres presionado"));

        btnCuatro = new JButton("Cuatro");
        btnCuatro.addActionListener(e -> System.out.println("Botón Cuatro presionado"));

        barraHerramientas.add(btnUno);
        barraHerramientas.add(btnDos);
        barraHerramientas.add(btnTres);
        barraHerramientas.add(btnCuatro);

        add(barraHerramientas, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VentanaHerramientas().setVisible(true);
        });
    }
}
