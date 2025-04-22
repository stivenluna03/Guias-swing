import javax.swing.*;
import java.awt.*;

public class ScrollPaneEjemplos extends JFrame {

    public ScrollPaneEjemplos() {
        setTitle("Ejemplos con JScrollPane");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane pestañas = new JTabbedPane();

        // Pestaña 1: Imagen con JScrollPane
        pestañas.addTab("Imagen", crearPanelImagen());

        // Pestaña 2: Panel de Datos con JScrollPane
        pestañas.addTab("Panel de Datos", crearPanelDatos());

        getContentPane().add(pestañas);
    }

    private JPanel crearPanelImagen() {
        JPanel panel = new JPanel(new BorderLayout());

        JLabel etiImagen = new JLabel();
        ImageIcon imagen = new ImageIcon("C:/Users/TuUsuario/Pictures/Nenúfares.jpg"); // Cambia la ruta
        etiImagen.setIcon(imagen);

        JScrollPane scpImagen = new JScrollPane(etiImagen);
        panel.add(scpImagen, BorderLayout.CENTER);

        return panel;
    }

    private JPanel crearPanelDatos() {
        JPanel panel = new JPanel(new BorderLayout());

        JPanel panelDatos = new JPanel();
        panelDatos.setBackground(Color.GREEN);
        panelDatos.setLayout(null); // Layout manual

        JLabel titulo = new JLabel("Panel de Datos");
        titulo.setBounds(10, 10, 200, 25);
        panelDatos.add(titulo);

        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        for (int i = 0; i < dias.length; i++) {
            JLabel etiqueta = new JLabel(dias[i]);
            etiqueta.setBounds(10, 50 + i * 40, 80, 25);
            JTextField campo = new JTextField();
            campo.setBounds(100, 50 + i * 40, 200, 25);
            panelDatos.add(etiqueta);
            panelDatos.add(campo);
        }

        panelDatos.setPreferredSize(new Dimension(400, 400));
        JScrollPane scpDatos = new JScrollPane(panelDatos);
        panel.add(scpDatos, BorderLayout.CENTER);

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ScrollPaneEjemplos().setVisible(true));
    }
}
