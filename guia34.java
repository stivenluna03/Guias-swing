
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.filechooser.*;
import java.io.*;

public class guia34 extends JFrame {

    private JDesktopPane panelInterno;

    public guia34() {
        super("Visor de Fotos");

        setLayout(new BorderLayout());

        panelInterno = new JDesktopPane();
        panelInterno.setBackground(Color.BLUE);  // Para distinguir el panel

        // Configuración de la ventana principal
        setTitle("Visor de Fotos");
        setSize(800, 600);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panelInterno, BorderLayout.CENTER);

        // Crear barra de menú
        JMenuBar barraMenu = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem abrir = new JMenuItem("Abrir");
        JMenuItem cerrar = new JMenuItem("Cerrar");

        // Agregar opciones al menú
        menuArchivo.add(abrir);
        menuArchivo.add(cerrar);
        barraMenu.add(menuArchivo);
        setJMenuBar(barraMenu);

        // Acción de abrir imagen
        abrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser abrir = new JFileChooser();
                int boton = abrir.showOpenDialog(null);
                if (boton == JFileChooser.APPROVE_OPTION) {
                    String camino = abrir.getSelectedFile().toString();
                    VentanaInterna vi = new VentanaInterna(camino, camino);
                    vi.setResizable(true);
                    vi.setMaximizable(true);
                    vi.setIconifiable(true);
                    vi.setClosable(true);

                    panelInterno.add(vi);
                    vi.setImagen(camino);
                    vi.setTitle(camino);
                    vi.setVisible(true);
                }
            }
        });

        // Acción de cerrar ventana interna
        cerrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JInternalFrame ventanaActiva = panelInterno.getSelectedFrame();
                if (ventanaActiva != null) {
                    ventanaActiva.dispose();
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
}
