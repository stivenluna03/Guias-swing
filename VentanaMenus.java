import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaMenus extends JFrame {
    private JMenuBar barraMenus;
    private JMenu menuArchivo, menuEdicion, menuColores;
    private JMenuItem menuItemAbrir, menuItemGuardar, menuItemSalir;
    private JMenuItem menuItemRojo, menuItemVerde, menuItemAzul;

    public VentanaMenus() {
        setTitle("Ventana con Menús");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        crearBarraMenus();
    }

    private void crearBarraMenus() {
        barraMenus = new JMenuBar();

        // Menú Archivo
        menuArchivo = new JMenu("Archivo");
        menuItemAbrir = new JMenuItem("Abrir");
        menuItemGuardar = new JMenuItem("Guardar");
        menuItemSalir = new JMenuItem("Salir");

        menuItemSalir.addActionListener(e -> System.exit(0));

        menuArchivo.add(menuItemAbrir);
        menuArchivo.add(menuItemGuardar);
        menuArchivo.addSeparator();
        menuArchivo.add(menuItemSalir);

        // Menú Edición
        menuEdicion = new JMenu("Edición");
        menuColores = new JMenu("Colores");

        menuItemRojo = new JMenuItem("Rojo");
        menuItemVerde = new JMenuItem("Verde");
        menuItemAzul = new JMenuItem("Azul");

        menuItemRojo.addActionListener(e -> getContentPane().setBackground(Color.RED));
        menuItemVerde.addActionListener(e -> getContentPane().setBackground(Color.GREEN));
        menuItemAzul.addActionListener(e -> getContentPane().setBackground(Color.BLUE));

        menuColores.add(menuItemRojo);
        menuColores.add(menuItemVerde);
        menuColores.add(menuItemAzul);

        menuEdicion.add(menuColores);

        barraMenus.add(menuArchivo);
        barraMenus.add(menuEdicion);

        setJMenuBar(barraMenus);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VentanaMenus().setVisible(true);
        });
    }
}

