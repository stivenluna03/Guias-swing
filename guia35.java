import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class guia35 extends JFrame {
    private JDesktopPane panelInterno;

    public guia35() {
        setTitle("Visor de Fotos");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelInterno = new JDesktopPane();
        setContentPane(panelInterno);

        // Menú principal
        JMenuBar menuBar = new JMenuBar();
        JMenu archivoMenu = new JMenu("Archivo");
        JMenu opcionesMenu = new JMenu("Opciones");

        // Opción Cerrar
        JMenuItem cerrarItem = new JMenuItem("Cerrar");
        cerrarItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JInternalFrame ventanaActiva = panelInterno.getSelectedFrame();
                if (ventanaActiva != null) {
                    ventanaActiva.dispose();
                }
            }
        });

        // Opción Info
        JMenuItem infoItem = new JMenuItem("Info");
        infoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JInternalFrame ventanaActiva = panelInterno.getSelectedFrame();
                if (ventanaActiva != null) {
                    String titulo = ventanaActiva.getTitle();
                    JOptionPane.showMessageDialog(null, "Ruta de la imagen: " + titulo);
                }
            }
        });

        // Opción Cerrar Todo
        JMenuItem cerrarTodoItem = new JMenuItem("Cerrar Todo");
        cerrarTodoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JInternalFrame[] ventanas = panelInterno.getAllFrames();
                for (JInternalFrame ventana : ventanas) {
                    ventana.dispose();
                }
            }
        });

        // Opción Cascada
        JMenuItem cascadaItem = new JMenuItem("Cascada");
        cascadaItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JInternalFrame[] ventanas = panelInterno.getAllFrames();
                int x = 0;
                int y = 0;
                for (int i = ventanas.length - 1; i >= 0; i--) {
                    ventanas[i].setSize(200, 150);
                    ventanas[i].setLocation(x, y);
                    x += 30;
                    y += 30;
                }
            }
        });

        archivoMenu.add(cerrarItem);
        archivoMenu.add(cerrarTodoItem);
        opcionesMenu.add(infoItem);
        opcionesMenu.add(cascadaItem);

        menuBar.add(archivoMenu);
        menuBar.add(opcionesMenu);
        setJMenuBar(menuBar);

        // Abrir una ventana interna de ejemplo
        abrirVentanaInterna("Imagen 1", "C:\\ruta\\de\\la\\imagen1.jpg");
    }

    // Método para abrir una ventana interna
    private void abrirVentanaInterna(String titulo, String ruta) {
        VentanaInterna ventana = new VentanaInterna(titulo, ruta);
        panelInterno.add(ventana);
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
}

class VentanaInterna extends JInternalFrame {
    public VentanaInterna(String titulo, String ruta) {
        super(titulo, true, true, true, true);
        setSize(300, 200);
        setTitle(ruta);
    }

    public void setImagen(String camino) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setImagen'");
    }
}

