import javax.swing.*;
import java.awt.event.*;

public class FileChooserEjemplo extends JFrame {

    private JMenuBar barraMenus;
    private JMenu menuArchivo;
    private JMenuItem menuAbrir, menuSalir;
    private JFileChooser elegirFichero;

    public FileChooserEjemplo() {
        setTitle("Ejemplo JFileChooser");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear barra de menús
        barraMenus = new JMenuBar();
        menuArchivo = new JMenu("Archivo");
        menuAbrir = new JMenuItem("Abrir");
        menuSalir = new JMenuItem("Salir");

        // Agregar elementos al menú
        menuArchivo.add(menuAbrir);
        menuArchivo.addSeparator();  // Separador visual
        menuArchivo.add(menuSalir);
        barraMenus.add(menuArchivo);
        setJMenuBar(barraMenus);

        // Crear JFileChooser
        elegirFichero = new JFileChooser();

        // Acción al hacer clic en "Abrir"
        menuAbrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int resp = elegirFichero.showOpenDialog(FileChooserEjemplo.this);

                if (resp == JFileChooser.APPROVE_OPTION) {
                    JOptionPane.showMessageDialog(null, "Fichero elegido:\n" +
                            elegirFichero.getSelectedFile().toString());
                } else if (resp == JFileChooser.CANCEL_OPTION) {
                    JOptionPane.showMessageDialog(null, "Se pulsó la opción Cancelar");
                }
            }
        });

        // Acción al hacer clic en "Salir"
        menuSalir.addActionListener(e -> System.exit(0));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FileChooserEjemplo().setVisible(true);
        });
    }
}
